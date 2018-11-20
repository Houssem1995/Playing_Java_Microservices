package com.ilsi.ensi.workshop.Dto;

import com.ilsi.ensi.workshop.Entity.Trainer;
import com.ilsi.ensi.workshop.Entity.Workshop_Center;

public class WorkshopDto {
    private Long id;
    private String title;
    private String description;
    private String field;
    private Workshop_Center workshop_Center;
    private Trainer trainer;

    public WorkshopDto() {
    }

    public WorkshopDto(String title, String description, String field, Workshop_Center workshop_Center, Trainer trainer) {
        this.title = title;
        this.description = description;
        this.field = field;
        this.workshop_Center = workshop_Center;
        this.trainer = trainer;
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

    public Workshop_Center getWorkshop_Center() {
        return workshop_Center;
    }

    public void setWorkshop_Center(Workshop_Center workshop_Center) {
        this.workshop_Center = workshop_Center;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
}
