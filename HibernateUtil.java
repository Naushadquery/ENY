package com.nau.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.imageio.spi.ServiceRegistry;

import org.h2.tools.Server;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;

import com.nau.entity.Account;
import com.nau.entity.EmployeeEntity;
import com.nau.entity.EmployeeEntity2;
import com.nau.entity.Person;
import com.nau.onetomany.Answer;
import com.nau.onetomany.Question;

public class HibernateUtil {

	private static SessionFactory factory;
	static {
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(EmployeeEntity.class);
		configuration.addAnnotatedClass(EmployeeEntity2.class);
		configuration.addAnnotatedClass(Person.class);
		configuration.addAnnotatedClass(Account.class);
		configuration.addAnnotatedClass(Answer.class);
		configuration.addAnnotatedClass(Question.class);
		// configuration.addFile("Student.hbm.xml");
		configuration.configure();
		factory = configuration.buildSessionFactory();
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		try {
			Connection con = serviceRegistry.getService(ConnectionProvider.class).getConnection();
			new Thread(() -> {
				try {
					Server.startWebServer(con);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}).start();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Session getSession() {
		return factory.openSession();
	}

	public static SessionFactory getFactory() {

		return factory;
	}

	public static void closeFactory() {
		factory.close();
	}
}
