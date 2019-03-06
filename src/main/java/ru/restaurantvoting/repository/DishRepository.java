package ru.restaurantvoting.repository;

import ru.restaurantvoting.model.Dish;

public interface DishRepository {

    Dish create(Dish dish, int restaurantId);

    boolean delete(int id);

    Dish get(int id);

    Dish getAll(int restaurantId);
}
