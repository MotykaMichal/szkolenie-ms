package pl.example.helloresttemplate.services;

import feign.FeignException.FeignClientException;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;
import pl.example.helloresttemplate.interfaces.HelloWorldApi;

@Service
@Log
@RequiredArgsConstructor
public class FeignHelloWorldService implements HelloWorldApi {

    private final HelloWorldApi helloWorldApi;


    @Override
    public String helloWorld() {
        try {
            String hello = helloWorldApi.helloWorld();

            log.info(hello + "JEJ");
            return hello + "Jej";

        } catch (FeignClientException e) {
            log.info("Hello world error!" + e.getMessage());
        }
    }
}
