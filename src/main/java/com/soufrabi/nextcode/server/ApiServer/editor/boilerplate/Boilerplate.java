package com.soufrabi.nextcode.server.ApiServer.editor.boilerplate;

import com.soufrabi.nextcode.server.ApiServer.editor.language.ProgrammingLanguage;
import org.springframework.data.annotation.Id;
import org.springframework.data.jdbc.core.mapping.AggregateReference;

public record Boilerplate(
        @Id
        Integer id,
        String name,
        String content,
        AggregateReference<ProgrammingLanguage, Integer> languageId
) {
       public Boilerplate {
               if ( name.isEmpty() ) {
                       throw new IllegalArgumentException("Boilerplate name cannot be empty");
               }
       }
}
