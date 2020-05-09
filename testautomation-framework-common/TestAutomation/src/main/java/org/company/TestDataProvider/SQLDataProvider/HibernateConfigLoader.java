package org.company.TestDataProvider.SQLDataProvider;

import org.company.TestDataProvider.TestDataEntities.TestExecutorConfigEntity;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateConfigLoader {
	private static SessionFactory sessionFactory;
	private static Session dbSession;
	
	public static void LoadConfiguration()
	{
		try {
			TestExecutorConfigEntity obj = new TestExecutorConfigEntity();
			Configuration con= new Configuration().configure().addAnnotatedClass(TestExecutorConfigEntity.class);	
			StandardServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
			sessionFactory=con.buildSessionFactory(reg);
			dbSession=sessionFactory.openSession();
			Transaction tx =dbSession.beginTransaction();
			dbSession.save(obj);
			TestExecutorConfigEntity dbentry = dbSession.get(TestExecutorConfigEntity.class, obj.SID);
			System.out.println(dbentry.SID);
			tx.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
