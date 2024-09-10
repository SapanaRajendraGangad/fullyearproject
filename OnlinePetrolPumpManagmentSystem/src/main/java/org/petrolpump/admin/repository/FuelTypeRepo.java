package org.petrolpump.admin.repository;

import org.petrolpumpsystem.model.FuelTypeModel;
import java.util.*;
public interface FuelTypeRepo {
 public boolean isAddFuelType(FuelTypeModel model);
 public List<FuelTypeModel> getAllFuelType();
 public boolean isupdateFueltypeByid(int fid);
 public boolean isdeleteFueltype(int fid,String fname);
}
