package com.soufrabi.nextcode.server.ApiServer.editor.run;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/editor/run")
public class RunController {
    private final RunService runService;

    RunController(RunService runService) {
        this.runService = runService;
    }

    @GetMapping("")
    String home() {
        return "Run API";
    }

    @PostMapping("")
    RunResponse post(@RequestBody RunRequest runRequest) {
        try {
            return runService.run(runRequest);
        } catch (Exception e) {
            return new RunResponse(
                    "",
                    "",
                    "Current Time : " + java.time.LocalDateTime.now().toString(),
                    "0ms",
                    true,
                    "INTERNAL_SERVER_ERROR"
            );
        }
    }
}
