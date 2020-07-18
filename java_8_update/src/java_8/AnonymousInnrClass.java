package java_8;

import FunctionalInterface.Inter6;

public class AnonymousInnrClass {
	int x=888;
	public void meth() {
		Inter6 inter =  
				()->{
					int x=999;
					System.out.println(this.x);
	};
	inter.m6();
	}
	
	public static void main(String[] args) {
		
		AnonymousInnrClass anonymousInnrClass= new AnonymousInnrClass();
		anonymousInnrClass.meth();
}
}
