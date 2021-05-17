package Food;

import java.util.Scanner;

public class KoreanFood extends Food { 
	
	public KoreanFood(FoodKind kind) {
		super(kind);
	}
	
	public void getFoodInput(Scanner input) {
		setFoodName(input);
		setFoodRestaurant(input);
		setFoodPhone(input);
		setFoodPrice(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind:" + skind + " name:" + name + " restaurant:" + restaurant + " phone:" + phone + " price:" + price);
	}
}
