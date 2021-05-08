package com.adalic.MovieService.Model;


import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Movie {

    public enum Category {
        cat1, cat2, cat3, cat4
    }
    public enum Lang {
        pl,ang,rus
    }
    private Long ID;
    private String name;
    private String director;
    private Category cat;
    private Lang lang;


    public Category getCat() {
        return cat;
    }

    public void setCat(Category cat) {
        this.cat = cat;
    }

    public Lang getLang() {
        return lang;
    }

    public void setLang(Lang lang) {
        this.lang = lang;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Movie(Long ID, String name, String director, Category cat, Lang lang) {
        this.ID = ID;
        this.name = name;
        this.director = director;
        this.cat = cat;
        this.lang = lang;
    }
}
