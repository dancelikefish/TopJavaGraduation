package ru.restaurantvoting.to;

import ru.restaurantvoting.model.Dish;
import ru.restaurantvoting.model.Vote;

import java.util.Arrays;
import java.util.List;

public class RestaurantTo {

    private Integer id;

    private String name;

    private String description;

    private Vote votes;

    private List<Dish> dishes;

    public RestaurantTo(Integer id, String name, String description, Vote votes, List<Dish> dishes) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.votes = votes;
        this.dishes = dishes;
    }

    public RestaurantTo(Integer id, String name, String description, Vote votes, Dish...dishes) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.votes = votes;
        this.dishes = Arrays.asList(dishes);
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Vote getVotes() {
        return votes;
    }

    public void setVotes(Vote votes) {
        this.votes = votes;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    @Override
    public String toString() {
        return "RestaurantTo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", votes=" + votes +
                ", dishes=" + dishes +
                '}';
    }
}
