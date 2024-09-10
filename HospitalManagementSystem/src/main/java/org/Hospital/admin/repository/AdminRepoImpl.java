package org.Hospital.admin.repository;

import org.Hospital.admin.config.DBConfig;
import org.Hospital.admin.model.adminModel;

public class AdminRepoImpl extends DBConfig implements AdminRepo{
	public boolean isUserPresent(adminModel model)
	{
		try {
			
			stmt=conn.prepareStatement("select *from admin where username=? and password=?");
			stmt.setString(1, model.getUserName());
			stmt.setString(2, model.getPassword());
			rs=stmt.executeQuery();
			return rs.next()?true:false;
			
		}catch(Exception ex)
		{
			System.out.println("error in login "+ex);
			return false;
		}
	}
}