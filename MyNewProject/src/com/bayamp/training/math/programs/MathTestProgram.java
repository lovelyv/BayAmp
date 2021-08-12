package com.bayamp.training.math.programs;
import java.util.Scanner;

import com.bayamp.training.utils.MathUtils;
public class MathTestProgram
{
	public static void main(String[] args)
	{
		// pass the input while executing the program
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer to perfrom int operations");		
		int number = sc.nextInt();
		
		
		
		MathUtils.isPrimeNumber(number);
		MathUtils.isOddNumber(number);

		System.out.println("Enter first int to perfrom swap");
		int[] numberArr = new int[2];
		numberArr[0] = sc.nextInt();
		System.out.println("Enter second int to perfrom swap");
		numberArr[1] = sc.nextInt();
		//pass two numbers with space in between to execute the program
		MathUtils.swapNumbers(numberArr);

		//pass two numbers with space in between to execute the program		
		MathUtils.swapNumbersWithTemp(numberArr);
		
		MathUtils.calculateFactorial(number);
		
		
		int[] tempArray = {1,2,3,5,8,20};
		long result = MathUtils.multiplyNumbers(tempArray);		
		System.out.println("Multiplication of non fractional nos is " + result);
		
		double[] tempFractionalArray = new double[] {22.5, 34.67};
		double fractionalResult = MathUtils.multiplyNumbers(tempFractionalArray);
		System.out.println("Multiplication of fractional nos is " + fractionalResult );
		
		
		sc.close();
	}


	
}