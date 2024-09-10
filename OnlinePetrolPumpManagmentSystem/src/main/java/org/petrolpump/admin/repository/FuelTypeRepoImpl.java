package org.petrolpump.admin.repository;

import java.util.ArrayList;
import java.util.List;

import org.petrolpump.admin.config.DBConfig;
import org.petrolpumpsystem.model.FuelTypeModel;

public class FuelTypeRepoImpl extends DBConfig implements FuelTypeRepo{
	List<FuelTypeModel> list;
	@Override
	public boolean isAddFuelType(FuelTypeModel model) {
		try {
			stmt=conn.prepareStatement("insert into fueltype values(?,?)");
			stmt.setInt(1, model.getFid());
			stmt.setString(2, model.getFuelName());
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex) {
			System.out.println("exception in Fueltyperepoimpl"+ex);
			return false;
		}
	}

	@Override
	public List<FuelTypeModel> getAllFuelType() {
		try {
			 list=new ArrayList<FuelTypeModel>();
			stmt=conn.prepareStatement("select *from fueltype");
			rs=stmt.executeQuery();
			while(rs.next()) {
				FuelTypeModel model=new FuelTypeModel();
				model.setFid(rs.getInt(1));
				model.setFuelName(rs.getString(2));
				list.add(model);
			}
			return list.size()>0?list:null;
		}
		catch(Exception ex) {
			return null;

		}
	}
	
	@Override
	public boolean isupdateFueltypeByid(int fid) {
		try {
			stmt=conn.prepareStatement("delete from fueltype where fid=?");
			stmt.setInt(1,fid );
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex) {
			System.out.println("Error in Machine Repository"+ex);
			return false;
		}	}

	@Override
	public boolean isdeleteFueltype(int fid, String fname) {
		try {
			stmt=conn.prepareStatement("update fueltype set fuelname=? where fid=?");
			stmt.setString(1, fname);
			stmt.setInt(2, fid);
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex) {
			System.out.println("error in delete functoin in fueltype repo "+ex);
			return false;
		}
			}

}
