package com.utrain.utrain.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name="Trainee")
public class Trainee {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCard1;


    @NotNull
    @Column(name = "firstName")
    private String firstName;

    @NotNull
    @Column(name="lastName")
    private String lastName;

    @NotNull
    @Column(name="email")
    private String email;



    public Trainee() {
        //JPA
    }

    public Trainee(Long idCard1 ,String firstName, String lastName, String email) {
        this.idCard1=idCard1;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Long getIdCard() {
        return idCard1;
    }

    public void setIdCard(Long idCard1) {
        this.idCard1 = idCard1;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainee trainee = (Trainee) o;
        return Objects.equals(firstName, trainee.firstName) &&
                Objects.equals(lastName, trainee.lastName) ;
    }




}
