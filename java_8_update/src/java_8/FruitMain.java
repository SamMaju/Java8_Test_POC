package java_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class FruitMain {
	
	String fruitName;
	int fruitPrice; 
	String fruitColor;
	public FruitMain(String fruitName,int fruitPrice, String fruitColor) {
		this.fruitName=fruitName;
		this.fruitColor=fruitColor;
		this.fruitPrice=fruitPrice;
	}
	

	public static void main(String[] args) {
		FruitMain fruit1= new FruitMain("Banana", 40, "yellow");
		FruitMain fruit2= new FruitMain("Apple", 100, "Green");
		FruitMain fruit3= new FruitMain("Orange", 60, "Orange");
		FruitMain fruit4= new FruitMain("Strawberry", 80, "Red");
		List<FruitMain> fruitList = new ArrayList<FruitMain>();
		fruitList.add(fruit1);fruitList.add(fruit2);fruitList.add(fruit3);fruitList.add(fruit4);
		System.out.println("Before sorting");
		for(FruitMain fruit :fruitList){
			System.out.println(fruit.fruitPrice);
		}
		/*Comparator<FruitMain> FruitComparator= (obj1,obj2) ->{
			return ((obj1.fruitPrice>obj2.fruitPrice)?-1:(obj1.fruitPrice<obj2.fruitPrice)?1:0);
		};*/
		Collections.sort(fruitList,(obj1,obj2) ->{
			return ((obj1.fruitPrice>obj2.fruitPrice)?-1:(obj1.fruitPrice<obj2.fruitPrice)?1:0);
		} );
		
		System.out.println("After sorting");
		fruitList.forEach(fruit -> System.out.println(fruit.fruitPrice));
	}

}
