package org.petrolpump.admin.service;
import java.util.List;

import org.petrolpumpsystem.model.*;
public interface EmpServise {
	public boolean isAddNewEmployee(EmployeeModel model);
	public List<EmployeeModel> getAllEmployee();
	public boolean allocateMachine(int eid,int mid,String ...x);
	public int VerifyEmployee(String email,String contact);
}
