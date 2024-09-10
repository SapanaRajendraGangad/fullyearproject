package org.Hospital.admin.service;

import java.util.List;

import org.Hospital.admin.model.doctormodel;

public interface DoctorService {
	public int isDoctorLogin(String email,String contact);
	public boolean isAddDoctor(doctormodel dModel);
	public List<doctormodel> isviewDoctor();
	public boolean isDeleteDoctor(int id);
	public List<Object[]> isviewdoctorwisepatient(int pid);
	public boolean isupdateDoctor(int id,String name,String contact,String email,String category);
	public List<Object[]> isviewmedicine();
	public boolean isdeleteMedicine(int pid,String mname);
	public List<Object[]> isviewbill();
}
