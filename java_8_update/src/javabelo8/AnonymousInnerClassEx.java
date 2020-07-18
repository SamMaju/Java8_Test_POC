package javabelo8;

import Inter.Interface1;

public class AnonymousInnerClassEx {

	int x=888;
	
	public void m2() {
		Interface1 interface1= new Interface1() {
			int x=999;
			@Override
			public void m1() {
				System.out.println(this.x);
				
			}
		};
		interface1.m1();
	}
	public static void main(String[] args) {
		AnonymousInnerClassEx classEx= new AnonymousInnerClassEx();
		classEx.m2();
	}	

}
