package org.Hospital.admin.model;

public class BillModel {
	private int pid;
private int doctor_fees;
private int Room_fees;
private int total;
private String Date;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public int getDoctor_fees() {
	return doctor_fees;
}
public void setDoctor_fees(int doctor_fees) {
	this.doctor_fees = doctor_fees;
}
public int getRoom_fees() {
	return Room_fees;
}
public void setRoom_fees(int room_fees) {
	Room_fees = room_fees;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public String getDate() {
	return Date;
}
public void setDate(String date) {
	Date = date;
}
}
