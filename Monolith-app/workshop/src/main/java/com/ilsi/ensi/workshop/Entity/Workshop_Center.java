package com.ilsi.ensi.workshop.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="Workshop_Center")
public class Workshop_Center {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCenter;


    @Column(name="nameCenter")
    private String nameCenter;


    @Column(name="Contact")
    private String Contact;



    public Workshop_Center() {
        //JPA
    }

    public Workshop_Center(String nameCenter, String contact) {
        this.nameCenter = nameCenter;
        Contact = contact;
    }


    public Long getIdCenter() {
        return idCenter;
    }


    public void setIdCenter(Long idCenter) {
        this.idCenter = idCenter;
    }

    public String getNameCenter() {
        return nameCenter;
    }

    public void setNameCenter(String nameCenter) {
        this.nameCenter = nameCenter;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Workshop_Center that = (Workshop_Center) o;
        return Objects.equals(idCenter, that.idCenter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCenter);
    }


    @Override
    public String toString() {
        return "Workshop_Center{" +
                "nameCenter='" + nameCenter + '\'' +
                ", Contact='" + Contact + '\'' +
                '}';
    }
}
