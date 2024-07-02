package org.bcci.worldcupt20.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import javax.sql.DataSource;

@Configuration
public class PostStartupSQLConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    public CommandLineRunner runPostStartupSQL() {
        return args -> {
            String scriptPath = "data.sql";
//            ResourceDatabasePopulator resourceDatabasePopulator = new ResourceDatabasePopulator(new ClassPathResource(scriptPath));
//            resourceDatabasePopulator.execute(dataSource);
            new ResourceDatabasePopulator(new ClassPathResource(scriptPath)).execute(dataSource);
            System.out.println("Executing SQL script: " + scriptPath);
        };
    }
}

