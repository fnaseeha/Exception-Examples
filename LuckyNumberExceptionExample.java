package com.nasee.excep;

import java.util.Scanner;

final class LuckyNumberExceptionExample {

	public static void main(String[] args) throws InvalidInputException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a number");
		String input = sc.nextLine();
		sc.close();
		if(input.length() > 0){
			getVaildNumber(input);
		}else{
			throw new InvalidInputException("User didn't type a value");
		}
	}

	private static void getVaildNumber(String input) {
	
		try{
			int num = Integer.parseInt(input);
			System.out.println("your lucky number is : "+(int)(Math.random()*100+num-5));
		}catch(NumberFormatException e){
			throw new InvalidNumberException("Invalid Number ");
		}
	}

}
