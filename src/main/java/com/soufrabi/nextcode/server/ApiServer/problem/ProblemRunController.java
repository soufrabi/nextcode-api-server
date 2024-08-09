package com.soufrabi.nextcode.server.ApiServer.problem;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/problem/run")
public class ProblemRunController {

    ProblemRunService problemRunService;

    ProblemRunController(ProblemRunService problemRunService){
        this.problemRunService = problemRunService;
    }

    @PostMapping("")
    ProblemRunResponse submit(@RequestBody ProblemRunRequest problemRunRequest) {
        return problemRunService.run(problemRunRequest);
    }

}
