package org.petrolpump.admin.repository;

import java.util.List;

import org.petrolpumpsystem.model.MachineModel;

public interface MachineRepository {
	public boolean isAddNewMachine(MachineModel model,String typeId[],String []capacity);
	public List<Object[]> getAllMachines();
	public boolean isDeleteMachineById(int mid);
	public boolean isUpdateMachine(MachineModel model);
}
