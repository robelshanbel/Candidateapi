package com.api.candidateapi;

import com.api.candidateapi.Model.Candidates;
import com.api.candidateapi.Repo.CandidateRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import  java.util.*;
@SpringBootTest
class CandidateApiApplicationTests {
@Autowired
    CandidateRepository candidateRepository;

    @Test
    void contextLoads() {
    }

    void readAllCandidate(){
        List<Candidates>list=candidateRepository.findAll();
        Assertions.assertThat(list).size().isGreaterThan(0);
    }


}
