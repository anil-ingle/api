package com.krushidjapi.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static volatile SessionFactory sessionFactory;
	private static boolean isInstantiated = false;

	// private constructor
	private HibernateUtil() {
		if (isInstantiated) {
			throw new IllegalArgumentException("Can not created second obj it is Singletone class");
		} else
			isInstantiated = true;
	}

	public static final SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			synchronized (HibernateUtil.class) {
				if (sessionFactory == null) {
					// loads configuration and mappings
					Configuration configuration = new Configuration().configure();
					// add Dashbord Entity classes
					configuration.addAnnotatedClass(com.krushidj.model.Employee.class)
							.addAnnotatedClass(com.krushidj.model.Contact.class);
					ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
							.applySettings(configuration.getProperties()).build();
					// builds a session factory from the service registry
					sessionFactory = configuration.buildSessionFactory(serviceRegistry);
				}
			}
		}
		return sessionFactory;
	}
}

//https://github.com/kishanjavatrainer/
/**
 * using SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
 * 
 * Session session = sessionFactory.openSession(); session.beginTransaction();
 * session.save(myObject);
 * 
 */
