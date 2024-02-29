package com.dxc.springbootpractice;

import java.util.Arrays;
import java.util.List;

import com.dxc.springbootpractice.model.Candidate;

public class MockCandidateFactory {

    public static Candidate mockCandidate() {
		
		Candidate candidate = new Candidate(1, 1001, "John Doe", 85, 1);
		return candidate;
	}
	
	public static List<Candidate> createMockCandidates() {
		
		Candidate candidate1 = new Candidate(1, 1001, "John Doe", 85, 1);
        Candidate candidate2 = new Candidate(2, 1002, "Jane Smith", 90, 2);
        Candidate candidate3 = new Candidate(3, 1003, "Alice Johnson", 80, 3);

        return Arrays.asList(candidate1, candidate2, candidate3);

	}
	
}
