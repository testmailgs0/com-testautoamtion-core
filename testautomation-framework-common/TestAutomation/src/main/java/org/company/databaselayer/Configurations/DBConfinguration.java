package org.company.databaselayer.Configurations;

import org.company.databaselayer.DbEntities.Temp;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class DBConfinguration {
	private static SessionFactory sessionFactory;
	private static Session dbSession;
	
	public static void LoadConfiguration()
	{
		try {
			Temp obj = new Temp();
			obj.setID(03);
			obj.setName("ramesh");
			Configuration con= new Configuration().configure().addAnnotatedClass(Temp.class);	
			StandardServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
			sessionFactory=con.buildSessionFactory(reg);
			dbSession=sessionFactory.openSession();
			Transaction tx =dbSession.beginTransaction();
			dbSession.save(obj);
			Temp dbentry = dbSession.get(Temp.class, obj.getID());
			System.out.println(dbentry.getName());
			tx.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
