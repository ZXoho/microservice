package com.cn;

import io.shardingjdbc.core.api.MasterSlaveDataSourceFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.util.ResourceUtils;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;

@SpringBootApplication
public class BillDubboServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillDubboServiceApplication.class, args);
    }

}

