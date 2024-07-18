package com.crud.project.crud_project.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.project.crud_project.entities.MovieEntity;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Long>{
    Optional<MovieEntity> findByTitleContaining(String title);
} 