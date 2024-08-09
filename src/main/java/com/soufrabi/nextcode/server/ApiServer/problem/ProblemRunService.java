package com.soufrabi.nextcode.server.ApiServer.problem;

import org.springframework.stereotype.Service;

@Service
class ProblemRunService {


    ProblemRunResponse run (ProblemRunRequest problemRunRequest){
        return new ProblemRunResponse("problem run request has been received");
    }
}
