package com.soufrabi.nextcode.server.ApiServer.problem;

import org.springframework.data.annotation.Id;

public record Problem(
        @Id
        Long problemId,
        Long name
) {
}
