package ru.equifax.cred_demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import ru.equifax.*;
import ru.equifax.hbn.*;

public class AppHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Byte b = 8;
		String langName = "Romanian";
		Date updateDate = new Date();	
		Session ses = HibernateUtil.getSessionFactory().openSession();
		Transaction tr = ses.getTransaction();
		tr.begin();
		Language lang = new Language();
		//lang.setLanguageId(b);
		lang.setName(langName);
		lang.setLastUpdate(updateDate);
		
		ses.save(lang);
		tr.commit();
		//ses.getTransaction().commit();
		ses.close();
		
	}

}
