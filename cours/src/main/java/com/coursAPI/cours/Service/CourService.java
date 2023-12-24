package com.coursAPI.cours.Service;

import com.coursAPI.cours.Model.Cour;
import com.coursAPI.cours.Model.Evaluation;
import com.coursAPI.cours.Repository.CourRepository;
import com.coursAPI.cours.Repository.EvaluationRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
        if(cour!=null && cour.getEvaluation()!=null){
            Evaluation evaluation = cour.getEvaluation();
            Evaluation ajouterEvaluation = evaluationRepository.save(evaluation);
            cour.setEvaluation(ajouterEvaluation);
            return this.courRepository.save(cour);
        }
        else{
            throw new IllegalArgumentException("address cannot be null");
        }
    }

    public void Delete(String id  ){
        Optional<Cour> optionalCour=this.courRepository.findById(id);
        if(optionalCour.isPresent()){
            Cour cour=optionalCour.get();
            Evaluation evaluation=cour.getEvaluation();
            if (evaluation!=null){
                evaluationRepository.deleteById(evaluation.getId());
            }
            this.courRepository.deleteById(id);
        }
        else{
            throw new IllegalArgumentException(" not found with ID: " + id);
        }
    }
    public String acheterCour(String COURSid, String Userid){
        Optional<Cour> cour=courRepository.findById(COURSid);
        cour.get().getListIdEtudiants().add(Userid);
        return "viva";
    }
}
