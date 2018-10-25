package com.krushidj.module.dashbord;

import java.util.List;

import com.krushidj.model.Contact;
import com.krushidj.model.Employee;

public interface DashbordService {
	public void saveEmployee(Employee employee);

	public void saveContact(Contact contact) throws Throwable;

	public List<Contact> getContacts(Long id) throws Throwable;

	public void deleteContact(Long id) throws Throwable;

	public void updateContact(Contact contact) throws Throwable;
}
