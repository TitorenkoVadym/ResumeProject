package com.vadim.resume.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "hobby")
public class Hobby extends AbstractEntity<Long> implements Serializable, Comparable<Hobby> , ProfileEntity{

    @Id
    @SequenceGenerator(name="HOBBY_ID_GENERATOR", sequenceName="HOBBY_SEQ", allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="HOBBY_ID_GENERATOR")
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(nullable = false, length = 30)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_profile", nullable = false)
    private Profile profile;

    private boolean selected;

    public Hobby() {
        super();
    }

    public Hobby(String name) {
        super();
        this.name = name;
    }

    public Hobby(String name, boolean selected) {
        super();
        this.name = name;
        this.selected = selected;
    }


    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    @Transient
    public String getCssClassName(){
        return name.replace(" ","-").toLowerCase();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hobby hobby = (Hobby) o;
        return selected == hobby.selected &&
                Objects.equals(id, hobby.id) &&
                Objects.equals(name, hobby.name) &&
                Objects.equals(profile, hobby.profile);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 0;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public int compareTo(Hobby o) {
        if(o==null||getName()==null) {
            return 1;
        }else {
            return getName().compareTo(o.getName());
        }
    }

    @Override
    public String toString() {
        return String.format("Hobby[name=%s]",name);
    }
}


