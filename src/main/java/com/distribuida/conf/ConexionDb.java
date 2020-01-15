package com.distribuida.conf;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

@ApplicationScoped
public class ConexionDb {

	public static final String DRIVER_CLASS = "org.postgresql.Driver";
	public static final String URL = "jdbc:postgresql://127.0.0.1:5432/melodias";
	public static final String USER = "postgres";
	public static final String PASS = "junio.250";

	@ApplicationScoped
	@Produces
	public DataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(DRIVER_CLASS);
		ds.setUrl(URL);
		ds.setUsername(USER);
		ds.setPassword(PASS);
		return ds;
	}

}