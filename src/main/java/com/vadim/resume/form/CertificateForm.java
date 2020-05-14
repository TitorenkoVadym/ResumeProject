package com.vadim.resume.form;

import com.vadim.resume.entity.Certificate;

import java.util.ArrayList;
import java.util.List;

public class CertificateForm {
    private List<Certificate> items = new ArrayList<>();

    public CertificateForm() {
        super();
    }

    public CertificateForm(List<Certificate> items) {
        super();
        this.items = items;
    }

    public List<Certificate> getItems() {
        return items;
    }

    public void setItems(List<Certificate> items) {
        this.items = items;
    }
}
