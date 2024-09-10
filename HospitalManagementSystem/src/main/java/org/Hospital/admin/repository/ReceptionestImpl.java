package org.Hospital.admin.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.Hospital.admin.config.DBConfig;
import org.Hospital.admin.model.PatientModel;
import org.Hospital.admin.model.RecepModel;
import org.Hospital.admin.model.doctormodel;
import org.Hospital.admin.model.*;
public class ReceptionestImpl extends DBConfig implements Receptioniest {
		private int rid=0;
		List<RecepModel> list=new ArrayList<RecepModel>();
		private int getrecepId()
		{
			
			try {
				stmt=conn.prepareStatement("select max(rid) from receptionest");
				rs=stmt.executeQuery();
				if(rs.next())
				{
					rid=rs.getInt(1);
				}
				++rid;
			  }
			catch(Exception ex)
			{
				System.out.println("error is "+ex);
				return 0;
			}
			return rid;
		}
		public boolean isrecepLogin(RecepModel dm) {
			System.out.println(dm.getEmail());
			System.out.println(dm.getContact());
			try {
				stmt=conn.prepareStatement("select * from receptionest where email=? & contact=?");
				stmt.setString(1, dm.getEmail());
				stmt.setString(2, dm.getContact());
				rs=stmt.executeQuery();
		return rs.next()?true:false;
			}
			catch(Exception ex) {
				System.out.println("Error in repository of doctor login "+ex.getMessage());
				return false;
			}
		}
		public boolean addreceptionist(RecepModel model) {
			int reid=this.getrecepId();
			try {
				stmt=conn.prepareStatement("insert into receptionest values(?,?,?,?)");
				stmt.setInt(1, reid);
				stmt.setString(2, model.getRname());
				stmt.setString(3, model.getEmail());
				stmt.setString(4, model.getContact());
				int value=stmt.executeUpdate();
				return value>0?true:false;
			}
			catch (SQLException e) {
				System.out.println("Error is in receptionist repo "+e);
				return false;
			}
			
		}
		public boolean isAddbill(BillModel bmodel) {
			try {
				stmt=conn.prepareStatement("insert into bill values(?,?,?,?,?)");
				stmt.setInt(1, bmodel.getPid());
				stmt.setString(2, bmodel.getDate());
				stmt.setInt(3,bmodel.getDoctor_fees());
				stmt.setInt(4, bmodel.getRoom_fees());
				stmt.setInt(5, bmodel.getTotal());
				int value=stmt.executeUpdate();
				return value>0?true:false;
			}
			catch(Exception ex) {
				System.out.println("Error is in receptioniest repository"+ex);
				return false;
			}
		}
		public List<RecepModel> viewReceptionest() {
			int id=this.getrecepId();
			try {
				stmt=conn.prepareStatement("select * from receptionest");
				rs=stmt.executeQuery();
				while(rs.next()) {
					RecepModel rm=new RecepModel();
					rm.setRid(rs.getInt(1));
					rm.setRname(rs.getString(2));
					rm.setEmail(rs.getString(3));
					rm.setContact(rs.getString(4));
					list.add(rm);
				}
				return list.size()>0?list:null;
			}
			catch(Exception ex) {
				System.out.println("Error is"+ex);
				return null;
			}
		}
		public boolean isdeleteReceptioniest(int rid) {
			try {
				stmt=conn.prepareStatement("delete from receptionest where rid=?");
				stmt.setInt(1, rid);
				int value=stmt.executeUpdate();
				return value>0?true:false;
			}
			catch(Exception ex) {
			System.out.println("Error is in receptioniest repo "+ex);
			return false;
			}
		}
		public boolean updateReceptioniest(RecepModel model){
			try {
				stmt=conn.prepareStatement("update receptionest set rname=?,email=?,contact=? where rid=?");
				stmt.setString(1,model.getRname());
				stmt.setString(2,model.getEmail());
				stmt.setString(3, model.getContact());
				stmt.setInt(4, model.getRid());
				int value=stmt.executeUpdate();
				return value>0?true:false;
			}
			catch(Exception ex) {
				System.out.println("error is"+ex);
				return false;
			}
		}
	}
