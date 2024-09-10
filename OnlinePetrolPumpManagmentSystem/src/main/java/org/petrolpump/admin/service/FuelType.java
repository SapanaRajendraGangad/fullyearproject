package org.petrolpump.admin.service;

import org.petrolpumpsystem.model.FuelTypeModel;
import java.util.*;
public interface FuelType {
public boolean isAddFuelType(FuelTypeModel model);
public List<FuelTypeModel> getAllFuelTypes();
public boolean isDeletefueltypebyid(int fid);
public boolean isupdatefueltype(int id ,String fname);
}
