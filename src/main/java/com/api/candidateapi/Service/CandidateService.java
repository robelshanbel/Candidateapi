package com.api.candidateapi.Service;

import com.api.candidateapi.Controller.Candidate;
import com.api.candidateapi.Model.Candidates;

import java.util.List;

public interface CandidateService {
    List<Candidates>getAllCandidatess();
    Candidate saveCandidates(Candidates candidates );

    Candidates getCandidateById( long id);
    String deleteCandidatesById(long id);
}
