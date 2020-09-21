package java_8;

import Inter.DefaultInter;
import Inter.DefaultInter1;

public class DefaultInterClass1 implements DefaultInter,DefaultInter1 {


	@Override
	public void display1() {
		DefaultInter.super.display1();
	}

	@Override
	public void display() {
		DefaultInter.super.display();
	}
	public static void main(String[] args) {
		DefaultInterClass1 class1= new  DefaultInterClass1();
		class1.display1();class1.display();
	}


}
