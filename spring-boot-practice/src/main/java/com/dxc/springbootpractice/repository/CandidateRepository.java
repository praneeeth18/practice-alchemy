package com.dxc.springbootpractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.springbootpractice.model.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer>{

}
