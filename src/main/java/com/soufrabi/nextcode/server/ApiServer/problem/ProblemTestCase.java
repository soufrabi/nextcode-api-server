package com.soufrabi.nextcode.server.ApiServer.problem;

import org.springframework.data.annotation.Id;
import org.springframework.data.jdbc.core.mapping.AggregateReference;

public record ProblemTestCase(
        @Id
        Long testCaseId,
        String input,
        String output,
        AggregateReference<Problem,Long> problemId
) {
}
