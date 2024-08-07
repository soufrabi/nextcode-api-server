package com.soufrabi.nextcode.server.ApiServer.rcee;

public record RceeResponse(
        String stdout,
        String stderr,
        String status,
        String exitCode,
        String time,
        String wallTime,
        String memory
) {
}
