package org.petrolpump.admin.repository;

import java.util.List;

import org.petrolpumpsystem.model.EmployeeModel;
import java.util.*;
public interface EmpRepository {
 public boolean isAddEmployee(EmployeeModel model);
	public List<EmployeeModel> getAllEmployee();
	public boolean allocateMachine(int eid,int mid,String ...x);
	public int VerifyEmployee(String email,String contact);

}
