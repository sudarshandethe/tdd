package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.example.exception.NegativeStringNotAllowed;

public class StringCalculator {
	
	
	
	public int addEmptyString(String str)
	{
		  return 0;
     }
	
	
	public int addSingleString(String str)
	{
		int a=Integer.parseInt(str);
		return a;
	}
	
	
	public int sumOfNumber(String str)
	{
		String [] s=splitstr(str);
		
		int sum=0;
		for (String ss: s)
		{
			if(Integer.parseInt(ss)<0)
			{
				
			        throw new IllegalArgumentException("Negative string  not allowed: " + Integer.parseInt(ss));
			    
				
			}
			sum+=Integer.parseInt(ss);
		}
		return sum;
	}

	
	private String[] splitstr(String str) {
        String delimiter = "[,\\n]";
        if (str.startsWith("//")) {
            int delimiterIndex = str.indexOf("\n");
            delimiter = str.substring(2, delimiterIndex);
            str = str.substring(delimiterIndex + 1);
        }
        String [] arr=str.split(delimiter);
        
        return str.split(delimiter);
	}
	


private static  int calculateSum(String[] numsArray) throws NegativeStringNotAllowed {
    List<Integer> str = Arrays.stream(numsArray)
                                  .map(Integer::parseInt)
                                  .collect(Collectors.toList());

    List<Integer> negativestr = str.stream()
            .filter(n -> n < 0)
            .collect(Collectors.toList());
    
    if (!negativestr.isEmpty()) {
        throw new NegativeStringNotAllowed("Negative string  not allowed: " + negativestr);
    }

    return str.stream().mapToInt(Integer::intValue).sum();
}
	
private  String[]  splitString(String str) {
		return  str.split("[,\\n]");

		}
	
	
	
	
	

}
