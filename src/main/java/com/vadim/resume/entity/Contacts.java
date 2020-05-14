package com.vadim.resume.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Access(AccessType.FIELD)
public class Contacts implements Serializable {
    @Column(length = 80)
    private String skype;

    @Column(length = 255)
    private String facebook;

    @Column(length = 255)
    private String linkedin;

    @Column(length = 255)
    private String github;

    @Column(length = 255)
    private String stackoverflow;

    public Contacts() {
        super();
    }

    public Contacts(String skype, String facebook, String linkedin, String github, String stackoverflow) {
        this.skype = skype;
        this.facebook = facebook;
        this.linkedin = linkedin;
        this.github = github;
        this.stackoverflow = stackoverflow;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getStackoverflow() {
        return stackoverflow;
    }

    public void setStackoverflow(String stackoverflow) {
        this.stackoverflow = stackoverflow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacts contacts = (Contacts) o;
        return Objects.equals(skype, contacts.skype) &&
                Objects.equals(facebook, contacts.facebook) &&
                Objects.equals(linkedin, contacts.linkedin) &&
                Objects.equals(github, contacts.github) &&
                Objects.equals(stackoverflow, contacts.stackoverflow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skype, facebook, linkedin, github, stackoverflow);
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "skype='" + skype + '\'' +
                ", facebook='" + facebook + '\'' +
                ", linkedin='" + linkedin + '\'' +
                ", github='" + github + '\'' +
                ", stackoverflow='" + stackoverflow + '\'' +
                '}';
    }
}
