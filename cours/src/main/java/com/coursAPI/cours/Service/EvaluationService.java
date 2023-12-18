package com.coursAPI.cours.Service;

import com.coursAPI.cours.Model.Chat;
import com.coursAPI.cours.Model.Evaluation;
import org.springframework.beans.factory.annotation.Autowired;

public class EvaluationService {
    @Autowired
    EvaluationService evaluationService;
    public Evaluation save(Evaluation evaluation){
        return this.evaluationService.save(evaluation);
    }
}
