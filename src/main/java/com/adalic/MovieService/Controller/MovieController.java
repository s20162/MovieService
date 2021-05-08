package com.adalic.MovieService.Controller;

import com.adalic.MovieService.Model.Movie;
import com.adalic.MovieService.Service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/{ID}")
    public ResponseEntity<Movie> getMovieByID(@PathVariable Long ID) {

        if (ID instanceof Long) {
            return ResponseEntity.ok(movieService.getMovieByID(ID));
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping
    public ResponseEntity<Movie> createMovieFromBody(@RequestBody Movie movie) {
        Movie newmovie = movieService.createMovie();
        return ResponseEntity.ok(newmovie);
    }



}
