package org.Hospital.admin.model;

public class RecepModel {
	private int rid;
	private String rname;
	private String email;
	private String Contact;
	public RecepModel() {
		
	}
	public RecepModel(String rname,int rid) {
		this.rid=rid;
		this.rname=rname;
	}
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	
	}
