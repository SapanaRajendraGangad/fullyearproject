package org.Hospital.admin.repository;

import java.util.List;

import org.Hospital.admin.model.PatientModel;
import org.Hospital.admin.model.doctormodel;

public interface PatientRepo {
	public boolean isAddPatient(PatientModel pmodel);
	public List<PatientModel> isViewPatient();
	public List<Object[]> ispatientdctor();
	public List<Object[]> isviewpatientdctor(doctormodel dm);
	public boolean isDeletePatient(int id);
	public boolean isUpdatePatient(PatientModel model);
	public boolean addPrescription(int did,int pid,String Mname);
	public boolean isdeleteBill(int pid);
	public boolean isloginpatient(String email,String pass);
}
