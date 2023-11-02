package com.example.cinema.controllers;

import com.example.cinema.Service.MovieService;
import com.example.cinema.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/movies")

public class MovieController {
    @Autowired
   MovieService movieService;

    @GetMapping
        public ResponseEntity<List<Movie>> getAllMovies(){
            return new ResponseEntity<>(movieService.getAllMovies(), HttpStatus.OK);
        }

    @GetMapping (value = "/{id}")
    public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable long id){
        return new ResponseEntity<>(movieService.getMovieById(id), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<String> addMovie(@RequestBody Movie movie){
        movieService.addMovie(movie);
        return new ResponseEntity<>("Saved Movie", HttpStatus.ACCEPTED);
    }
}
