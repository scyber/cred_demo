package ru.equifax.tests;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import ru.equifax.common.Functions;
import ru.equifax.hbn.Language;

public class HibernateTest {

	@Test
	public void getHibernateData (){
		System.out.println("Run Hibernate Test");
		/*Session s = Functions.getHibernateSession();
		Transaction ts = s.beginTransaction();
		
		Language l = new Language();
		String st = "Русский";
		//for (int i=1; i<10;i++){
			byte b = 20;
			Timestamp tsm = Timestamp.valueOf(LocalDateTime.now());
			l.setLanguageId(b);
			l.setName(st);
			l.setLastUpdate(tsm);
			s.save(l);
			//l = null;
			//l = new Language();
			s.clear();
			s.flush();
		//}
		ts.commit();
		s.close();*/
		
		
	}
}
