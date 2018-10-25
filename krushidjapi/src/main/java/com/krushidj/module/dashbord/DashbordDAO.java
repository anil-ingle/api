package com.krushidj.module.dashbord;

import java.util.List;

public interface DashbordDAO<T> {
	public void saveContact(T instance) throws Throwable;

	public void updateContact(T instance) throws Throwable;

	public List<T> getContacts(long id) throws Throwable;

	public void deleteContact(Long id) throws Throwable;

}
