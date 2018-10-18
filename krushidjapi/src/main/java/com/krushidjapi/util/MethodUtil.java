package com.krushidjapi.util;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.krushidj.module.exception.GlobalException;

@Component
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

	@SuppressWarnings("unchecked")
	public List<T> getALlById(Long id) throws Exception {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			if (session != null) {
				Criteria crit = session.createCriteria(Object.class);
				crit.add(Restrictions.eq("loginId", id));
				return crit.list();

			} else {
				throw new GlobalException("An error occurred while getting Data. Please contact Support Team.");
			}

		} catch (Exception e) {
			e.printStackTrace();
			log.error("An error occurred while getting  Data", e);
			throw new GlobalException("An error occurred while getting Data. Please contact Support Team.");
		} finally {
			if (session != null) {
				session.flush();
				session.close();
			}
		}

	}

}
