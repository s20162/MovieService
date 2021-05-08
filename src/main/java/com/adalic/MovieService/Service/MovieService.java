package com.adalic.MovieService.Service;

import com.adalic.MovieService.Model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    public List<Movie> getAllMovies() {
        Movie movie1 = new Movie(1L, "name1", "dic1", Movie.Category.cat1, Movie.Lang.ang);
        Movie movie2 = new Movie(2L, "name2", "dic2", Movie.Category.cat2, Movie.Lang.pl);
        Movie movie3 = new Movie(3L, "name3", "dic3", Movie.Category.cat3, Movie.Lang.rus);

        return List.of(movie1, movie2, movie3);
    }
    public Movie getMovieByID(Long ID) {

        Movie movie = new Movie(ID, "name1", "dic1", Movie.Category.cat1, Movie.Lang.ang);
        return movie;

    }
    public Movie createMovie() {
        Movie movie = new Movie(1L, "name1", "dic1", Movie.Category.cat1, Movie.Lang.ang);
        return movie;
    }
}
