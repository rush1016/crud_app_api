package com.crud.project.crud_project.services.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.crud.project.crud_project.entities.MovieEntity;
import com.crud.project.crud_project.models.request.MovieRequest;
import com.crud.project.crud_project.repositories.MovieRepository;
import com.crud.project.crud_project.services.MovieService;

@Service
public class MovieServiceImpl implements MovieService{
    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    
    @Override
    public List<MovieEntity> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public MovieEntity getMovieById(Long id) {
        Optional<MovieEntity> optionalMovieEntity = movieRepository.findById(id);

        if (optionalMovieEntity.isEmpty()) {
            throw new RuntimeException("No movie found with id = " + id);
        }
        return optionalMovieEntity.get();
    }

    @Override
    public MovieEntity addMovie(MovieRequest request) {
        MovieEntity movieEntity = new MovieEntity();
        movieEntity.setTitle(request.getTitle());
        movieEntity.setDescription(request.getDescription());
        movieEntity.setCreatedDate(LocalDate.now());
        return movieRepository.save(movieEntity);
    }

    @Override
    public MovieEntity updateMovie(Long id, MovieRequest request) {
        Optional<MovieEntity> optionalMovieEntity = movieRepository.findById(id);

        if (optionalMovieEntity.isEmpty()) {
            throw new RuntimeException("No movie found with id = " + id);
        }

        MovieEntity entityToBeUpdated = optionalMovieEntity.get();
        entityToBeUpdated.setTitle(request.getTitle());
        entityToBeUpdated.setDescription(request.getDescription());
        entityToBeUpdated.setUpdatedDate(LocalDate.now());
        return movieRepository.save(entityToBeUpdated);
    }

    @Override
    public void deleteMovie(Long id) {
        Optional<MovieEntity> optionalMovieEntity = movieRepository.findById(id);

        if (optionalMovieEntity.isEmpty()) {
            throw new RuntimeException("No movie found with id = " + id);
        }
        movieRepository.delete(optionalMovieEntity.get());
    }
    
}
