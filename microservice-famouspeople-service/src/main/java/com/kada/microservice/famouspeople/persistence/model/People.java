package com.kada.microservice.famouspeople.persistence.model;

import javax.persistence.*;

@Entity
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String born;

    @Column(nullable = false)
    private String dead;

    @Column(nullable = false)
    private String pays;

    @Column(nullable = false)
    private String biography;

    @Column(nullable = false)
    private String knownFact;

    public People() {
    }

    public People(String name, String born, String dead, String pays, String biography, String knownFact) {
        this.name = name;
        this.born = born;
        this.dead = dead;
        this.pays = pays;
        this.biography = biography;
        this.knownFact = knownFact;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getDead() {
        return dead;
    }

    public void setDead(String dead) {
        this.dead = dead;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getKnownFact() {
        return knownFact;
    }

    public void setKnownFact(String knownFact) {
        this.knownFact = knownFact;
    }
}
