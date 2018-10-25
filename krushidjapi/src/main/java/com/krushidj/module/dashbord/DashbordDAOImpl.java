package com.krushidj.module.dashbord;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.krushidj.module.exception.GlobalException;
import com.krushidj.util.MethodUtil;

@Repository("dao")
public class DashbordDAOImpl<T> implements DashbordDAO<T> {
	// @Autowired
	private MethodUtil<T> method = new MethodUtil<>();
	

	@Override
	public void saveContact(T instance) {

		try {
			method.save(instance);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<T> getContacts(long id) throws Throwable {
		try {
			return method.getALlById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new GlobalException("error");

		}
	}
}
