package com.soufrabi.nextcode.server.ApiServer.problem;

import java.time.Instant;

public record ProblemSubmitRequest(
        String sourceCode,
        Instant submittedOn,
        Long problemId,
        Integer languageId
) {
}
