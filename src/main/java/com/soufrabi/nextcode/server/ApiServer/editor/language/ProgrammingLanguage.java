package com.soufrabi.nextcode.server.ApiServer.editor.language;

import org.springframework.data.annotation.Id;

public record ProgrammingLanguage(
        @Id
        Integer id,
        String name,
        String monaco,
        Boolean available
) {
}
