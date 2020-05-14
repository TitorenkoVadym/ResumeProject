package com.vadim.resume.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EditProfileController {


	@RequestMapping(value="/edit", method=RequestMethod.GET)
	public String getEditProfile(){
		return "edit";
	}

    @RequestMapping(value="/edit/contacts", method= RequestMethod.GET)
    public String getContacts(){
        return "edit/edit-contacts";
    }

    @RequestMapping(value="/edit/practice", method= RequestMethod.GET)
    public String getPractice(){
        return "edit/edit-practice";
    }

    @RequestMapping(value="/edit/certificates", method= RequestMethod.GET)
    public String getCertificates(){
        return "edit/edit-certificates";
    }

    @RequestMapping(value="/edit/edit-courses", method= RequestMethod.GET)
    public String getCourses(){
        return "edit/edit-courses";
    }

    @RequestMapping(value="/edit/education", method= RequestMethod.GET)
    public String getEducation(){
        return "edit/edit-education";
    }

    @RequestMapping(value="/edit/hobbies", method= RequestMethod.GET)
    public String getHobbies(){
        return "edit/edit-hobbies";
    }

    @RequestMapping(value="/edit/info", method= RequestMethod.GET)
    public String getInfo(){
        return "edit/edit-info";
    }

    @RequestMapping(value="/edit/password", method= RequestMethod.GET)
    public String getPassword(){
        return "edit/edit-password";
    }
}
