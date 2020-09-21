/**
 * 
 */
package Inter;


public interface DefaultInter {

		default void display() {
			System.out.println("Within display method of DefaultInter");
		}
		default void display1() {
			System.out.println("Within display1 method of DefaultInter");
		}
}
