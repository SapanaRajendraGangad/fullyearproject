package org.Hospital.admin.service;

import java.util.List;

import org.Hospital.admin.model.PatientModel;
import org.Hospital.admin.model.doctormodel;
import org.Hospital.admin.repository.PatientRepo;
import org.Hospital.admin.repository.PatientRepoImpl;

public class PatientServiceImpl implements PatientService{
	PatientRepo ptr=new PatientRepoImpl();

	@Override
	public boolean isAddPatient(PatientModel pmodel) {
		return ptr.isAddPatient(pmodel)?true:false;
		
	}

	@Override
	public List<PatientModel> isViewPatient() {
		return ptr.isViewPatient();
	}

	@Override
	public boolean isDeletePatient(int id) {
		// TODO Auto-generated method stub
		return ptr.isDeletePatient(id)?true:false;
	}

	@Override
	public boolean isUpdatePatient(PatientModel model) {
		// TODO Auto-generated method stub
		return ptr.isUpdatePatient(model)?true:false;
	}

	@Override
	public List<Object[]> ispatientdctor() {
		// TODO Auto-generated method stub
		return ptr.ispatientdctor();
	}

	@Override
	public List<Object[]> isviewpatientdctor(doctormodel dm) {
		// TODO Auto-generated method stub
		return ptr.isviewpatientdctor(dm);
	}

	@Override
	public boolean addPrescription(int did, int pid, String Mname) {
		// TODO Auto-generated method stub
		return ptr.addPrescription(did, pid, Mname);
	}

	@Override
	public boolean isdeleteBill(int pid) {
		// TODO Auto-generated method stub
		return ptr.isdeleteBill(pid);
	}

	@Override
	public boolean isloginpatient(String email, String pass) {
		// TODO Auto-generated method stub
		return ptr.isloginpatient(email, pass);
	}

}
