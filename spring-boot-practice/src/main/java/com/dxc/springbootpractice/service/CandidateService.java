package com.dxc.springbootpractice.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dxc.springbootpractice.model.Candidate;
import com.dxc.springbootpractice.repository.CandidateRepository;

@Service
public class CandidateService {
	
	@Autowired
	CandidateRepository candidateRepository;
	
	public ResponseEntity<Map<String, String>> addCandidate(Candidate candidate) {
		try {			
			candidateRepository.save(candidate);
			Map<String, String> response = new HashMap<>();
	        response.put("message", "Candidate added successfully!");
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	public ResponseEntity<List<Candidate>> getAllCandidates() {
		try {
			return new ResponseEntity<>(candidateRepository.findAll(), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
		}
	}
	

}

