package com.soufrabi.nextcode.server.ApiServer.editor.run;

public record RunRceeRequest(
        String sourceCode,
        String stdin,
        Integer cpuTimeLimit,
        Integer cpuExtraTime,
        Integer wallTimeLimit,
        Integer maxProcessesAndOrThreads,
        Integer memoryLimit,
        Integer stackLimit,
        Integer maxFileSize
) {
}
