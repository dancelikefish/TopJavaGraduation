package ru.restaurantvoting.model;

public class Dish extends AbstractNamedEntity {

    private String description;

    private Integer calories;

    public Dish(Integer id, String name, String description, Integer calories) {
        super(id, name);
        this.description = description;
        this.calories = calories;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }
}
