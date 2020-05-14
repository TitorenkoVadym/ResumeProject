package com.vadim.resume.controller;


import com.vadim.resume.form.LanguageForm;
import com.vadim.resume.repository.storage.ProfileRepository;
import com.vadim.resume.service.StaticDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EditProfileLanguageController {

    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    private StaticDataService staticDataService;


    @RequestMapping(value="/edit/languages", method= RequestMethod.GET)
    public String getEditLanguages(Model model){
        model.addAttribute("languageForm",new LanguageForm(profileRepository.findOne(1L).getLanguages()));
        return gotoLanguagesJSP(model);
    }

    private String gotoLanguagesJSP(Model model){
        model.addAttribute("languageTypes",  staticDataService.findAllLanguageTypes());
        model.addAttribute("languageLevels", staticDataService.findAllLanguageLevels());
        return "edit/edit-languages";
    }

}
