package com.vadim.resume.form;

import com.vadim.resume.entity.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseForm {
    private List<Course> items = new ArrayList<>();

    public CourseForm() {
        super();
    }

    public CourseForm(List<Course> items) {
        super();
        this.items = items;
    }

    public List<Course> getItems() {
        return items;
    }

    public void setItems(List<Course> items) {
        this.items = items;
    }
}
