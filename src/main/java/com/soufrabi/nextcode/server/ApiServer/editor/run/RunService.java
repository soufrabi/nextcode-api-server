package com.soufrabi.nextcode.server.ApiServer.editor.run;

import com.soufrabi.nextcode.server.ApiServer.rcee.RceeRequest;
import com.soufrabi.nextcode.server.ApiServer.rcee.RceeResponse;
import com.soufrabi.nextcode.server.ApiServer.rcee.RceeService;
import org.springframework.stereotype.Service;

@Service
public class RunService {
    private final RceeService rceeService;

    RunService(RceeService rceeService) {
        this.rceeService = rceeService;
    }

    RunResponse run(RunRequest runRequest) {
        RceeRequest rceeRequest = new RceeRequest(
                runRequest.languageId(),
                runRequest.sourceCode(),
                runRequest.inputText(),
                runRequest.executionTimeLimit(),
                0,
                0,
                10,
                64_000,
                32_000,
                1_000
        );

        RceeResponse rceeResponse = rceeService.run(rceeRequest);

        return new RunResponse(
                rceeResponse.stdout(),
                rceeResponse.stderr(),
                "",
                rceeResponse.time() + "/" + rceeResponse.wallTime(),
                !rceeResponse.exitCode().equals("0"),
                ""
        );
    }


}
