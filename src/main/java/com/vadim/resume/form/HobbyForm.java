package com.vadim.resume.form;

import com.vadim.resume.entity.Hobby;

import java.util.ArrayList;
import java.util.List;

public class HobbyForm {
    private List<Hobby> items = new ArrayList<>();

    public HobbyForm() {
        super();
    }

    public HobbyForm(List<Hobby> items) {
        super();
        this.items = items;
    }

    public List<Hobby> getItems() {
        return items;
    }

    public void setItems(List<Hobby> items) {
        this.items = items;
    }
}
