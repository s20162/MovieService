package com.adalic.MovieService.Interface;

import com.adalic.MovieService.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository  extends JpaRepository<Movie, Long> {

}
