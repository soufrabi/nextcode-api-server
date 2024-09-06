package com.soufrabi.nextcode.server.ApiServer.problem;

import org.springframework.data.annotation.Id;
import org.springframework.data.jdbc.core.mapping.AggregateReference;

public record ProblemTestCase(
        @Id
        Long problemTestCaseId,
        AggregateReference<Problem,Long> problemId
) {
}
