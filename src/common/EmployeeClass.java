package common;

import java.io.Serializable;

public class EmployeeClass  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int intEmpID;
	transient private String strName;
	private String strLocation;
	
	public int getIntEmpID() {
		return intEmpID;
	}
	public void setIntEmpID(int intEmpID) {
		this.intEmpID = intEmpID;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrLocation() {
		return strLocation;
	}
	public void setStrLocation(String strLocation) {
		this.strLocation = strLocation;
	}
}
