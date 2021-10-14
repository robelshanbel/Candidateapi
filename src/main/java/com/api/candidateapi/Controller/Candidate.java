package com.Craft.craftcandidatesproject.controller;

import com.Craft.craftcandidatesproject.model.Candidates;
import com.Craft.craftcandidatesproject.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping(value = "api/v1")
public class Candidate {
    @GetMapping("/")

    public String printhello(){

        return "Test the api work";
    }
    /*
@Autowired
   private  CandidateService candidateService;

    @GetMapping("/")
    public List<Candidates> Candidates( ) {

    return candidateService.getAllCandidatess();

}

    @PostMapping("/candidate")

    public String AddCandidate(@ModelAttribute("candidates") Candidates candidates){

     candidateService.saveCandidates(candidates);
    return  " New Candidate Successfully Added";
}

    @PutMapping("/candidate/{id}")

    public String UpdateCandidate (@PathVariable (value="id")Long id, @Validated @RequestBody Candidates  candidates)


    {

        Candidates candidatesobj=candidateService.getCandidateById(id);
        candidatesobj.setFirstName(candidates.getFirstName());
        candidatesobj.setLastName(candidates.getLastName());
        candidatesobj.setPosition(candidates.getPosition());
        candidatesobj.setEmail(candidates.getEmail());

        Candidate updateCandidatesEntity=candidateService.saveCandidates(candidatesobj);
        return "Candidate info updated Successfully";

    }




    @GetMapping("/candidate/{id}")

    public Candidates GetCandidateById(@PathVariable Long id) {

        return candidateService.getCandidateById(id);
    }

@DeleteMapping("/candidate/{id}")

    public String DeleteCandidate(@PathVariable (value = "id") long id  ){

this.candidateService.deleteCandidatesById(id);

 if (true){
     return " Candidate Successfully Deleted  id->" + "" + id;
 }

 else{


  return "";

 }


}*/


}
