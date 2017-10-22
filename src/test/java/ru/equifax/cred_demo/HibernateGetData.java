package ru.equifax.cred_demo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import ru.equifax.hbn.Language;



public class HibernateGetData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSessionFactory().openSession();
		Transaction ts = ses.getTransaction();
		ts.begin();
		List languages = ses.createQuery("from Language").list();
		for(Iterator it = languages.iterator(); it.hasNext();){
			Language lang = (Language) it.next();
			System.out.println(lang.getLanguageId() + " " + lang.getName() + " " +  lang.getLastUpdate() + " ");
			
//			System.out.println(/*"language_id " */  lang.getLanguageId() + " ");
//			System.out.println(/*"language " */ lang.getName() + " " );
//			System.out.println(/*"last_update " */  lang.getLastUpdate() + " ");
			
		}
		ts.commit();
		ses.close();
	}

}
