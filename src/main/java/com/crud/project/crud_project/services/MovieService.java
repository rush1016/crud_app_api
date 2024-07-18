package com.crud.project.crud_project.services;

import java.util.List;

import com.crud.project.crud_project.entities.MovieEntity;
import com.crud.project.crud_project.models.request.MovieRequest;

public interface MovieService {
    public List<MovieEntity> getAllMovies();

    public MovieEntity getMovieById(Long id);
    
    public MovieEntity addMovie(MovieRequest request);
    
    public MovieEntity updateMovie(Long id, MovieRequest request);
    
    public void deleteMovie(Long id);
}
