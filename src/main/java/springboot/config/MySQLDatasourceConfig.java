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
@Profile("mysql")
@PropertySource(("classpath:application-mysql.properties"))
public class MySQLDatasourceConfig {
	@Value("${spring.datasource.username}")
	private String mysqlUser;

	@Value("${spring.datasource.password}")
	private String mysqlPassword;

	@Value("${spring.datasource.url}")
	private String mysqlDataSourceUrl;
	
	@Value("${spring.datasource.driverclass}")
	private String mysqlDriverClassName;
	
	@Bean
    public BasicDataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(mysqlDataSourceUrl);
        dataSource.setDriverClassName(mysqlDriverClassName);
        dataSource.setUsername(mysqlUser);
        dataSource.setPassword(mysqlPassword);
        System.out.println("Connecting to datasource : "+mysqlDataSourceUrl);
        return dataSource;
    }
}
