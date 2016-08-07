package dcs.model;

import java.sql.Date;

public class Student {
	
	private long studentId;
	private String firstName;
	private String lastName;
	private Gaurdian guardian;
	private Date dateOfBirth;
	
	
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Gaurdian getGuardian() {
		return guardian;
	}
	public void setGuardian(Gaurdian guardian) {
		this.guardian = guardian;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	

}
