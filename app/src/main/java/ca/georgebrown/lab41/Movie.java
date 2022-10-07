package ca.georgebrown.lab41;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private Integer year;
    public static List<Movie> items = new ArrayList<>();

    public Movie(String title, Integer year) {
        this.title = title;
        this.year = year;
    }

    public static void generate(){
        items.add(new Movie("Movie1", 1998));
        items.add(new Movie("Movie2", 2000));
        items.add(new Movie("Movie3", 2020));


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
