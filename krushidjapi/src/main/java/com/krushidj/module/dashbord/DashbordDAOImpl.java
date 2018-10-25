package com.krushidj.module.dashbord;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.krushidj.module.exception.GlobalException;
import com.krushidj.util.MethodUtil;

@Repository("dao")
public class DashbordDAOImpl<T> implements DashbordDAO<T> {
	@Autowired
	private MethodUtil<T> util;

	@Override
	public void saveContact(T instance) throws Throwable {

		try {
			util.save(instance);
		} catch (Throwable e) {
			e.printStackTrace();
			throw new GlobalException("An error occurred while saving . Please contact Support Team.");
		}
	}

	@Override
	public List<T> getContacts(long id) throws Throwable {
		try {
			return util.getALlById(id);
		} catch (Exception e) {

			e.printStackTrace();
			throw new GlobalException("An error occurred while getting Contacts . Please contact Support Team.");

		}
	}

	@Override
	public void updateContact(T instance) throws Throwable {
		try {
			util.update(instance);
			;
		} catch (Exception e) {
			throw new GlobalException("An error occurred while update Contacts . Please contact Support Team.");

		}
	}

}
