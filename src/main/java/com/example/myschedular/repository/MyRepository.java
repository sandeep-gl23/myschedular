package com.example.myschedular.repository;

import com.example.myschedular.model.Model;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepository extends MongoRepository<Model,String> {
}
