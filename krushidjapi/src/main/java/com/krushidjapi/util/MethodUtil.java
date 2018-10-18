package com.krushidjapi.util;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class MethodUtil<T> {
	
	public void save(T entity) {
		Session session = null;
		Transaction txn = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			txn = session != null ? session.beginTransaction() : null;
			if (session != null)
				session.save(entity);
			txn.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (!txn.wasCommitted()) {
				txn.rollback();
			}

			session.flush();
			session.close();
		}

	}

}
