package com.mrt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Auther: mrt
 * @Date: 2019-08-22 10:51
 * @Description:
 */
@SpringBootApplication
@EnableConfigServer
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
    public void test(){
        System.out.println("hello");
    }
}
