package com.springbootlearning.learningspringboot3.ch2.domain;

import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
}
