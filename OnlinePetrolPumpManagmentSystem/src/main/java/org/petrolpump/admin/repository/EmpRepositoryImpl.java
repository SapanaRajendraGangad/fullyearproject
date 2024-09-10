package org.petrolpump.admin.repository;

import java.util.List;

import org.petrolpump.admin.config.DBConfig;
import org.petrolpumpsystem.model.EmployeeModel;
import java.util.*;
public class EmpRepositoryImpl extends DBConfig implements EmpRepository {
	List<EmployeeModel> list;

	public int getEmpId() {
		int mid=0;
	try {
		stmt=conn.prepareStatement("select max(eid)from employee");
		rs=stmt.executeQuery();
		if(rs.next()) {
			mid=rs.getInt(1);
		}
		return ++mid;
	}
	catch(Exception ex) {
		System.out.println("Exception occur in autoid increament logic\t"+ex);
		return -1;
	}
	}
	@Override
	public boolean isAddEmployee(EmployeeModel model) {
		int mid=this.getEmpId();
		try {
			stmt=conn.prepareStatement("insert into employee value(?,?,?,?,?,?)");
			stmt.setInt(1, mid);
			stmt.setString(2, model.getName());
			stmt.setString(3, model.getEmail());
			stmt.setString(4, model.getContact());
			stmt.setString(5, model.getAddress());
			stmt.setInt(6, model.getSal());
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex) {
			System.out.println("error in Employee repository "+ex);
			return false;

		}
	}
		@Override
	public List<EmployeeModel> getAllEmployee() {
		try {
			list=new ArrayList<EmployeeModel>();
			stmt=conn.prepareStatement("select *from employee");
			rs=stmt.executeQuery();
			while(rs.next()) {
				EmployeeModel emp=new EmployeeModel();
				emp.setId(rs.getInt("eid"));
				emp.setName(rs.getString("ename"));
				emp.setEmail(rs.getString("email"));
				emp.setContact(rs.getString("contact"));
				emp.setAddress(rs.getString("address"));
				emp.setSal(rs.getInt("salary"));
				list.add(emp);
			}
			return list.size()>0?list:null;
		}
		catch(Exception ex) {
			System.out.println("erreor is"+ex);
			return null;

		}
	}
		@Override
		public boolean allocateMachine(int eid, int mid, String... x) {
			try {
				stmt=conn.prepareStatement("insert into empmachinejoin values(?,?,?,?,?)");
				stmt.setInt(1, eid);
				stmt.setInt(2, mid);
				stmt.setString(3, x[0]);
				stmt.setString(4, x[1]);
				String split[]=x[2].split("-");
				java.sql.Date d=new java.sql.Date((Integer.parseInt(split[0])-1900),Integer.parseInt(split[1]),Integer.parseInt(split[2]));
				stmt.setDate(5, d);
				int value=stmt.executeUpdate();
				return value>0?true:false;
			}
			catch(Exception ex) {
				System.out.println("error is empRepo "+ex);
				return false;
			}
		}
		@Override
		public int VerifyEmployee(String email, String contact) {
			try {
				stmt=conn.prepareStatement("select * from employee where email=? and contact=?");
				stmt.setString(1, email);
				stmt.setString(2, contact);
				rs=stmt.executeQuery();
				if(rs.next()) {
					return rs.getInt(1);
				}
				else {
					return 0;
				}
			}
			catch(Exception ex) {
				System.out.println("Error is"+ex);
				return 0;
			}
		}

}
