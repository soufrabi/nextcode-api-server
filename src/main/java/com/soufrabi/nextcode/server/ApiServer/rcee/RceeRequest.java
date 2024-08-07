package com.soufrabi.nextcode.server.ApiServer.rcee;

public record RceeRequest(
        Integer languageId,
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
