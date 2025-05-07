package com.rookie.bigdata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @Class DatabaseConfiguration
 * @Description
 * @Author rookie
 * @Date 2025/5/7 15:30
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

        jdbcTemplate.update("delete from account_tbl where user_id = 'U100001'");
        jdbcTemplate.update(
                "insert into account_tbl(user_id, money) values ('U100001', 10000)");

        return jdbcTemplate;
    }

}

