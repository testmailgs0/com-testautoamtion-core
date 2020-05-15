package org.company.TestDataProvider.SQLDataProvider;

import java.util.List;

import org.company.TestDataProvider.TestDataEntities.TestExecutorConfig;
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
			Configuration con = new Configuration().configure().addAnnotatedClass(TestExecutorConfig.class);
			StandardServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties())
					.build();
			sessionFactory = con.buildSessionFactory(reg);
			dbSession = sessionFactory.openSession();
			Transaction tx = dbSession.beginTransaction();
			@SuppressWarnings("unchecked")
			List<TestExecutorConfig> allValues = dbSession.createCriteria(TestExecutorConfig.class).list();
			System.out.println(allValues.size());

			tx.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
