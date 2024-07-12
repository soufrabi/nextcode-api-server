package com.soufrabi.nextcode.server.ApiServer.editor.language;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammingLanguageRepository extends ListCrudRepository<ProgrammingLanguage,Integer> {

}
