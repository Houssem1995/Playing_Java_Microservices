package com.utrain.utrain.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;



@Entity

@Table(name="Trainer")
public class Trainer {
    @NotNull
    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCardTrainer;


    @NotNull
    @Column(name="firstName")
    private String firstName;

    @NotNull
    @Column(name="lastName")
    private String lastName;


    @NotNull
    @Column(name="email")
    private String email;


    @NotNull
    @Column(name="speciality")
    private String specialty;

    public Trainer() {
        //JPA
    }

    public Trainer(Long idCardTrainer,String firstName, String lastName, String email, String specialty) {
        this.idCardTrainer= idCardTrainer;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.specialty = specialty;
    }

    public Long getIdCardTrainer() {

        return idCardTrainer;
    }

    public void setIdCardTrainer(Long idCardTrainer) {
        this.idCardTrainer = idCardTrainer;
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

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
