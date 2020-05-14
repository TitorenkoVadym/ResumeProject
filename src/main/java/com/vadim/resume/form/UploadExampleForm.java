package com.vadim.resume.form;

import org.springframework.web.multipart.MultipartFile;

public class UploadExampleForm {

    private String name;
    private MultipartFile multipartFile;

    public UploadExampleForm() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }
}
