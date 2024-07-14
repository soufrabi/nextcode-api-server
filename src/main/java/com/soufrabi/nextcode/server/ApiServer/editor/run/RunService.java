package com.soufrabi.nextcode.server.ApiServer.editor.run;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class RunService {
    private final RestClient restClient;

    RunService(@Value("${rcee.baseurl}") String rceeBaseUrl) {
        restClient = RestClient.builder()
                .baseUrl(rceeBaseUrl).
                build();
    }

    RunResponse run(RunRequest runRequest) {
        RunRceeRequest runRceeRequest = new RunRceeRequest(
                runRequest.sourceCode(),
                runRequest.inputText(),
                1_000,
                0,
                0,
                10,
                32_000_000,
                32_000_000,
                1_000
        );

        RunRceeResponse runRceeResponse = restClient.post()
                .uri("/run")
                .contentType(MediaType.APPLICATION_JSON)
                .body(runRceeRequest)
                .retrieve()
                .body(RunRceeResponse.class);

        return new RunResponse(
                runRceeResponse.stdout(),
                runRceeResponse.stderr(),
                "",
                "0ms",
                false,
                ""
        );
    }


}
