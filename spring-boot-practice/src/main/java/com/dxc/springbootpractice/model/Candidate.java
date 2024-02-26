package com.dxc.springbootpractice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Candidate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int recId;
	private int candidateNo;
	private String candidateName;
	private int score;
	private int candidateRank;
}