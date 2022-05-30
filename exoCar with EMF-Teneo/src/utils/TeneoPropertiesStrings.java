package utils;

/**
 * 
 * @author laurent.renambatz
 * @version 1.0
 *
 */
public class TeneoPropertiesStrings {
	
	private TeneoPropertiesStrings(){/**Empty**/}

	private static final String databaseUrl="jdbc:mysql://localhost:3306/car-teneo";
	private static final String databaseUserName="root";
	private static final String databasePassword="adncore";
	private static final String driverClass="com.mysql.jdbc.Driver";
	private static final String dialect="org.hibernate.dialect.MySQL5Dialect";
	
	/**
	 * 
	 * @return Database URL
	 */
	public static String getDatabaseUrl() {
		return databaseUrl;
	}
	
	/**
	 * 
	 * @return Database User name
	 */
	public static String getDatabaseUserName() {
		return databaseUserName;
	}
	
	/**
	 * 
	 * @return Database Password 
	 */
	public static String getDatabasePassword() {
		return databasePassword;
	}

	/**
	 * 
	 * return driver class
	 */
	public static String getDriverClass() {
		return driverClass;
	}

	/**
	 * 
	 * @return dialect
	 */
	public static String getDialect() {
		return dialect;
	}
		
	
}
