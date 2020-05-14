package com.vadim.resume.controller;

import com.vadim.resume.entity.Profile;
import com.vadim.resume.service.FindProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @Autowired
    private FindProfileService findProfileService;

    @RequestMapping(value = "/welcome")
    public String listAll(Model model){
        Page<Profile> profiles = findProfileService.findAll(new PageRequest(0, 20, new Sort("id")));
        model.addAttribute("profiles", profiles.getContent());
        model.addAttribute("page",profiles);
        return "welcome";
    }

}
