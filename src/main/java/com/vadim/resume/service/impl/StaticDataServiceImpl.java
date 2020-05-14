package com.vadim.resume.service.impl;

import com.vadim.resume.model.LanguageLevel;
import com.vadim.resume.model.LanguageType;
import com.vadim.resume.service.StaticDataService;
import org.springframework.stereotype.Service;

import java.util.EnumSet;

@Service
public class StaticDataServiceImpl implements StaticDataService {
    @Override
    public EnumSet<LanguageLevel> findAllLanguageTypes() {
        return EnumSet.allOf(LanguageLevel.class);
    }

    @Override
    public EnumSet<LanguageType> findAllLanguageLevels() {
        return EnumSet.allOf(LanguageType.class);
    }
}
