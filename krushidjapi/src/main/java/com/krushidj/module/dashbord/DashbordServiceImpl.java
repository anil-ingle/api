package com.krushidj.module.dashbord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krushidj.model.Contact;
import com.krushidj.model.Employee;

@Service("service")
public class DashbordServiceImpl implements DashbordService {
	@SuppressWarnings("rawtypes")
	@Autowired
	private DashbordDAO dao;

	public void saveEmployee(Employee employee) {
		// dao.saveEmployee(employee);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void saveContact(Contact contact) {
		dao.saveContact(contact);

	}
}
