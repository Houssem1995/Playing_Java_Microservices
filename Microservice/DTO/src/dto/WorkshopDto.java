package dto;



public class WorkshopDto {
    private Long id;
    private String title;
    private String description;
    private String field;
    private Workshop_CenterDto workshop_Center1;
    private Long trainerID;

    public WorkshopDto() {
        //JACKSON
    }

    public WorkshopDto(String title, String description, String field, Workshop_CenterDto workshop_Center1, Long trainerID) {
        this.title = title;
        this.description = description;
        this.field = field;
        this.workshop_Center1 = workshop_Center1;
        this.trainerID = trainerID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Workshop_CenterDto getWorkshop_Center() {
        return workshop_Center1;
    }

    public void setWorkshop_Center(Workshop_CenterDto workshop_Center) {
        this.workshop_Center1 = workshop_Center;
    }

    public Long getTrainerID() {
        return trainerID;
    }

    public void setTrainerID(Long trainerID) {
        this.trainerID = trainerID;
    }
}
