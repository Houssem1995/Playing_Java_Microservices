package com.ureservation.entity;



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




    private Long traineeID;





    private Long  whorkshopID;


    @NotNull
    @Column(name="reservationDate")
    private LocalDate reservationDate;

    public Reservation() {
        //JPA
    }

    public Reservation(Long traineeID, Long whorkshopID, LocalDate reservationDate) {
        this.traineeID = traineeID;
        this.whorkshopID = whorkshopID;
        this.reservationDate = reservationDate;
    }

    public Long getIdReservtion() {
        return idReservtion;
    }

    public void setIdReservtion(Long idReservtion) {
        this.idReservtion = idReservtion;
    }

    public Long getTraineeID() {
        return traineeID;
    }

    public void setTraineeID(Long traineeID) {
        this.traineeID = traineeID;
    }

    public Long getWhorkshopID() {
        return whorkshopID;
    }

    public void setWhorkshopID(Long whorkshop) {
        this.whorkshopID = whorkshopID;
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
                Objects.equals(whorkshopID, that.whorkshopID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idReservtion, whorkshopID);
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "trainee=" + traineeID +
                ", whorkshop=" + whorkshopID +
                ", reservationDate=" + reservationDate +
                '}';


    }


}
