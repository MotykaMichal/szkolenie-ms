package pl.example.helloresttemplate.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.example.helloresttemplate.services.FeignHelloWorldService;

@RestController
@RequestMapping("/abc")
@RequiredArgsConstructor
public class feignCall {

    private final FeignHelloWorldService feignHelloWorldService;

    @GetMapping
    String helloWorld() {
        return feignHelloWorldService.helloWorld();
    }

}
