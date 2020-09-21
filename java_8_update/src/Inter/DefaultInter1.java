package Inter;

public interface DefaultInter1 {
	default void display() {
		System.out.println("Within display method of DefaultInter1");
	}
	default void display1() {
		System.out.println("Within display1 method of DefaultInter1");
	}
}
