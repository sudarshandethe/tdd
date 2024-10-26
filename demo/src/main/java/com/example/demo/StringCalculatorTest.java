package com.example.demo;

import org.springframework.stereotype.Component;

import com.example.exception.NegativeStringNotAllowed;

@Component
public class StringCalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  StringCalculator calculator = new StringCalculator();
	        System.out.println(calculator.sumOfNumber("//;\n1;2")); 
	        System.out.println(calculator.sumOfNumber("1\n2,3"));   
	        System.out.println(calculator.sumOfNumber("1\n-2,-3"));
	        
	}

}
