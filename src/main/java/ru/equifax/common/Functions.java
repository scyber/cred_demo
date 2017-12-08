package ru.equifax.common;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Functions {

	public static Session getHibernateSession(){
		Session ses = HibernateUtil.getSessionFactory().openSession();
		EntityManagerFactory em = ses.getEntityManagerFactory();
		//Transaction ts = ses.getTransaction();
		EntityManager e = em.createEntityManager();
		//e.getTransaction().begin();
		//Transaction ts = (Transaction) e.getTransaction();
		//ts.begin();
		
		return ses;
	}
}
