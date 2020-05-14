package com.vadim.resume.service;

import com.sun.istack.internal.NotNull;
import com.vadim.resume.entity.Language;
import com.vadim.resume.model.CurrentProfile;

import java.util.List;

public interface EditProfileService {
    @NotNull
    List<Language> findLanguages(@NotNull CurrentProfile currentProfile);
    void updateLanguages(@NotNull CurrentProfile currentProfile, @NotNull List<Language> languages);

}
