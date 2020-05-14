package com.vadim.resume.service;

import com.sun.istack.internal.NotNull;
import com.vadim.resume.entity.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FindProfileService {
    @NotNull Page<Profile> findAll(@NotNull Pageable pageable);
}
