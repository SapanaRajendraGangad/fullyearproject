package org.petrolpump.admin.service;

import java.util.List;

import org.petrolpump.admin.repository.FuelTypeRepo;
import org.petrolpump.admin.repository.FuelTypeRepoImpl;
import org.petrolpumpsystem.model.FuelTypeModel;

public class FuelTypeImpl implements FuelType {
FuelTypeRepo fr=new FuelTypeRepoImpl();

@Override
public boolean isAddFuelType(FuelTypeModel model) {
	// TODO Auto-generated method stub
	return fr.isAddFuelType(model);
}

@Override
public List<FuelTypeModel> getAllFuelTypes() {
	// TODO Auto-generated method stub
	return fr.getAllFuelType();
}

@Override
public boolean isDeletefueltypebyid(int fid) {
	// TODO Auto-generated method stub
	return fr.isupdateFueltypeByid(fid);
}

@Override
public boolean isupdatefueltype(int id, String fname) {
	// TODO Auto-generated method stub
	return fr.isdeleteFueltype(id,fname);
}
	
}
