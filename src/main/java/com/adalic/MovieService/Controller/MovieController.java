package com.adalic.MovieService.Controller;

import com.adalic.MovieService.Model.Movie;
import com.adalic.MovieService.Service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sciezka")
public class MovieController {
   private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getMovies() {
        return ResponseEntity.ok(movieService.getAllMovies());
    }
}
