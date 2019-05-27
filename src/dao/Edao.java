package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Employee;

public class Edao {

	/*public static void main(String[] args) {


	}
*/
	private Connection con;

	private static final String FIND_ALL_SQL =
			"SELECT *"
			+"FROM employees";


	public Edao(Connection con)
	{
		super();
		this.con = con;
	}


	public List<Employee> findAll() throws SQLException
	{
		List<Employee> eList = new ArrayList<Employee>();

		PreparedStatement stmt = con.prepareStatement( FIND_ALL_SQL );
		ResultSet rs= stmt.executeQuery();

		Employee emp = null;
		while( rs.next() )
		{
			emp = new Employee();
			emp.setEmployeeID( 		rs.getInt( "EmployeeID" ) 						);
			emp.setEmployeeName(	rs.getString(		"employeeName" ) 			);
			emp.seteMail(			rs.getString(		"eMail" )					);
			emp.setWeight(			rs.getBigDecimal(	"weight" )					);
			emp.setHireFiscalYear(	rs.getInt(			"hireFiscalYear" )			);
			emp.setBirthday(		rs.getDate(			"birthday" ).toLocalDate()	);
			emp.setBloodType(		rs.getString(		"bloodType")				);

			eList.add( emp );
		}


		return eList;
	}

	}


