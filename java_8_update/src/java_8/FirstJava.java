package java_8;

import FunctionalInterface.Inter1;
import FunctionalInterface.Inter2;
import FunctionalInterface.Inter3;
import FunctionalInterface.Inter4;
import FunctionalInterface.Inter5;

// Used Inter1,Inter2,Inter3,Inter4,Inter5

public class FirstJava {

	public static void main(String[] args) {
		//Inter1 interface
		Inter1 inter= ()->{System.out.println("implementation of m1 method");};
		inter.m1();
		
		//Inter2 interface
		Inter2 inter2= (a,b)->{
			int c=a+b;
			System.out.println("Adding number: "+a+"+"+b+" ="+c);
		};
		
		inter2.add(2, 3);
		
		//Inter3
		Inter3 inter3=(a,b) ->a*b;
		System.out.println("Multiplication result: "+inter3.multiply(2, 3));
		
		//Inter4
		Inter4 inter4= a-> a*a;
		System.out.println("Square: "+inter4.square(9));
		
		
		//Inter5
		Inter5 inter5= (a,b) ->{
			String c=a+b;
			return c;};
		System.out.println("Concated String: "+inter5.concatString("Saum","abha"));
		
	}
}
