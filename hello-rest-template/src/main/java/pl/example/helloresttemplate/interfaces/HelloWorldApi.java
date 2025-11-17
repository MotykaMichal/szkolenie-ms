package pl.example.helloresttemplate.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("HELLO-WORLD")
public interface HelloWorldApi {

    @GetMapping("hello")
    String helloWorld();
}
