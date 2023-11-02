package com.example.cinema.model;

import jakarta.persistence.*;

@Entity
@Table(name = "springcinema")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column (name="title")
    private String title;
    @Column (name="rating")
    private int rating;
    @Column (name="duration")
    private int duration;

    public Movie(String title, int rating, int duration) {
        this.title = title;
        this.rating = rating;
        this.duration = duration;

    }

    public Movie() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
