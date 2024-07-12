package com.soufrabi.nextcode.server.ApiServer.editor.boilerplate;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface BoilerplateRepository extends ListCrudRepository<Boilerplate, Integer> {
    List<Boilerplate> findByLanguageId(Integer languageId);
}
