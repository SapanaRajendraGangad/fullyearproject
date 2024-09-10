package org.petrolpump.admin.repository;

import java.util.ArrayList;
import java.util.List;

import org.petrolpump.admin.config.DBConfig;
import org.petrolpumpsystem.model.MachineModel;

public class MachineRepositoryImpl extends DBConfig implements MachineRepository {
	List<Object[]> list;
	int mid=0;
	public int getMachinIdAutomatic() {
		try {
			stmt=conn.prepareStatement("select max(mid) from machineinfo");
			rs=stmt.executeQuery();
			while(rs.next()) {
				mid=rs.getInt(1);
			}
			++mid;
			return mid;
		}
		catch(Exception ex) {
			System.out.println("exception in Automatic id increament"+ex);
			return -1;
		}
	}
	@Override
	public boolean isAddNewMachine(MachineModel model,String []typeId,String []capacity) {
				try {
					int mid=this.getMachinIdAutomatic();

			stmt=conn.prepareStatement("insert into machineinfo values(?,?)");
			stmt.setInt(1, mid);
			stmt.setString(2, model.getMachineCode());
			int value=stmt.executeUpdate();
			if(value>0) {
				for(int i=0;i<capacity.length;i++) {
					if(capacity[i]!=null) {
				stmt=conn.prepareStatement("insert into machinefueljoin values(?,?,?)");
				stmt.setInt(1, mid);
				stmt.setInt(2, Integer.parseInt(typeId[i]));
				stmt.setInt(3, Integer.parseInt(capacity[i]));
				value=stmt.executeUpdate();
					}
				}
				return value>0?true:false;
			}
			else {
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println("Error in Machine Repository"+ex);
			return false;

		}
	}

	@Override
	public List<Object[]> getAllMachines() {
		try {
			list=new ArrayList<Object[]>();
			stmt=conn.prepareStatement("select m.mcode,f.fuelname,mtj.capacity,m.mid from machineinfo m left join machinefueljoin mtj"
					+ " on m.mid=mtj.mid left join fueltype f on f.fid=mtj.fid;");
			rs=stmt.executeQuery();
			while(rs.next()) {
				Object []obj=new Object[] {rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4)};
				list.add(obj);	
				
			}
			return list.size()>0?list:null;
		}
		catch(Exception ex) {
			System.out.println("Error in Machine Repository"+ex);
			return null;
		}
		}

	@Override
	public boolean isDeleteMachineById(int mid) {
		try {
			stmt=conn.prepareStatement("delete from machineinfo where mid=?");
			stmt.setInt(1, mid);
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex) {
			System.out.println("Error in Machine Repository"+ex);
			return false;
		}
	}

	@Override
	public boolean isUpdateMachine(MachineModel model) {
		try {
			stmt=conn.prepareStatement("update machineinfo set mcode=? where mid=?");
			stmt.setString(1,model.getMachineCode());
			stmt.setInt(2, model.getId());
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex) {
			System.out.println("Error in Machine Repository"+ex);
			return false;
		}
	}

}
