package com.cn;

import io.shardingjdbc.core.api.MasterSlaveDataSourceFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.util.ResourceUtils;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;

@SpringBootApplication
public class UserThriftServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserThriftServiceApplication.class, args);
    }

    @Bean
    public DataSource dataSource() throws SQLException, IOException {
        return MasterSlaveDataSourceFactory.createDataSource(ResourceUtils.getFile("classpath:sharing-jdbc.yml"));
    }


}

