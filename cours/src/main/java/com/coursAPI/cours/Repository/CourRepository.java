package com.coursAPI.cours.Repository;

import com.coursAPI.cours.Model.Cour;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourRepository extends MongoRepository<Cour,String> {

}
