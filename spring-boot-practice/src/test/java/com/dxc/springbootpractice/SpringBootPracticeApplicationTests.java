package com.dxc.springbootpractice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.dxc.springbootpractice.model.Candidate;
import com.dxc.springbootpractice.repository.CandidateRepository;
import com.dxc.springbootpractice.service.CandidateService;

@SpringBootTest
class SpringBootPracticeApplicationTests {

	@Autowired
	private CandidateService candidateService;
	
	@MockBean
	private CandidateRepository candidateRepository;
	
	@Test
	public void testAddCandidate() {
		
		Candidate candidate = MockCandidateFactory.mockCandidate();
		
		when(candidateRepository.save(candidate)).thenReturn(candidate);
		
		ResponseEntity<Map<String, String>> response = candidateService.addCandidate(candidate);
		
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals("Candidate added successfully!", response.getBody().get("message"));
	}
	
	@Test
	public void testGetAllCandidates() {
		// create mock candidates using the factory
		List<Candidate> candidates = MockCandidateFactory.createMockCandidates();
		
		when(candidateRepository.findAll()).thenReturn(candidates);
		
		ResponseEntity<List<Candidate>> response = candidateService.getAllCandidates();
		
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(candidates, response.getBody());
	}

}
