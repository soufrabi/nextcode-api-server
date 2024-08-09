package com.soufrabi.nextcode.server.ApiServer.problem;

import java.time.Instant;
import java.util.List;

public record ProblemRunRequest(
        String sourceCode,
        Instant submittedOn,
        List<ProblemRunTestCase> testCases,
        Long problemId,
        Integer languageId
) {
}
