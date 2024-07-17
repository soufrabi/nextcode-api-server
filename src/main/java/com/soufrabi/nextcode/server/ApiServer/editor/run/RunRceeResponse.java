package com.soufrabi.nextcode.server.ApiServer.editor.run;

public record RunRceeResponse(
        String stdout,
        String stderr,
        String status,
        String exitCode,
        String time,
        String wallTime,
        String memory
) {
}
