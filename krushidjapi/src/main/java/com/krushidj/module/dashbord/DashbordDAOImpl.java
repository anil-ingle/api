package com.krushidj.module.dashbord;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.krushidj.util.MethodUtil;

@Repository("dao")
public class DashbordDAOImpl<T> implements DashbordDAO<T> {
	@Autowired
	private MethodUtil<T> util;

	@Override
	public void saveContact(T instance) throws Throwable {
		util.save(instance);
	}

	@Override
	public List<T> getContacts(long id) throws Throwable {
		return util.getALlById(id, "loginId");
	}

	@Override
	public void updateContact(T instance) throws Throwable {
		util.update(instance);
	}

	@Override
	public void deleteContact(String tableName,Long id) throws Throwable {
		util.delete(tableName, id);

	}

}
