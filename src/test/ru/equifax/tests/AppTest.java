package ru.equifax.tests;


import org.hibernate.Session;
import org.hibernate.Transaction;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import ru.equifax.common.HibernateUtil;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	//System.out.println("Get data from Hibernate");
    	Session ses = HibernateUtil.getSessionFactory().openSession();
    	Transaction tr = ses.beginTransaction();
    	tr.begin();
    	tr.rollback();
    	ses.close();
        assertTrue( true );
    }
}
