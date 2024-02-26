package com.dxc.springbootpractice.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.springbootpractice.model.Candidate;
import com.dxc.springbootpractice.service.CandidateService;

@RestController
@RequestMapping("/api/candidate")
public class CandidateController {
	
	@Autowired
	CandidateService candidateService;
	
	@PostMapping("/addCandidate")
	public ResponseEntity<Map<String, String>> addCandidate(@RequestBody Candidate candidate) {
		return candidateService.addCandidate(candidate);
	}

	@GetMapping("/getAllCandidates")
	public ResponseEntity<List<Candidate>> getAllCandidates() {
		return candidateService.getAllCandidates();
	}
	
}
