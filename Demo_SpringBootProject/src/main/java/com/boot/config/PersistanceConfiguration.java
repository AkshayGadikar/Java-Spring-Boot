package com.boot.config;

import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import javax.sql.DataSource;


@Configuration
public class PersistanceConfiguration {

    //mentioning it as primary helps in resolving preferance
    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    @Primary
    public DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }

    //Secondary datasource

    @Bean
    @ConfigurationProperties(prefix="datasource.flyway")
    @FlywayDataSource
    public DataSource flywayDataSource() {
        return DataSourceBuilder.create().build();
    }

    }
