package com.vadim.resume.form;

public class InfoForm {
    private String info;

    public InfoForm() {
        super();
    }

    public InfoForm(String info) {
        super();
        this.info = info;
    }

    public String getInfo() {
        return info != null ? info.trim() : null;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
