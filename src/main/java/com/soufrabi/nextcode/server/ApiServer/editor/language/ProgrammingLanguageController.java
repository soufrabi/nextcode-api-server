package com.soufrabi.nextcode.server.ApiServer.editor.language;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/editor/language")
public class ProgrammingLanguageController {
    ProgrammingLanguageRepository programmingLanguageRepository ;

    ProgrammingLanguageController(ProgrammingLanguageRepository programmingLanguageRepository){
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @GetMapping("/all")
    List<ProgrammingLanguage> getAll(){
        return programmingLanguageRepository.findAll();
    }
}
