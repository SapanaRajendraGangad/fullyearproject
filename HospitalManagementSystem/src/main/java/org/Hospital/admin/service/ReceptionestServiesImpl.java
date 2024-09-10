package org.Hospital.admin.service;

import java.util.List;

import org.Hospital.admin.model.BillModel;
import org.Hospital.admin.model.RecepModel;
import org.Hospital.admin.repository.*;
public class ReceptionestServiesImpl implements ReceptionestServies{
	Receptioniest re=new ReceptionestImpl();
	@Override
	public boolean addreceptionist(RecepModel model) {
		// TODO Auto-generated method stub
		return re.addreceptionist(model);
	}
	@Override
	public List<RecepModel> viewReceptionest() {
		// TODO Auto-generated method stub
		return re.viewReceptionest();
	}
	@Override
	public boolean isdeleteReceptioniest(int rid) {
		// TODO Auto-generated method stub
		return re.isdeleteReceptioniest(rid);
	}
	@Override
	public boolean updateReceptioniest(RecepModel model) {
		// TODO Auto-generated method stub
		return re.updateReceptioniest(model);
	}
	@Override
	public boolean isrecepLogin(RecepModel dm) {
		// TODO Auto-generated method stub
		return re.isrecepLogin(dm);
	}
	@Override
	public boolean isAddbill(BillModel bmodel) {
		// TODO Auto-generated method stub
		return re.isAddbill(bmodel);
	}

}
