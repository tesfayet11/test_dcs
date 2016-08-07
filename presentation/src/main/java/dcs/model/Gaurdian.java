package dcs.model;

import java.util.List;

public class Gaurdian {
	
	private long gaurdianId;
	private String firstName;
	private String lastName;
	private String email;
	private String phonenumber;
	
	private List<Student> students;
	
	private Address address;
	
	public long getGaurdianId() {
		return gaurdianId;
	}
	public void setGaurdianId(long gaurdianId) {
		this.gaurdianId = gaurdianId;
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
	public List<Student> getStudents() {
		return students;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
}
