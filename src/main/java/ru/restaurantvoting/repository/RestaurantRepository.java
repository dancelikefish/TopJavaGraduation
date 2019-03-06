package ru.restaurantvoting.repository;

import ru.restaurantvoting.model.Restaurant;

import java.util.List;

public interface RestaurantRepository {

   Restaurant create(Restaurant restaurant);

   boolean delete(int id);

   Restaurant get(int id);

   List<Restaurant> getAll();
}
