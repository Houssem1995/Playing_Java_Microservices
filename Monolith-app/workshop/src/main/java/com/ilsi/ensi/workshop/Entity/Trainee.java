package com.ilsi.ensi.workshop.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="Trainee")
public class Trainee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCard;


    @NotNull
    @Column(name = "firstName")
    private String firstName;

    @NotNull
    @Column(name="lastName")
    private String lastName;

    @NotNull
    @Column(name="email")
    private String email;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "trainee")
    private List<Reservation> reservation = new ArrayList<>();

    public Trainee() {
        //JPA
    }

    public Trainee(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Long getIdCard() {
        return idCard;
    }

    public void setIdCard(Long idCard) {
        this.idCard = idCard;
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

    public List<Reservation> getReservation() {
        return reservation;
    }

    public void setReservation(List<Reservation> reservation) {
        this.reservation = reservation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainee trainee = (Trainee) o;
        return Objects.equals(firstName, trainee.firstName) &&
                Objects.equals(lastName, trainee.lastName) &&
                Objects.equals(reservation, trainee.reservation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, reservation);
    }


}
