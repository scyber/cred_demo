package ru.equifax.common;

import java.nio.file.Paths;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();
    
    private static SessionFactory buildSessionFactory()
    {
        try
        {
        	SessionFactory sf = new Configuration().configure("resources/hibernate.cfg.xml").buildSessionFactory();
        	return sf;
        	//System.out.println(System.getProperty("user.dir"));
        	//Configuration cfg = new Configuration();
        	//cfg.configure("src\\main\\resources\\hibernate.cfg.xml");
        	//System.out.println(Paths.get(".").toAbsolutePath().normalize().toString());
        	//StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
        	// SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        	
        	//StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure("src/hibernate.cfg.xml").build();
            //Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
            //return metadata.getSessionFactoryBuilder().build();
        	
        	
            //return sessionFactory;

        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
  
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
  
    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }
}
