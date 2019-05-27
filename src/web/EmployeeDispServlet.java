package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.EmployeeDispBean;
import service.EmployeeService;

@WebServlet("/Employee_dispServlet")

public class EmployeeDispServlet extends HttpServlet
{
	private static final long serialVersionUID =1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

		    EmployeeService service = new EmployeeService();

		    EmployeeDispBean bean1 =service.getAllEmployee();

			//beanをリクエストにセット
			request.setAttribute("bean", bean1);

			//JSPに遷移
			RequestDispatcher disp = request.getRequestDispatcher("/employeeDisp.jsp");
			disp.forward(request, response);

	}

}