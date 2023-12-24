package com.coursAPI.cours.Repository;

import com.coursAPI.cours.Model.Cour;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CourRepository extends MongoRepository<Cour,String> {

}
