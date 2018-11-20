package com.ilsi.ensi.workshop.Entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="Reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idReservtion;



    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idCard", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Trainee trainee;




    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Workshop whorkshop;


    @NotNull
    @Column(name="reservationDate")
    private LocalDate reservationDate;

    public Reservation() {
        //JPA
    }

    public Reservation(Trainee trainee, Workshop whorkshop, LocalDate reservationDate) {
        this.trainee = trainee;
        this.whorkshop = whorkshop;
        this.reservationDate = reservationDate;
    }

    public Long getIdReservtion() {
        return idReservtion;
    }

    public void setIdReservtion(Long idReservtion) {
        this.idReservtion = idReservtion;
    }

    public Trainee getTrainee() {
        return trainee;
    }

    public void setTrainee(Trainee trainee) {
        this.trainee = trainee;
    }

    public Workshop getWhorkshop() {
        return whorkshop;
    }

    public void setWhorkshop(Workshop whorkshop) {
        this.whorkshop = whorkshop;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return Objects.equals(idReservtion, that.idReservtion) &&
                Objects.equals(whorkshop, that.whorkshop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idReservtion, whorkshop);
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "trainee=" + trainee +
                ", whorkshop=" + whorkshop +
                ", reservationDate=" + reservationDate +
                '}';
    }
}
