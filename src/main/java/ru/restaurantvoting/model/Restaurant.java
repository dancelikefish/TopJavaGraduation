package ru.restaurantvoting.model;

public class Restaurant extends AbstractNamedEntity{

    private String description;

    public Restaurant(Integer id, String name, String description) {
        super(id, name);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
