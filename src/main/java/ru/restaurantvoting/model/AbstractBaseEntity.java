package ru.restaurantvoting.model;

public abstract class AbstractBaseEntity {
    private Integer id;

    public AbstractBaseEntity() {
    }

    public AbstractBaseEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
