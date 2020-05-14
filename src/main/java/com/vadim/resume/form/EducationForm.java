package com.vadim.resume.form;

import com.vadim.resume.entity.Education;

import java.util.ArrayList;
import java.util.List;

public class EducationForm {
    private List<Education> items = new ArrayList<>();

    public EducationForm() {
        super();
    }

    public EducationForm(List<Education> items) {
        super();
        this.items = items;
    }

    public List<Education> getItems() {
        return items;
    }

    public void setItems(List<Education> items) {
        this.items = items;
    }
}
