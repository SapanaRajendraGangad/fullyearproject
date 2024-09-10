package org.petrolpump.admin.service;

import org.petrolpumpsystem.model.EmployeeModel;

import java.util.List;

import org.petrolpump.admin.repository.*;
public class EmpServiceImpl implements EmpServise{
	EmpRepository emprepo=new EmpRepositoryImpl();
	@Override
	public boolean isAddNewEmployee(EmployeeModel model) {
		return emprepo.isAddEmployee(model) ;
	}
	public List<EmployeeModel> getAllEmployee(){
		return emprepo.getAllEmployee();
	}
	@Override
	public boolean allocateMachine(int eid, int mid, String... x) {
		return emprepo.allocateMachine(eid, mid, x);
	}
	@Override
	public int VerifyEmployee(String email, String contact) {
		return emprepo.VerifyEmployee(email, contact);
	}
	

}
