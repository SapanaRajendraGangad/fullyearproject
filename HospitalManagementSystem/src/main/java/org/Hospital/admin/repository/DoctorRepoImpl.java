package org.Hospital.admin.repository;

import java.util.ArrayList;
import java.util.List;
import org.Hospital.admin.model.*;
import org.Hospital.admin.config.DBConfig;

public class DoctorRepoImpl extends DBConfig implements DoctorRepo {
	
	List<doctormodel>list=new ArrayList<doctormodel>();
	private int getDoctorId()
	{ int dId=0;
		try {
			stmt=conn.prepareStatement("select max(did)from doctor");
			rs=stmt.executeQuery();
			if(rs.next())
			{
				dId=rs.getInt(1);
				 
			}
			return ++dId;
		}
		catch(Exception ex)
		{
			System.out.println("error is"+ex);
			return 0;
		}
		
		
	}
	public int isDoctorLogin(String email ,String contact) {
		try {
			stmt=conn.prepareStatement("select did from doctor where email=? and contact=?");
			stmt.setString(1, email);
			stmt.setString(2, contact);
			rs=stmt.executeQuery();
	if(rs.next()) {
		return rs.getInt(1);
		
	}
	
	else{
		return 0;
	}
		}
		catch(Exception ex) {
			System.out.println("Error in repository of doctor login "+ex.getMessage());
			return 0;
		}
	}
	public boolean isAddDoctor(doctormodel dModel)
	{
		try {
		int qid=this.getDoctorId();
			if(qid!=0) {
			stmt=conn.prepareStatement("insert into doctor values(?,?,?,?,?,?)");
			stmt.setInt(1, qid);
			stmt.setString(2, dModel.getName());
			stmt.setString(3, dModel.getContact());
			stmt.setString(4, dModel.getEmail());
			stmt.setString(5, dModel.getCategory());
			stmt.setString(6, dModel.getTime());
			int value=stmt.executeUpdate();
			if(value>0)
			{
				return true;				}
			else {
				return false;
			}
			}
			else {
				return false;
			}

	}
		catch(Exception ex)
		{
			System.out.println("error is"+ex);
			return false;
		}
}
	public List<Object[]> isviewmedicine(){
		List<Object[]> listm=new ArrayList<Object[]>();
		try {
			stmt=conn.prepareStatement(" select p.pname,p.address,p.pdate,d.dname,p.age,dpm.Mname,p.pid,d.did from doctor d inner join doctorpatientmedicinejoin dpm on d.did=dpm.did inner join patient p on p.pid=dpm.pid");
			rs=stmt.executeQuery();
			while(rs.next()) {
				Object obj[]=new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getInt(7),rs.getInt(8)};
				listm.add(obj);
			}
			return listm.size()>0?listm:null;
		}
		catch(Exception ex) {
			System.out.println("Exception in doctor reception "+ex);
			return null;
		}
	}
	public List<Object[]> isviewbill(){
		List<Object[]> listb=new ArrayList<Object[]>();
		try {
			stmt=conn.prepareStatement("select p.pname,b.date,b.doctor_fees,b.Room_Fees,b.Total,b.pid from bill b inner join patient p on b.pid=p.pid");
			rs=stmt.executeQuery();
			while(rs.next()) {
				System.out.println("name is"+rs.getString(1));
				Object obj[]=new Object[] {rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6)};
				listb.add(obj);
			}
			return listb.size()>0?listb:null;
		}
		catch(Exception ex) {
			System.out.println("Exception in doctor reception "+ex);
			return null;
		}
	}
	public boolean isdeleteMedicine(int pid,String mname) {
		try {
			stmt=conn.prepareStatement(" delete from doctorpatientmedicinejoin where pid=? and mname=?");
			stmt.setInt(1, pid);
			stmt.setString(2, mname);
			int value=stmt.executeUpdate();
			return value>0?true:false;
			
		}
		catch(Exception ex) {
			System.out.println("Exception in doctor reception "+ex);
			return false;
		}
	}
	public List<Object[]> isviewdoctorwisepatient(int did){
		List<Object[]> listp=new ArrayList<Object[]>();
		try {
			System.out.println("value of did is"+did);
			stmt=conn.prepareStatement("select p.pname,p.address,p.contact,p.age,p.gender,p.pdate,p.ptype,p.category,p.status,p.pid,d.time from patient p inner join patientdoctorjoin pd on p.pid=pd.pid inner join doctor d on d.did=pd.did where pd.did=?");
			stmt.setInt(1, did);
			rs=stmt.executeQuery();
			while(rs.next()) {
				Object obj[]=new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11)};
				listp.add(obj);
			}
			return listp.size()>0?listp:null;
		}
		catch(Exception ex) {
			System.out.println("error is doctor repository "+ex);
			return null;
		}
	}
	public List<doctormodel> isviewDoctor()
	{
		try {
			stmt=conn.prepareStatement("select *from doctor");
			
			rs=stmt.executeQuery();
			while(rs.next())
			{
				doctormodel dmodel=new doctormodel();
				 dmodel.setId(rs.getInt(1));
				dmodel.setName(rs.getString(2));
				dmodel.setContact(rs.getString(3));
				dmodel.setEmail(rs.getString(4));
				dmodel.setCategory(rs.getString(5));
				dmodel.setTime(rs.getString(6));
				list.add(dmodel);
			}
			return list.size()>0?list:null;
		}
		catch(Exception ex)
		{
			System.out.println("error is"+ex);
			return null;
		}
	}
	
	
	public boolean isDeleteDoctor(int id)
	{
		try {
			stmt=conn.prepareStatement("delete from doctor where did=?");
			stmt.setInt(1, id);
			int value=stmt.executeUpdate();
				if(value>0)
			{
					return true;
			}
				else {
					return false;
				}
		}
		catch(Exception ex)
		{
			System.out.println("error is"+ex);
			return false;
		}
	}
	public boolean isupdateDoctor(int id,String name,String contact,String email,String category)
	{
		try {
			stmt=conn.prepareStatement("update doctor set dname=?,contact=?,email=?,category=? where did=?");
			stmt.setString(1, name);
			stmt.setString(2, contact);
			stmt.setString(3, email);
			stmt.setString(4, category);
			stmt.setInt(5, id);
			int value=stmt.executeUpdate();
			if(value>0)
			{
				return true;
			}
			else {
				return false;
}
		}
		catch(Exception ex)
		{
			System.out.println("error is"+ex); 
		}
		return false;
	}
	
}
