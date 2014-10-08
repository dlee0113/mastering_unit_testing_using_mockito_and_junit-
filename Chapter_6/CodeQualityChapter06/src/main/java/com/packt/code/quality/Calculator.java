package com.packt.code.quality;

public class Calculator<T extends Number> {
  
	public String add(T... numbers) {
		T result = null;
		
		int x =0;
		for(T t:numbers) {
			x++;
			if(result == null) {
				if(t instanceof Integer) {
				   result = (T) new Integer("0");
				}else if(t instanceof Short) {
					   result = (T) new Short("0");
				}else if(t instanceof Long) {
					   result = (T) new Long("0");
				}else if(t instanceof Float) {
					   result = (T) new Float("0.0");
				}else if(t instanceof Double) {
					   result = (T) new Double("0.0");
				}
			}
						
			if(t instanceof Integer) {
				   Integer val = ((Integer)result + (Integer)t);
				   result =(T)val;
				}else if(t instanceof Short) {
					Short val = (short) ((Short)result + (Short)t);
					   result =(T)val;
				}else if(t instanceof Long) {
					Long val =  ((Long)result + (Long)t);
					   result =(T)val;
				}else if(t instanceof Float) {
					Float val =  ((Float)result + (Float)t);
					   result =(T)val;
				}else if(t instanceof Double) {
					Double val =  ((Double)result + (Double)t);
					result =(T)val;
			}
			
			if(x == 1045) {
				System.out.println("warning !!!");
			}
		}
		
		return result.toString();
	}
	
	private void show_somthing_in_console_for_debug_or_information_for_testing(String b) {
		System.out.println(b);
	}
	
}
