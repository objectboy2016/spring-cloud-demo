package eurekahystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableHystrix
@EnableTurbine
@EnableDiscoveryClient
public class EurekaHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHystrixApplication.class, args);
    }

}
