package springboot.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@Profile("postgresql")
@PropertySource(("classpath:application-postgresql.properties"))

public class PostgreSQLDatasourceConfig {
	@Value("${spring.datasource.username}")
	private String postgresqlUser;

	@Value("${spring.datasource.password}")
	private String postgresqlPassword;

	@Value("${spring.datasource.url}")
	private String postgresqlDataSourceUrl;

	@Value("${spring.datasource.driverclass}")
	private String postgresqlDriverClassName;

	@Bean
	public BasicDataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl(postgresqlDataSourceUrl);
		dataSource.setDriverClassName(postgresqlDriverClassName);
		dataSource.setUsername(postgresqlUser);
		dataSource.setPassword(postgresqlPassword);
		System.out.println("Connecting to datasource : "+postgresqlDataSourceUrl);
		return dataSource;
	}
}
