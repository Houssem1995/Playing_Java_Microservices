package dto;

public class Workshop_CenterDto {

    private Long idCenter;
    private String nameCenter;
    private String Contact;

    public Workshop_CenterDto() {
    }

    public Workshop_CenterDto(String nameCenter, String contact) {
        this.nameCenter = nameCenter;
        Contact = contact;
    }


    public Long getIdCenter() {
        return idCenter;
    }

    public void setIdCenter(Long idCenter) {
        this.idCenter = idCenter;
    }

    public String getNameCenter() {
        return nameCenter;
    }

    public void setNameCenter(String nameCenter) {
        this.nameCenter = nameCenter;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }
}
