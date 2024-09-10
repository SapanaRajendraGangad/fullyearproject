package org.Hospital.admin.repository;

import java.util.List;

import org.Hospital.admin.model.doctormodel;

public interface DoctorRepo {
	public int isDoctorLogin(String email ,String contact);
	public boolean isAddDoctor(doctormodel dModel);
	public List<doctormodel> isviewDoctor();
	public boolean isDeleteDoctor(int id);
	public List<Object[]> isviewdoctorwisepatient(int did);
	public boolean isupdateDoctor(int id,String name,String email,String contact,String category);
	public List<Object[]> isviewmedicine();
	public boolean isdeleteMedicine(int pid,String mname);
	public List<Object[]> isviewbill();
}
