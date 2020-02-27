package eurekaregistrarcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//eureka 注册中心
@SpringBootApplication
@EnableEurekaServer
public class EurekaRegistrarCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRegistrarCenterApplication.class, args);
    }

}
