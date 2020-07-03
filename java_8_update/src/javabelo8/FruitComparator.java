package javabelo8;

import java.util.Comparator;

public class FruitComparator implements Comparator<FruitMain>{

	
	public int compare(FruitMain obj1, FruitMain obj2) {
		if(obj1.fruitPrice>obj2.fruitPrice) {
			return -1;
		}else if(obj1.fruitPrice<obj2.fruitPrice) {
			return 1;
		}else	
		return 0;
	}
}
