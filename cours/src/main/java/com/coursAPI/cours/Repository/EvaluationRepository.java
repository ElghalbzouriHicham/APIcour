package com.coursAPI.cours.Repository;

import com.coursAPI.cours.Model.Evaluation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EvaluationRepository extends MongoRepository<Evaluation,String> {
}
