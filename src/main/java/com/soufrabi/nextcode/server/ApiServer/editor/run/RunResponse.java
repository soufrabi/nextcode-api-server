package com.soufrabi.nextcode.server.ApiServer.editor.run;

public record RunResponse(
        String stdout,
        String stderr,
        String execErr,
        String timeElapsed,
        Boolean isError,
        String errorType
) {
}
