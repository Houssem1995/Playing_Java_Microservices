package dto;


public class ReservationDto {

    private Long idReservtion;


    private Long traineeID;




    private Long whorkshopID;


    private String reservationDate;

    public ReservationDto() {

        //JAKSON
    }


    public ReservationDto(Long traineeID, Long whorkshopID, String reservationDate) {
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

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }
}
