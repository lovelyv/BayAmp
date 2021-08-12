package com.bayamp.training.utils;
public class ArrayUtils {
	
	public static String toString(char[] arr) {
		if(arr==null)
			return "null";
		if (arr.length==0) {
			return "{}";
		} 
				
		StringBuffer value = new StringBuffer("{");
		for(int i = 0; i < arr.length;i++)
		{	
			value.append(arr[i]);
			if (i == arr.length-1) {
				return value.append("]").toString();
			}
			value.append(",");
		}		
		return "";
	}
	
	public static String toString(String[] arr) {
		StringBuffer value = new StringBuffer("{");
		for(int i = 0; i < arr.length;i++)
		{	
			value.append(arr[i]);
			value.append(",");
		}
		value.deleteCharAt(value.length()-1);
		value.append("}");
		return value.toString();
	}
	
	public static String toString(int[] arr) {
		StringBuffer value = new StringBuffer("{");
		for(int i = 0; i < arr.length;i++)
		{	
			value.append(arr[i]);
			value.append(",");
		}
		value.deleteCharAt(value.length()-1);
		value.append("}");
		return value.toString();
	}
	
	public static boolean linearSearch(int[] arr, int toSearch)
	{
		
		sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==toSearch) {
				return true;				
			}
		}
		return false;
	}
	
	public static boolean binarySearch(int[] arr, int toSearch)
	{
		sort(arr);
		int beginIndex = 0;
		int endIndex = arr.length-1;
		int mid = (beginIndex + endIndex) /2;
		boolean found = false;
		while(!found)
		{
			int midValue = arr[mid];
			if (toSearch==midValue)
			{
				found = true;
				return true;
			}
			else if(toSearch<midValue)
			{
				endIndex = mid - 1;
			}
			else if(toSearch>midValue)
			{
				beginIndex = mid + 1;
			}
			mid = (beginIndex + endIndex) /2;
			if(beginIndex > endIndex)
			{
				return false;
			}
		}
		
		return false;
	}
	
	public static int[] sort(int[] arrInt)
	{		
		int temp;
		for (int j = 0; j < arrInt.length; j++)
		{			
			for (int i = j+1; i < arrInt.length; i++) 
			{
				if (arrInt[j]>arrInt[i]) 
				{
					temp = arrInt[j];
					arrInt[j] = arrInt[i];
					arrInt[i] = temp;			
				}
			}
		}
		return arrInt;
	}
	
	public static String[] arrSort(String[]countries) {
		
		int size = countries.length;  
		//logic for sorting   
		for(int i = 0; i<size-1; i++)   
		{  
		for (int j = i+1; j<countries.length; j++)   
		{  
		//compares each elements of the array to all the remaining elements  
		if(countries[i].compareTo(countries[j])>0)   
		{  
		//swapping array elements  
		String temp = countries[i];  
		countries[i] = countries[j];  
		countries[j] = temp;  
		}  
		}  
		}
		return countries;
		
	}
	
//	public static String[] sort(String[]arr)
//	{	
//		
//		int length;
//		String firstString;
//		String secondString;
//		int index=0;
//		
//		while(index<arr.length)
//		{			
//			for (int j = 0; j < arr.length; j++)
//			{		
//				firstString = arr[j].toUpperCase();
//				for (int i = j+1; i < arr.length; i++) 
//				{		
//					
////					if(arr[j].compareTo(arr[i])>0)
////					{
////						swapItems(arr, j, i);
////					}
//					secondString = arr[i].toUpperCase();
//					if (firstString.codePointAt(0) >secondString.codePointAt(0))
//						swapItems(arr,j,i);								
//					length = firstString.length()>secondString.length()? secondString.length() : firstString.length();
//					if (firstString.codePointAt(0) == secondString.codePointAt(0))
//					{
//						for (int k = 1; k < length; k++) 
//						{	
//							if (firstString.codePointAt(k) > secondString.codePointAt(k))
//							{
//								swapItems(arr, j, i);
//								break;
//							}
//							else if (firstString.codePointAt(k) == secondString.codePointAt(k))
//								continue;
//							else
//								break;						
//							
//						}		
//					}
//					else
//						break;
//				}
//			}
//			index++;
//		}
//		return arr;
//	}

	
	public static String[] sort(String[]arr)
	{	

		int length;
		String firstString;
		String secondString;
		
		
		for (int j = 0; j < arr.length; j++)
		{		
			firstString = arr[j].toUpperCase();
			for (int i = 0; i < arr.length; i++) 
			{	
				secondString = arr[i].toUpperCase();
				if (firstString.codePointAt(0) >secondString.codePointAt(0))
				{
					swapItems(arr,j,i);
				}								
			}
			
		}
		return arr;
	}

	
	private static void swapItems(String[] arr, int j, int i)
	{
		String temp;
		temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;

	}

}
