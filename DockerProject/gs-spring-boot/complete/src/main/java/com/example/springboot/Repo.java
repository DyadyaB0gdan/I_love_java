package com.example.springboot;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repo extends MongoRepository<Model, String> {

    Model findStringById(Integer id);

}