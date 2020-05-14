package com.vadim.resume.model;


import javax.persistence.AttributeConverter;
import javax.persistence.Convert;

public enum LanguageLevel {

	BEGINNER,
	
	ELEMENTARY,
	
	PRE_INTERMEDIATE,
	
	INTERMEDIATE,
	
	UPPER_INTERMEDIATE,
	
	ADVANCED,
	
	PROFICIENCY;

	public int getSliderIntValue(){
		return ordinal();              //Returns the ordinal of this enumeration
	}
	
	public String getDbValue(){
		return name().toLowerCase();
	}


	@Convert
	public static class PersistJPAConverter implements AttributeConverter<LanguageLevel, String>{
		@Override
		public String convertToDatabaseColumn(LanguageLevel languageLevel) {
			return languageLevel.getDbValue();
		}

		@Override
		public LanguageLevel convertToEntityAttribute(String s) {
			return LanguageLevel.valueOf(s.toUpperCase());
		}
	}


}
