package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ohgiraffers.bootproject.dto.CalculatorDTO;
import com.ohgiraffers.bootproject.service.CalculatorService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequiredArgsConstructor
public class CalculatorController {
	
	private final CalculatorService calculatorService;
	
	@GetMapping("/health")
	public String healthCheck() {
		return "I'm alive";
	}
	
	// @GetMapping("/plus")
	// public ResponseEntity<CalculatorDTO> plusTwoNumbers(CalculatorDTO calculatorDTO) {
	//
	// 	log.info("calculatorDTO: {}", calculatorDTO);
	// 	int result = calculatorService.plusTwoNumbers(calculatorDTO);
	// 	calculatorDTO.setSum(result);
	// 	return ResponseEntity.ok().body(calculatorDTO);
	// }
	
	@PostMapping("/plus")
	public ResponseEntity<CalculatorDTO> plusTwoNumbers(@RequestBody CalculatorDTO calculatorDTO) {
		
		log.info("calculatorDTO: {}", calculatorDTO);
		int result = calculatorService.plusTwoNumbers(calculatorDTO);
		calculatorDTO.setSum(result);
		return ResponseEntity.ok().body(calculatorDTO);
	}
}
