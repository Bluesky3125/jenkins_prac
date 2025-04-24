package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.CalculatorDTO;

@Service
public class CalculatorService {
	public int plusTwoNumbers(CalculatorDTO calculatorDTO) {
		return calculatorDTO.getNum1() + calculatorDTO.getNum2();
	}
}
