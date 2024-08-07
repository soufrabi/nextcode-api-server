package com.soufrabi.nextcode.server.ApiServer.rcee;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class RceeService {
    private final RestClient restClient;

    RceeService(@Value("${rcee.baseurl}") String rceeBaseUrl){
        restClient = RestClient.builder()
                .baseUrl(rceeBaseUrl)
                .build();
    }

    public RceeResponse run(RceeRequest rceeRequest){
        return restClient.post()
                .uri("/run")
                .contentType(MediaType.APPLICATION_JSON)
                .body(rceeRequest)
                .retrieve()
                .body(RceeResponse.class);
    }
}
