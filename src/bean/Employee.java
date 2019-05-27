package bean;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee
{
	private String name;
	private int id;
	private  BigDecimal height;
	private String eMail;
	private BigDecimal weight;
	private int hireFiscalYear;
	private LocalDate birthday;
	private String bloodType;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BigDecimal getHeight() {
		return height;
	}
	public void setHeight(BigDecimal height) {
		this.height = height;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public BigDecimal getWeight() {
		return weight;
	}
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
	public int getHireFiscalYear() {
		return hireFiscalYear;
	}
	public void setHireFiscalYear(int hireFiscalYear) {
		this.hireFiscalYear = hireFiscalYear;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}



}