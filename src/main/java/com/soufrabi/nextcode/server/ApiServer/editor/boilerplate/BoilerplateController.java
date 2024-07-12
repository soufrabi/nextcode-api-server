package com.soufrabi.nextcode.server.ApiServer.editor.boilerplate;

import com.soufrabi.nextcode.server.ApiServer.editor.language.ProgrammingLanguage;
import org.springframework.data.jdbc.core.mapping.AggregateReference;
import org.springframework.web.bind.annotation.*;

import java.util.List;

record CreateBoilerplateRequest(
        String name,
        String content,
        Integer languageId
) {
}

@RestController
@RequestMapping("/editor/boilerplate")
public class BoilerplateController {
    BoilerplateRepository boilerplateRepository;

    BoilerplateController(BoilerplateRepository boilerplateRepository) {
        this.boilerplateRepository = boilerplateRepository;
    }

    @GetMapping("/all")
    List<Boilerplate> findAll() {
        return boilerplateRepository.findAll();
    }

    @GetMapping("/{id}")
    List<Boilerplate> findByLanguageId(@PathVariable("id") Integer languageId) {
        return boilerplateRepository.findByLanguageId(languageId);
    }

    @PostMapping("")
    void create(@RequestBody CreateBoilerplateRequest requestBody) {
        AggregateReference<ProgrammingLanguage, Integer> languageId = AggregateReference.to(requestBody.languageId());
        boilerplateRepository.save(new Boilerplate(null, requestBody.name(),  requestBody.content(), languageId));
    }

    @PutMapping("/{id}")
    void update(@RequestBody String content, @PathVariable("id") Integer boilerplateId) {


    }

}
