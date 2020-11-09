package com.services;

public class FizzBuzz {
	public void multiplesOf3569(int number) {
		if(number%3==0 && number%5==0 ) {
			System.out.printf("\n%d: fizz buzz",number);
		}
		else if(number%5==0) {
			System.out.printf("\n%d: buzz",number);
		}
		else if(number%3==0) {
			System.out.printf("\n%d: fizz",number);
		}
		
	}
	//System.out.println("\n");

}
