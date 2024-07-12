package com.soufrabi.nextcode.server.ApiServer.editor.run;

public record RunRequest(
        Integer languageId,
        String sourceCode,
        String inputText,
        Integer compilerTimeLimit,
        Integer executionTimeLimit,
        Integer bufferMaxSize
) {
}
