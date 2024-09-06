package com.soufrabi.nextcode.server.ApiServer.problem;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/problem/submit")
public class ProblemSubmitController {
    ProblemSubmitService problemSubmitService;

    ProblemSubmitController(ProblemSubmitService problemSubmitService){
        this.problemSubmitService = problemSubmitService;
    }


    @PostMapping("")
    ProblemSubmitResponse submit(@RequestBody ProblemSubmitRequest problemSubmitRequest){
        return problemSubmitService.submit(problemSubmitRequest);
    }

}
