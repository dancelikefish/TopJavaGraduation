package ru.restaurantvoting.repository;

import ru.restaurantvoting.model.User;

public interface UserRepository {

    User create(User user);

    boolean delete(int id);

    User get(int id);

    User getAll();
}
