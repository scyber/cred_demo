package ru.equifax.tests;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import ru.equifax.common.HibernateUtil;
import ru.equifax.hbn.Address;
import ru.equifax.hbn.Language;



public class HibernateGetData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSessionFactory().openSession();
		EntityManagerFactory em = ses.getEntityManagerFactory();
		//Transaction ts = ses.getTransaction();
		EntityManager e = em.createEntityManager();
		//e.getTransaction().begin();
		Transaction ts = (Transaction) e.getTransaction();
		ts.begin();
		//List languages = ses.createQuery("select * from " + ru.equifax.hbn.Language.class.getName() + "").list();
		List languages = ses.createQuery("from Language").list();
		//List adr = ses.createQuery("from Address").list();
		//for (Iterator it = lang.iterator(); it.hasNext();){
			//Address a = (Address) it.next();
			//System.out.println(a.getAddressD());
		
		for(Iterator it = languages.iterator(); it.hasNext();){
		
			Language lang = (Language) it.next();
			System.out.println();
			System.out.print(lang.getLanguageId() + " ");
			System.out.print(lang.getLastUpdate() + " ");
			System.out.print(lang.getName() + " ");
			//System.out.println(lang.getLanguageId() + " " + lang.getName() + " " +  lang.getLastUpdate() + " ");	
		}
		//Query upD = ses.createQuery("update Language set language_id = :langID" + " where name = :lang_name");
		//upD.setParameter("langID", 7);
		//upD.setParameter("lang_name", "Русский");
		//upD.executeUpdate();
		//ses.save(upD);
		//e.getTransaction().commit();
		e.getTransaction().rollback();
		//ts.rollback();
		ses.close();
	}

}
