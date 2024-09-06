package com.soufrabi.nextcode.server.ApiServer.problem;

import org.springframework.stereotype.Service;

@Service
public class ProblemSubmitService {

    ProblemSubmitResponse submit(ProblemSubmitRequest problemSubmitRequest){
        return new ProblemSubmitResponse("received request for problem submission");
    }
}
