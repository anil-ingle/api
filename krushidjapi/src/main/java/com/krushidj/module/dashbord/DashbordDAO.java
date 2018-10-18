package com.krushidj.module.dashbord;

import java.util.List;

public interface DashbordDAO<T> {
	public void saveContact(T instance);

	public List<T> getContacts(long id)throws Throwable;
}
