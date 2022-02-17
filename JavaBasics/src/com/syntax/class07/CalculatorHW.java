package com.syntax.class07;

import java.util.Scanner;

public class CalculatorHW {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num1;
		int num2;
		char operators;
		scanner sc;
		
		System.out.println("Plesae enter first number");
		num1=sc.nextInt();
		System.out.println("Please enter second number");
		num2=sc.nextInt();
		System.out.println("What is the operator");
		operator=sc.next().charAt(0);
		int result=0;
		
		switch (operator) {
		case'+':
			result=num1+num2;
			break;
		case'-':
			result=num1-num2;
			break;
		case'/':
			result=num1/num2;
			break;
		case'*': 
			result=num1*num2;
			break;
		default:
			System.out.println("Invalid Operatro");
			
		}
		System.out.println(result);
	}

}
