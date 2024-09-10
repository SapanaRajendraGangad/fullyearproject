package org.Hospital.admin.model;

public class doctormodel {
	private int id;
	private String name;
	private String contact;
	private String email;
	private String category;
	private String time;
	public doctormodel()
	{
		
	}
	public doctormodel(int id,String name,String contact,String email,String cate,String time)
	{
	this.id=id;
	this.name=name;
	this.contact=contact;
	this.email=email;
	this.category=cate;
	this.time=time;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	}