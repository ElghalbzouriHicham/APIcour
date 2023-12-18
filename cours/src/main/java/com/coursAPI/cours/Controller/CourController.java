package com.coursAPI.cours.Controller;

import com.coursAPI.cours.Model.Cour;
import com.coursAPI.cours.Service.CourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CourController {
    @Autowired
    CourService courService;
    private Cour cour;
    @PostMapping("/addCour")
    public Cour ajouterCour(@RequestBody Cour cour){
        return courService.save(cour);
    }
    @PutMapping("/updateCour")
    public Cour updateCour(@RequestBody Cour cour){
        return courService.update(cour);
    }
    @DeleteMapping("/deleteCour")
    public void deleteCour(@RequestBody String id ){
        this.courService.Delete(id);
    }

}
