package org.Hospital.admin.repository;

import org.Hospital.admin.model.adminModel;

public interface AdminRepo {
	public boolean isUserPresent(adminModel model);
}
