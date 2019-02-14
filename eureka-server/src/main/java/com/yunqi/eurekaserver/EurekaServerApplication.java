package com.yunqi.eurekaserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {
        //需要切换到1.5.4否则2.0版本会报web(true)错误
       new SpringApplicationBuilder(EurekaServerApplication.class)
               .web(true).run(args);
    }

}

