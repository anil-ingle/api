package com.krushidj.module.dashbord;

import java.util.List;

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
	public void saveContact(Contact contact) throws Throwable {
		dao.saveContact(contact);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contact> getContacts(Long id) throws Throwable {
		List<Contact> list=null;
		try {
			list = dao.getContacts(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list + "id" + id);
		return list;
	}
}
