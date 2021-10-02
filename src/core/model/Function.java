package core.model;

import java.util.Collections;
import java.util.List;

public abstract class Function {
	
	public static boolean primalityTest(int number) {
		if(number%2==0) {
			return false;
		}
		for(int i = 3;i<Math.sqrt(number);i+=2) {
			if(number%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static long factorial(int number){
		if(number==1){
			return (long) 1;
		}
		
		return number*factorial(number-1);
	}
	
	public static int pgcd(int number1,int number2) {
		if(number1==number2) {
			return number1;
		}
		
		while(number2<number1 || number1<number2) {
			
			if(number1>number2) {
				number1-=number2;
			}
			
			if(number2>number1) {
				number2-=number1;
			}
		}
		
		return number1;
	}
	
	public static int pgcdMultiNumber(int[] array) {
		int pgcdTemp=pgcd(array[0],array[1]);
		for(int i=2;i<array.length;i++) {
			pgcdTemp = pgcd(pgcdTemp,array[i]);
		}
		return pgcdTemp;
	}
	
	public static int ppmc(int number1,int number2) {
		if(number1 == number2) {
			return number1;
		}
		
		int smaller;
		int greather;
		int ppmcNumber=1;
		
		if(number1<=number2) {
			smaller=number1;
			greather=number2;
		}
		else {
			smaller=number2;
			greather=number1;
		}
		
		for(int i = 1; i<=smaller;i++) {
			if((greather*i)%smaller==0) {
				ppmcNumber=greather*i;
				break;
			}
		}
		
		return ppmcNumber;
	}
	
	public static int ppmcMultiNumber(int[] array) {
		int ppmcTemp=ppmc(array[0],array[1]);
		for(int i=2;i<array.length;i++) {
			ppmcTemp = ppmc(ppmcTemp,array[i]);
		}
		return ppmcTemp;
	}
	
	
	public static int dichoSearch(List<Double> values,double value,int left,int right) {
		int medium = (left + right)/2;
		
		if(values.get(medium)==value) {
			return medium;
		}
		
		if(left >= right) {
			return -1;
		}
		
		if(values.get(medium)>value) {
			return dichoSearch(values,value,left,medium-1);
		}
		
		return dichoSearch(values,value,medium+1,right);
		
	}
	
	public static int dichoSearch(List<Double> values,double value) {
		Collections.sort(values);
		return dichoSearch(values,value,0,values.size()-1);
	}
	
}


