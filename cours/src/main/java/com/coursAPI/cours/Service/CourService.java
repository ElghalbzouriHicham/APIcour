package com.coursAPI.cours.Service;

import com.coursAPI.cours.Model.Cour;
import com.coursAPI.cours.Model.Evaluation;
import com.coursAPI.cours.Repository.CourRepository;
import com.coursAPI.cours.Repository.EvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourService {
    @Autowired
    CourRepository courRepository;
    @Autowired
    EvaluationRepository evaluationRepository;

    public Cour save(Cour cour){
        if(cour!=null && cour.getEvaluation()!=null ){
            Evaluation evaluation= cour.getEvaluation();
            Evaluation ajouterEvaluation= evaluationRepository.save(evaluation);
            cour.setEvaluation(ajouterEvaluation);
            return courRepository.save(cour);
        }
        else{
            throw new IllegalArgumentException("cour or quiz cannot be null");
        }
    }
    public Cour update(Cour cour) {
        return this.courRepository.save(cour);
    }
    public void Delete(String id  ){
        this.courRepository.deleteById(id);
    }

}
