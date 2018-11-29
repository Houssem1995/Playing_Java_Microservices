package dto;



import java.util.List;

public class TraineeDto {



    private Long idCard;
    private String firstName;
    private String lastName;
    private String email;
    public TraineeDto() {
        //JACKSON
    }


    public TraineeDto(String firstName, String lastName, String email, List<ReservationDto> reservation) {
        //JACKSON
    }


    public TraineeDto(String firstName, String lastName, String email) {
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
}
