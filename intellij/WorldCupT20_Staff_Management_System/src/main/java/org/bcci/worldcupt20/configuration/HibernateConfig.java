/*
 this configuration class is not needed as we are using spring boot and spring boot will take care of all the configurations

 but if we use pure hibernate in spring boot 3.0.0 where sessionfactory is deprecated then we can use this configuration class

*/
//package org.bcci.worldcupt20.configuration;
//
//import jakarta.persistence.EntityManagerFactory;
//import org.hibernate.SessionFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.hibernate5.HibernateTransactionManager;
//import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//
//import java.util.Properties;
//
//@Configuration
//public class HibernateConfig {
//
//    @Bean
//    public LocalSessionFactoryBean sessionFactory() {
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//        sessionFactory.setPackagesToScan("org.hibernate.SessionFactory");
//        sessionFactory.setHibernateProperties(hibernateProperties());
//        sessionFactory
//        return sessionFactory;
//    }
//
////    @Bean
////    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
////        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
////        transactionManager.setSessionFactory(sessionFactory);
////        return transactionManager;
////    }
//
//    // Configure other Hibernate properties as needed
//    private Properties hibernateProperties() {
//        Properties properties = new Properties();
//        properties.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
//        properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/wct20");
//        properties.setProperty("hibernate.connection.username", "root");
//        properties.setProperty("hibernate.connection.password", "root");
//        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
//        properties.setProperty("hibernate.hbm2ddl.auto", "update");
//        properties.setProperty("hibernate.show_sql", "true");
//        properties.setProperty("hibernate.format_sql", "true");
//        return properties;
//    }
//
//     @Bean
//     @Primary
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//        em.setDataSource(dataSource());
//        em.setPackagesToScan("jakarta.persistence.EntityManagerFactory");
//
//        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        em.setJpaVendorAdapter(vendorAdapter);
//
//        return em;
//    }
//
//    @Bean
//    public DriverManagerDataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/wct20");
//        dataSource.setUsername("root");
//        dataSource.setPassword("root");
//        return dataSource;
//    }
//}
//
