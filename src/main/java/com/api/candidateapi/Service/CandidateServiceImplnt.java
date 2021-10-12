package com.api.candidateapi.Service;

import com.api.candidateapi.Controller.Candidate;
import com.api.candidateapi.Model.Candidates;
import com.api.candidateapi.Repo.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CandidateServiceImplnt implements CandidateService{
    @Autowired

    CandidateRepository candidateRepository;

    @Override


    public List<Candidates> getAllCandidatess() {
        return candidateRepository.findAll();
    }

    @Override
    public Candidate saveCandidates(Candidates candidates) {
        this.candidateRepository.save(candidates);
        return null;
    }

    @Override
    public Candidates getCandidateById( long id) {
        Optional<Candidates> optional=candidateRepository.findById(id);

        Candidates candidates=null;
        if (optional.isPresent()){
            candidates=optional.get();
        }
        else{

            throw new RuntimeException("Candidates not found->"+ id);
        }

        return candidates;
    }

    @Override
    public String deleteCandidatesById(long id) {
        this.candidateRepository.deleteById(id);


        return null;
    }
}
