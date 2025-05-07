package com.rookie.bigdata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.client.RestTemplate;

import javax.sql.DataSource;

/**
 * @Class DatabaseConfiguration
 * @Description
 * @Author rookie
 * @Date 2025/5/7 15:35
 * @Version 1.0
 */
@Configuration
public class DatabaseConfiguration {

//  druid don't support GraalVM now because of there is CGlib proxy
//	@Bean
//	@Primary
//	@ConfigurationProperties("spring.datasource")
//	public DataSource storageDataSource() {
//		return new DruidDataSource();
//	}

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.execute("TRUNCATE TABLE order_tbl");

        return jdbcTemplate;
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
