package com.coursAPI.cours.Controller;

import com.coursAPI.cours.Model.Evaluation;
import com.coursAPI.cours.Service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class EvaluationController {
    @Autowired
    private EvaluationService evaluationService;
    @PostMapping("addEvaluation")
    public Evaluation ajouterEvaluation(Evaluation evaluation){
        return evaluationService.save(evaluation);
    }

}
