package springboot.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
@Profile("default")
@EnableJpaRepositories("springboot.repository.jpa")
public class H2DatasourceConfig {
	 @Bean
	    public DataSource dataSource() {
	        return new EmbeddedDatabaseBuilder()
	                .setName("employee")
	                .setType(EmbeddedDatabaseType.H2)
	                .build();
	    }
}
