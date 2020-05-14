package com.vadim.resume.form;

import com.vadim.resume.entity.Language;

import java.util.ArrayList;
import java.util.List;

public class LanguageForm {
    private List<Language> items = new ArrayList<>();

    public LanguageForm() {
        super();
    }

    public LanguageForm(List<Language> items) {
        super();
        this.items = items;
    }

    public List<Language> getItems() {
        return items;
    }

    public void setItems(List<Language> items) {
        this.items = items;
    }
}
