package com.bayamp.training.string.programs;
import java.util.Scanner;
import com.bayamp.training.utils.StringUtils;

public class StringTestProgram
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
						
		System.out.println("Enter a sentence to perform string operations");
		String str = sc.nextLine();
		
		int total = StringUtils.addTwoNumbers("2345","345");
		System.out.println(total);
				
		//Get String length
		int len = StringUtils.getStringLength(str);
		System.out.println("The length of string is " + len);
		sc.nextLine();
		
		
		//Split string 
		System.out.println("Enter a string to split \"" + str + "\"" );
		String splitOn = sc.nextLine();
		String[] splitStr = StringUtils.splitString(str,splitOn);
		System.out.println("The split string is ");
		for(String a: splitStr)
		{
			System.out.println(a);
		}
		sc.nextLine();
		
		//Replace String
		System.out.println("Enter a string to be replaced in \"" + str + "\"");
		String toReplace = sc.nextLine();
		System.out.println("Enter a string to replace \"" + toReplace + "\"");
		String replaceWith = sc.nextLine();		
		String newStr = StringUtils.replaceAllMatch(str,toReplace,replaceWith);
		System.out.println(newStr);
		sc.nextLine();
		
		
		//convert to array
		char[] charArray = StringUtils.convertToCharArray(str);
		System.out.println("The character array is");
		sc.nextLine();
		for(char a: charArray )
		{
			System.out.println(a);
		}
		sc.nextLine();
		
		
		//get char at index
		System.out.println("Enter the index to find a character in \"" + str +"\"" );
		int index = sc.nextInt();
		char charAt = StringUtils.getCharAtIndex(str,index);		
		System.out.println(charAt + " is the character at index " + index);
		sc.nextLine();
		
		
		//get substring
		System.out.println("Enter a length to find substring in \"" + str +"\"" );
		index = sc.nextInt();
		String subset = StringUtils.getSubstring(str,index);
		System.out.println("The substring is " + subset);				
		sc.nextLine();
		
		
		//check matching string
		System.out.println("Enter a string to match with \"" + str + "\"" );
		String stringtToMatch = sc.nextLine();
		boolean isMatch = StringUtils.checkIfStringMatch(str,stringtToMatch);
		if(isMatch)
		{
			System.out.println("The strings match");
		}
		else
		{
			System.out.println("The strings do not match");
		}
		sc.nextLine();
		
		/*
		StringUtils.getUnicodeComparison();
		sc.nextLine();
		*/
		
		
		//check empty string
		boolean isEmpty = StringUtils.isEmptyString(str);
		if(isEmpty)
			System.out.println("The string is empty");
		else
			System.out.println("The string is not empty");
		sc.nextLine();
		
		
		//check reverse string
		String reversedStr = StringUtils.reverseString(str);
		System.out.println("The reversed string is \"" + reversedStr + "\"");
		sc.nextLine();
		
		
		//check anagram 
		System.out.println("Enter first string to check anagram");
		String sFirst = sc.nextLine();
		System.out.println("Enter second string to check anagram");
		String sSecond = sc.nextLine();
		boolean isAnagram = StringUtils.checkIfAnagramStrings(sFirst, sSecond);
		if (isAnagram)
			System.out.println("The strings are anagram");
		else
			System.out.println("The strings are not anagram");
		
		sc.nextLine();
		
		//check palindrom "Able was I ere I saw Elba"
		System.out.println("Enter a string to check if a palindrom");
		String strPalindrome = sc.nextLine();
		boolean isPalindrome = StringUtils.checkIfPalindrome(strPalindrome);
		if(isPalindrome)
		{
			System.out.println("It is a palindrome!!");
		}
		else
		{
			System.out.println("It is not a palindrome!!");
		}		
		sc.nextLine();
		
		
		//reverse words in sentence
		System.out.println("The reverse string is  \"" + StringUtils.reverseWordsInSentence(str) + "\"");
		sc.nextLine();
		
		//reverse from a particular words index
		System.out.println("The reverse string is  \"" + StringUtils.reverseWordsInSentence(str,4) + "\"");
		sc.nextLine();
		
		sc.close();
	}
}