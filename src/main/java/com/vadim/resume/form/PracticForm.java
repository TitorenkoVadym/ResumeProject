package com.vadim.resume.form;

import com.vadim.resume.entity.Practic;

import java.util.ArrayList;
import java.util.List;

public class PracticForm {
    private List<Practic> items = new ArrayList<>();

    public PracticForm() {
        super();
    }

    public PracticForm(List<Practic> items) {
        super();
        this.items = items;
    }

    public List<Practic> getItems() {
        return items;
    }

    public void setItems(List<Practic> items) {
        this.items = items;
    }
}
