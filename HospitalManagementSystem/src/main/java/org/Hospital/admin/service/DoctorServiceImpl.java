package org.Hospital.admin.service;

import java.util.List;

import org.Hospital.admin.config.DBConfig;
import org.Hospital.admin.model.doctormodel;
import org.Hospital.admin.repository.*;
public class DoctorServiceImpl implements DoctorService{
	DoctorRepo dr=new DoctorRepoImpl();
	public boolean isAddDoctor(doctormodel dModel) {
		return dr.isAddDoctor(dModel);
	}
	public List<doctormodel> isviewDoctor(){
		return dr.isviewDoctor();
	}
	public boolean isDeleteDoctor(int id) {
		return dr.isDeleteDoctor(id);
	}
	public boolean isupdateDoctor(int id,String name,String contact,String email,String category) {
		return dr.isupdateDoctor(id, name, contact,email, category);
	}
	@Override
	public int isDoctorLogin(String email,String contact) {
		return dr.isDoctorLogin(email,contact);
	}
	@Override
	public List<Object[]> isviewdoctorwisepatient(int pid) {
		return dr.isviewdoctorwisepatient(pid);
	}
	@Override
	public List<Object[]> isviewmedicine() {
		// TODO Auto-generated method stub
		return dr.isviewmedicine();
	}
	@Override
	public boolean isdeleteMedicine(int pid, String mname) {
		// TODO Auto-generated method stub
		return dr.isdeleteMedicine(pid, mname);
	}
	@Override
	public List<Object[]> isviewbill() {
		// TODO Auto-generated method stub
		return dr.isviewbill();
	}
	
	

}
