package com.bayamp.training.array.programs;



import com.bayamp.training.utils.ArrayUtils;

public class CharArrayProgram {
	public static void main(String[] args) {
			char[] myChars = {'l','o','v', 'e','l','y'};
			
			String myName = ArrayUtils.toString(myChars);
			System.out.println("String conversion of array is " + myName);
			
			int[] intArr = {1,4,5,6,7};
			String intValue = ArrayUtils.toString(intArr);
			System.out.println("String conversion of array is " +intValue);
		
			
			
					
	}

}
