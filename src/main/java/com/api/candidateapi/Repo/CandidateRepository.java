package com.api.candidateapi.Repo;


import com.api.candidateapi.Model.Candidates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Candidates,Long> {
}
