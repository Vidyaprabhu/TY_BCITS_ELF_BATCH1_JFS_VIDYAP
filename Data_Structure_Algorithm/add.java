package com.dataStructureAlgorithm;

import java.time.Duration;
import java.time.Instant;

public class add {
	public static Long addupto(Long number)
	{
		Long total=0L;
		for(Long i=0L;i<=number;i++)
		{
			total=total+i;
		}
		return total;
	}
	public static Long addUptoQuick(Long number)
	{
		return number*(number+1)/2;
	}
    public static void countDurationAddUpto() {
    	Long number=99999999999L;
    	Instant start= Instant.now();
    	System.out.println(addupto(number));
    	Instant end =Instant.now();
    	Long duration = Duration.between(start, end).toMillis();
    	double seconds = duration /1000.0;
    	System.out.println("addupto took "+ seconds+ "seconds");
    }
    public static void countDurationAddUptoQuick() {
    	Long number=999999999999L;
    	Instant start= Instant.now();
    	System.out.println(addUptoQuick(number));
    	Instant end =Instant.now();
    	Long duration = Duration.between(start, end).toMillis();
    	double seconds = duration /1000.0;
    	System.out.println("adduptoQuick took "+ seconds+ "seconds");
    }
    public static void main(String[] args) {
    	countDurationAddUptoQuick();
    	countDurationAddUpto();
	}
}
