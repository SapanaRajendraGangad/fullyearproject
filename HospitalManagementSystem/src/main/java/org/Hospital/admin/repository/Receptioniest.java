package org.Hospital.admin.repository;

import java.util.List;

import org.Hospital.admin.model.BillModel;
import org.Hospital.admin.model.RecepModel;

public interface Receptioniest {
	public boolean addreceptionist(RecepModel model);
	public List<RecepModel> viewReceptionest();
	public boolean isdeleteReceptioniest(int rid);
	public boolean updateReceptioniest(RecepModel model);
	public boolean isAddbill(BillModel bmodel);
	public boolean isrecepLogin(RecepModel dm);
}
