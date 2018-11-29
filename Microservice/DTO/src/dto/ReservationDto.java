package dto;


import java.time.LocalDate;

public class ReservationDto {

    private Long idReservtion;


    private Long traineeID;




    private Long whorkshopID;


    private LocalDate reservationDate;

    public ReservationDto() {

        //JAKSON
    }


    public ReservationDto(Long traineeID, Long whorkshopID, LocalDate reservationDate) {
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

    public void setWhorkshopID(Long whorkshopID) {
        this.whorkshopID = whorkshopID;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }
}
