package ru.restaurantvoting.model;

public class Vote extends AbstractBaseEntity {

    private Integer votes;

    public Vote(int id, Integer vote) {
        super(id);
        this.votes = vote;
    }

    public Integer getVote() {
        return votes;
    }

    public void setVote(Integer vote) {
        this.votes = vote;
    }
}
