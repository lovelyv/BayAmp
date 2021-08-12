package com.bayamp.training.array.programs;

import java.time.Duration;
import java.time.Instant;
import com.bayamp.training.utils.ArrayUtils;

public class ArrayProgram {

	public static void main(String[] args) {
		
		
	  
		Instant start = Instant.now();
		 
		String[] ccountries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", "Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};  
		System.out.println(ArrayUtils.toString(ArrayUtils.sort(ccountries)));
		Instant finish = Instant.now();  
		long timeElapsed = Duration.between(start, finish).toMillis();  //in millis
		System.out.println(timeElapsed);
		
		start = Instant.now();  
		String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", "Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};  
		System.out.println(ArrayUtils.toString(ArrayUtils.arrSort(countries)));
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();  //in millis
		System.out.println(timeElapsed);
		
		
		
		String[] arrString = {"Reetha","Lovely","Simly","swara","Arjun","Arkush",
				"Arush","Anousha","America","Australia","Lively","Lonely","Lovsy"};
		System.out.println(ArrayUtils.toString(ArrayUtils.sort(arrString)));
		
		String[] arrsString = {"zebra","monkey","aligator","mango","donkey","doggy","giraffe",
				"snake","tiger","lion","cat","sloth"};
		System.out.println(ArrayUtils.toString(ArrayUtils.sort(arrsString)));
		
		arrsString = new String []{"abc","acd","efg","def","xyz"};
		System.out.println(ArrayUtils.toString(ArrayUtils.sort(arrsString)));
		
		
		
		
		int[] arr = {300,10,222,3300,5,-5,9,8,-3};		
		System.out.println(ArrayUtils.toString(ArrayUtils.sort(arr)));
		boolean found = ArrayUtils.linearSearch(arr, 9);
		if(found) {
			System.out.println("found");
		}
		else
			System.out.println("not found");
		
		found = ArrayUtils.binarySearch(arr, -3);
		if(found) {
			System.out.println("found");
		}
		else
			System.out.println("not found");


	}
	

}
