package org.petrolpump.admin.service;

import org.petrolpumpsystem.model.MachineModel;
import java.util.*;
public interface MachineService {
	public boolean isAddNewMachine(MachineModel model,String []typeId,String []capacity);
	public List<Object[]> getAllMachines();
	public boolean isDeleteMachineById(int mid);
	public boolean isUpdateMachine(MachineModel model);
}
