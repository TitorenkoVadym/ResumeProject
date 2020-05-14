package com.vadim.resume.service;

import com.sun.istack.internal.NotNull;
import com.vadim.resume.model.LanguageLevel;
import com.vadim.resume.model.LanguageType;

import java.util.EnumSet;

public interface StaticDataService {
    @NotNull
    EnumSet<LanguageLevel> findAllLanguageTypes();
    @NotNull
    EnumSet<LanguageType> findAllLanguageLevels();
}
