package com.example.cinema.Service;

import com.example.cinema.model.Movie;
import com.example.cinema.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public MovieService() {
    }

    public void addMovie(Movie movie){
        movieRepository.save(movie);
    }

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(long id){
        assert movieRepository != null;
        return movieRepository.findById(id);
    }

}
