package com.vadim.resume.controller;

import com.vadim.resume.entity.Profile;
import com.vadim.resume.repository.storage.ProfileRepository;
import com.vadim.resume.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PublicDataController {

	@Autowired
	private ProfileRepository profileRepository;

	@RequestMapping(value="/{uid}", method=RequestMethod.GET)
	public String getProfile(@PathVariable("uid") String uid, Model model){
		Profile profile = profileRepository.findByUid(uid);
		if (profile==null){
			return "profile-not-found";
		}
		model.addAttribute("profile",profile);
		return "profile";
	}

	@RequestMapping(value="/error", method= RequestMethod.GET)
	public String getError(){
		return "error";
	}
}