package com.nixsolution.usermanagement.db;

import java.util.Properties;

public class ConnectionFactoryImpl implements ConnectionFactory {
	private String driver;
	private String url;
	private String user;
	private String password;
	
	public ConnectionFactoryImpl (Properties properties) {
		driver = properties.getProperty("connection.driver");
		url = properties.getProperty("connection.driver");
		user = properties.getProperty("connection.driver");
		password = properties.getProperty("connection.driver");
	}
	
	public Connection createConnection() throws DatabaseExeption {
		
		try {
			Class.forName(driver);
		}catch ()
	}
	
}
