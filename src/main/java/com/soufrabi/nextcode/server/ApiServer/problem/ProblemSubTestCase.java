package com.soufrabi.nextcode.server.ApiServer.problem;

import org.springframework.data.jdbc.core.mapping.AggregateReference;

public record ProblemSubTestCase(
        Long id,
        String input,
        String output,
        AggregateReference<ProblemTestCase,Long> problemTestCaseId
) {
}
