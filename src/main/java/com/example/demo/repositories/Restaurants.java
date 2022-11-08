package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel = "restaurants", path = "restaurants")
@Repository
public interface Restaurants extends JpaRepository<com.example.demo.model.Restaurants, Long> {

}
