package pl.example.helloresttemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@SpringBootApplication
public class HelloRestTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloRestTemplateApplication.class, args);
    }

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() { return new RestTemplate(); }

}
