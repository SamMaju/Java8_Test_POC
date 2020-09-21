package java_8;

import FunctionalInterface.Inter6;

public class AnonymousInnr2 {

	int x=888;
	public void meth() {
		int y =999;// Local variable referenced from lambda expression are final whether we declaring or not its always act as final
		Inter6 inter = ()->{
			
			System.out.println("Value of the method variable: "+y);
//			x=222;// Can change as its NOT final
			//y=222; Cannot change as its final
			System.out.println("Value of the classs variable: "+x);
		};
		inter.m6();
	}
	
	public static void main(String[] args) {
		AnonymousInnr2 innr2 = new AnonymousInnr2();
		innr2.meth();
	}

}
