package com.krushidjapi.util;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.krushidj.module.exception.GlobalException;

public class MethodUtil<T> {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	public void save(T entity) throws Throwable {
		Session session = null;
		Transaction txn = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			txn = session != null ? session.beginTransaction() : null;
			if (session != null && txn != null) {
				session.save(entity);
				txn.commit();
			} else {
				throw new GlobalException("An error occurred while saving . Please contact Support Team.");
			}

		} catch (Exception e) {
			log.error("An error occurred while saving Data", e);
			throw new GlobalException("An error occurred while saving Data. Please contact Support Team.");
		} finally {
			if (txn != null && !txn.wasCommitted()) {
				txn.rollback();
			}
			if (session != null) {
				session.flush();
				session.close();
			}
		}

	}

	public List<T> getALlById(Object instance, Long id) throws Exception {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			if (session != null) {
				Criteria crit = session.createCriteria(Object.class);
				crit.add(Restrictions.eq("description", "loginId"));

				//crit.setProjection(Projections);

			} else {
				throw new Exception();
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			if (session != null) {
				session.flush();
				session.close();
			}
		}

		return null;
	}

}
