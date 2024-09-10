package org.Hospital.admin.repository;

import java.util.ArrayList;
import java.util.List;

import org.Hospital.admin.config.DBConfig;
import org.Hospital.admin.model.PatientModel;
import org.Hospital.admin.model.doctormodel;

public class PatientRepoImpl extends DBConfig implements PatientRepo{
	private int patientid;
	PatientModel pModel=new PatientModel();
	List<PatientModel> listpatient=new ArrayList<PatientModel>();
	
	private int getPatientId()
	{
		
		try {
			stmt=conn.prepareStatement("select max(pid) from patient");
			rs=stmt.executeQuery();
			if(rs.next())
			{
				patientid=rs.getInt(1);
			}
			++patientid;
		  }
		catch(Exception ex)
		{
			System.out.println("error is "+ex);
			return 0;
		}
		return patientid;
	}
	public int isgetIdofDoctorByCategory(String category)
	{
		try {
			stmt=conn.prepareStatement("select did from doctor where category=?");
			stmt.setString(1, category);
			rs=stmt.executeQuery();
			if(rs.next())
			{
				return rs.getInt(1);
			}
			else {
				return -1;
			}
		}
		catch(Exception ex) {
		System.out.println("error is  "+ex);
		return 0;
		}
	}

	public boolean isAddPatient(PatientModel pmodel) 
	{
		int pid=this.getPatientId();
		try {
		stmt=conn.prepareStatement("insert into patient values(?,?,?,?,?,?,?,?,?,?)");
			stmt.setInt(1, pid);
			stmt.setString(2, pmodel.getName());
			stmt.setString(3, pmodel.getAddress());
			stmt.setString(4, pmodel.getContact());
			stmt.setInt(5, pmodel.getAge());
			stmt.setString(6,pmodel.getGender());
			stmt.setString(7,pmodel.getPdate());
			stmt.setString(8, pmodel.getPtype());
			stmt.setString(9, pmodel.getCategory());
			stmt.setString(10, pmodel.getStatus());
			int value=stmt.executeUpdate();
			if(value>0)
			{
				int did=this.isgetIdofDoctorByCategory(pmodel.getPtype());
				
				if(did!=-1)
				{
					stmt=conn.prepareStatement("insert into patientdoctorjoin values(?,?)");
					stmt.setInt(1, pid);
					stmt.setInt(2, did);
					return stmt.executeUpdate()>0?true:false;

				}
					else if(did==-1){
						System.out.println("doctor  not found");
						return false;
					}
					else {
						System.out.println("some problem is there");
						return false;
					}
			}
			else {
				return false; 	
				}
			}
		catch(Exception ex)
			{
				System.out.println("error in repo     "+ex);
			}
			return false;
		}
	public List<PatientModel> isViewPatient()
	{
		try {
			stmt=conn.prepareStatement("select *from patient");
			rs=stmt.executeQuery();
			while(rs.next()) {
				PatientModel pmodel=new PatientModel();
				pmodel.setId(rs.getInt(1));
				pmodel.setName(rs.getString(2));
				pmodel.setAddress(rs.getString(3));
				pmodel.setContact(rs.getString(4));
				pmodel.setAge(rs.getInt(5));
				pmodel.setGender(rs.getString(6));
				pmodel.setPdate(rs.getString(7));
				pmodel.setPtype(rs.getString(8));
				pmodel.setCategory(rs.getString(9));
				pmodel.setStatus(rs.getString(10));
				listpatient.add(pmodel);
			}
			return listpatient.size()>0?listpatient:null;
		}
		catch(Exception ex)
		{
			System.out.println("Error in patientRepo   "+ex);
			return null;
		}
	}
	public List<Object[]> ispatientdctor(){
		List<Object[]> listp=new ArrayList<Object[]>();
		try {
			
			stmt=conn.prepareStatement("select p.pname,p.address,p.contact,p.age,p.gender,p.pdate,p.ptype,p.category,d.dname,p.pid,d.did,p.status from patient p inner join patientdoctorjoin pj on p.pid=pj.pid inner join doctor d on d.did=pj.did");
			rs=stmt.executeQuery();
			while(rs.next()) {
				
				Object[] obj=new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getInt(11),rs.getString(12)};
				listp.add(obj);
			}
			return listp.size()>0?listp:null;
		}
		catch(Exception ex)
		{
			System.out.println("Error in patientRepo   "+ex);
			return null;
		}
		}
	public boolean addPrescription(int did,int pid,String Mname) {
		try {
			stmt=conn.prepareStatement("insert into doctorpatientmedicinejoin  values(?,?,?)");
			stmt.setInt(1, pid);
			stmt.setInt(2, did);
			stmt.setString(3, Mname);
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex) {
			System.out.println("Error is in doctor Repository"+ex);
			return false;
		}
	}
	public List<Object[]> isviewpatientdctor(doctormodel dm ){
		List<Object[]> listp=new ArrayList<Object[]>();
		try {
			
			stmt=conn.prepareStatement("select p.pname,p.address,p.contact,p.age,p.gender,p.pdate,p.ptype,p.category,d.dname,p.status from patient p inner join patientdoctorjoin pj on p.pid=pj.pid inner join doctor d on d.did=pj.did where d.email=? and d.contact=?");
			stmt.setString(1, dm.getEmail());
			stmt.setString(2, dm.getContact());
			rs=stmt.executeQuery();
			while(rs.next()) {
				
				Object[] obj=new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11)};
				listp.add(obj);
			}
			return listp.size()>0?listp:null;
		}
		catch(Exception ex)
		{
			System.out.println("Error in patientRepo   "+ex);
			return null;
		}
		}
	public boolean isDeletePatient(int id)
	{
		try {
			stmt=conn.prepareStatement("delete from patient where pid=?");
			stmt.setInt(1,id);
			int value=stmt.executeUpdate();
			return (value>0)?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Error is in PatientRepo  "+ex);
			return false;
		}
			}
	public boolean isdeleteBill(int pid) {
		try {
			stmt=conn.prepareStatement("delete from bill where pid=?");
			stmt.setInt(1, pid);
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Error is in PatientRepo  "+ex);
			return false;
		}
	}
	public boolean isloginpatient(String email,String pass) {
		try {
			stmt=conn.prepareStatement("select * from patient where email=? and contact=?");
			stmt.setString(1, email);
			stmt.setString(2, pass);
			rs=stmt.executeQuery();
			return rs.next()?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Error is in PatientRepo  "+ex);
			return false;
		}
	}
	public boolean isUpdatePatient(PatientModel model)
	{
		try {
			stmt=conn.prepareStatement("update patient set pname=?,address=?,contact=?,age=?,gender=?,pdate=?,ptype=?,category=?,status=? where pid=?");
			stmt.setString(1, model.getName());
			stmt.setString(2, model.getAddress());
			stmt.setString(3, model.getContact());
			stmt.setInt(4, model.getAge());
			stmt.setString(5, model.getGender());
			stmt.setString(6, model.getPdate());
			stmt.setString(7, model.getPtype());
			stmt.setString(8, model.getCategory());
			stmt.setString(9, model.getStatus());
			stmt.setInt(10, model.getId());
			
			int value=stmt.executeUpdate();
			return value>0?true:false;	
			}
		catch(Exception ex)
		{
			System.out.println("error is"+ex);
			return false;
		}
	}

	}
		
