package com.rookie.bigdata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @Class DatabaseConfiguration
 * @Description
 * @Author rookie
 * @Date 2025/5/7 16:03
 * @Version 1.0
 */
@Configuration
public class DatabaseConfiguration {


//  druid don't support GraalVM now because of there is CGlib proxy
	/*@Bean
	@Primary
	@ConfigurationProperties("spring.datasource")
	public DataSource storageDataSource() {
		return new DruidDataSource();
	}*/

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.update("delete from storage_tbl where commodity_code = 'C00321'");
        jdbcTemplate.update(
                "insert into storage_tbl(commodity_code, count) values ('C00321', 100)");

        return jdbcTemplate;

    }

}

