package ru.equifax.common;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import ru.equifax.*;
import ru.equifax.hbn.*;

public class AppHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Byte b = 20;
		String langName = "Русский";
		Date updateDate = new Date();	
		Session ses = HibernateUtil.getSessionFactory().openSession();
		Transaction tr = ses.getTransaction();
		tr.begin();
		for (int i=0; i<100;i++){
		Language lang = new Language();
		//Address adr = new Address();
		//lang.setLanguageId(b);
		lang.setName(langName);
		lang.setLastUpdate(updateDate);
		
		ses.save(lang);
		}
		tr.commit();
		//tr.rollback();
		//ses.getTransaction().commit();
		ses.close();
		System.out.println("Done");
		
	}

}
