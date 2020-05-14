package com.vadim.resume.service.impl;

import com.vadim.resume.entity.Profile;
import com.vadim.resume.repository.storage.ProfileRepository;
import com.vadim.resume.service.FindProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FindProfileServiceImpl implements FindProfileService {

    @Autowired
    ProfileRepository profileRepository;

    @Override
    public Page<Profile> findAll(Pageable pageable) {
        return profileRepository.findAllByCompletedTrue(pageable);
    }
}
