package com.coursAPI.cours.Controller;

import com.coursAPI.cours.Service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class EvaluationService {
    @Autowired
    private EvaluationService evaluationService;
    @GetMapping("/evaluation")
    public EvaluationService getEvaluationService() {
        return evaluationService;
    }
}
