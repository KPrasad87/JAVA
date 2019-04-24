package com.ca.home.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/*1.create hibernate config
2.create model object
3.write code to save data to database
4. DB serverport 3310
*/

public class HiberanteApp {
	public static void main(String[] args) {

		hibernatetable tableBean = new hibernatetable();
		tableBean.setNo(1);
		tableBean.setName("rk");

		Configuration configuration = new Configuration().configure();

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()

				.applySettings(configuration.getProperties());

		SessionFactory sessionFactory = configuration

				.buildSessionFactory(builder.build());
		Session session = sessionFactory.openSession();

		session.beginTransaction();

		session.save(tableBean);

		session.getTransaction().commit();

		session.close();

		System.out.println("Successfully created " + tableBean.toString());

	}

}
