package dto;

public class TrainerDto {


    private Long idCardTrainer;
    private String firstName;
    private String lastName;
    private String email;
    private String specialty;


    public TrainerDto() {
        //Jackson
    }

    public TrainerDto(Long idCardTrainer, String firstName, String lastName, String email, String specialty) {
        this.idCardTrainer=idCardTrainer;
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
}


