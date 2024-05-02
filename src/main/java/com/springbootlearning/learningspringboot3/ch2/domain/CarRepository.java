package com.springbootlearning.learningspringboot3.ch2.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource
public interface CarRepository extends CrudRepository<Car,Long> {

    List<Car> findByBrand(@Param("brand") String brand);

    List<Car> findByColor(@Param("color") String color);

}
