package com.krushidj.module.dashbord;

import org.springframework.stereotype.Repository;

import com.krushidjapi.util.MethodUtil;

@Repository("dao")
public class DashbordDAOImpl<T> implements DashbordDAO<T> {
	MethodUtil<T> method = new MethodUtil<T>();

	@Override
	public void saveContact(T instance) {
		try {
			method.save(instance);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
