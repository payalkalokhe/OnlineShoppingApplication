package com.application.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Profile("development")
@Configuration
public class DatabaseConfiguration {
	@Bean
	public DataSource dataSource() throws SQLException {
		DataSource dataSource = new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).setName("itemdb")
				.addScript("classpath:com/application/config/item-data.sql").build();
		return dataSource;
	}
}
