package com.zbt.elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Frank Zhang on 16/1/21.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class ElasticsearchServer {

    public static void main(String[] args) {
        SpringApplication.run(ElasticsearchServer.class, args);
        System.out.println(new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss]").format(new Date())
                + " elasticsearch web service server started!");
    }

}
