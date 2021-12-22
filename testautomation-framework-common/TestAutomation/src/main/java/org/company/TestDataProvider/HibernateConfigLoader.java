package org.company.TestDataProvider;

import java.util.List;

import org.company.BussinessLayer.DBTestExecutorConfig;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateConfigLoader {
	private static SessionFactory sessionFactory;
	private static Session dbSession;

	@SuppressWarnings("deprecation")
	public static void LoadConfiguration() {
		try {
			Configuration con = new Configuration().configure().addAnnotatedClass(DBTestExecutorConfig.class);
			StandardServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties())
					.build();
			sessionFactory = con.buildSessionFactory(reg);
			dbSession = sessionFactory.openSession();
			Transaction tx = dbSession.beginTransaction();
			@SuppressWarnings("unchecked")
			List<DBTestExecutorConfig> allValues = dbSession.createCriteria(DBTestExecutorConfig.class).list();
			System.out.println(allValues.size());
			tx.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
