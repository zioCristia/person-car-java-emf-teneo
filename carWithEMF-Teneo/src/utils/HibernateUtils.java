package utils;

import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;

import exoCar.ExoCarPackage;

@SuppressWarnings("deprecation")
public class HibernateUtils {

	private static HbDataStore hbds = null;
	private static final SessionFactory sessionFactory;

	static {
		hbds = HbHelper.INSTANCE.createRegisterDataStore("mydb");

		final Properties props = new Properties();

		/**
		 * Environment properties
		 */
		props.setProperty(Environment.DRIVER, TeneoPropertiesStrings.getDriverClass());
		props.setProperty(Environment.URL, TeneoPropertiesStrings.getDatabaseUrl());
		props.setProperty(Environment.USER,
				TeneoPropertiesStrings.getDatabaseUserName());
		props.setProperty(Environment.PASS,
				TeneoPropertiesStrings.getDatabasePassword());
		props.setProperty(Environment.DIALECT,TeneoPropertiesStrings.getDialect());
		props.setProperty(Environment.SHOW_SQL, "false");

		/**
		 * Persistence Properties
		 */
		props.setProperty(PersistenceOptions.INHERITANCE_MAPPING, "JOINED");
		props.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT,
				"PERSIST,MERGE,REFRESH");
		props.setProperty(PersistenceOptions.ALWAYS_VERSION, "false");
		props.setProperty(PersistenceOptions.EMAP_AS_TRUE_MAP, "false");
		
		props.setProperty(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread"); 

		hbds.setProperties(props);

		try {
			EPackage[] packagesToLoad = new EPackage[1];
			packagesToLoad[0] =	ExoCarPackage.eINSTANCE;
			hbds.setEPackages(packagesToLoad);	
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}
		hbds.initialize();
		sessionFactory = hbds.getSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

}
