package org.petrolpump.admin.service;

import org.petrolpumpsystem.model.MachineModel;

import java.util.List;

import org.petrolpump.admin.repository.*;
public class MachineServiceImpl implements MachineService {
	MachineRepository m=new MachineRepositoryImpl();
	@Override
	public boolean isAddNewMachine(MachineModel model,String []typeId,String []capacity) {
		return m.isAddNewMachine(model,typeId,capacity);
	}
	@Override
	public List<Object[]> getAllMachines() {
		return m.getAllMachines();
	}
	@Override
	public boolean isDeleteMachineById(int mid) {
		return m.isDeleteMachineById(mid);
	}
	@Override
	public boolean isUpdateMachine(MachineModel model) {
		// TODO Auto-generated method stub
		return m.isUpdateMachine(model);
	}
	

}
