package com.krushidj.module.dashbord;

import java.util.List;

import com.krushidj.model.Contact;
import com.krushidj.model.Employee;

public interface DashbordService {
	public void saveEmployee(Employee employee);

	public void saveContact(Contact contact);

	public List<Contact> getContacts(Long id) throws Throwable;
}
