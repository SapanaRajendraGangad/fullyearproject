package org.Hospital.admin.model;

public class PatientModel {
	private int id;
	private String name, address;
	private String contact, gender;
	private int age;
	private String pdate;
	private String ptype;
	private String category;
	private String status;
	
	public PatientModel() {

	}
 	public PatientModel(String name, String add, String con, String gender, int age, String pdate,String ptype,String category,String status) {
		this.status= status;
		this.name = name;
		this.address = add;
		this.contact = con;
		this.gender = gender;
		this.age = age;
		this.pdate = pdate;
		this.ptype=ptype;
		this.category=category;
	}
	

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPdate() {
		return pdate;
	}

	public void setPdate(String pdate) {
		this.pdate = pdate;
	}
	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

