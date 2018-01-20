package org.waybe.tours.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tour")
public class Tour {

    @Id
    private String id;

    private String name;

    //TODO: should it be a Point in a map?
    private String location;

    private String description;

    private List<String> languages;

    private String urlImage;

    private Double cost;

    private int rate;

    private Boolean isShared;

    public Tour() {
    }

    public Tour(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getLanguages() {
        return this.languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public String getUrlImage() {
        return this.urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public Double getCost() {
        return this.cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public int getRate() {
        return this.rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Boolean getIsShared() {
        return this.isShared;
    }

    public void setIsShared(Boolean isShared) {
        this.isShared = isShared;
    }

    @Override
    public String toString() {
        return "Tour " + this.name;
    }
}
