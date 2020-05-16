package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class ServerController {


    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value="/getServer",method = RequestMethod.GET)
    public Map<String, String> getMessage(){
        ParameterizedTypeReference<Map<String,String>> responseType = new ParameterizedTypeReference<Map<String,String>>(){};
        ResponseEntity<Map<String,String>> response = restTemplate.exchange("http://are-new-dev-are.ocpcarc1.web.bc/", HttpMethod.GET,null,responseType);
        return response.getBody();
    }
}

