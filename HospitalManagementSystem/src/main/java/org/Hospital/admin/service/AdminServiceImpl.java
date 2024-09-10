package org.Hospital.admin.service;

import org.Hospital.admin.model.adminModel;
import org.Hospital.admin.repository.*;
public class AdminServiceImpl implements AdminService{
	AdminRepo ar=new AdminRepoImpl();
	@Override
	public boolean isUserPresent(adminModel model) {
		
		return ar.isUserPresent(model);
	}

}
