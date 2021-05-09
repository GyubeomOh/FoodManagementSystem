package Food;

import java.util.Scanner;

public class KoreanFood extends Food implements FoodInput { 
	
	public KoreanFood(FoodKind kind) {
		super(kind);
	}
	
	public void getFoodInput(Scanner input) {

		System.out.print("Food name : ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("restaurant name : ");
		String restaurant = input.next();
		this.setRestaurant(restaurant);
		
		System.out.print("Phone number : ");
		String phone = input.next();
		this.setPhone(phone);
		
		System.out.print("Food price : "); 
		int price = input.nextInt();
		this.setPrice(price);
		
	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Korean:
			skind = "KOR";
			break;
		case Chinese:
			skind = "CNA";
			break;
		case Japanese:
			skind = "JAV";
			break;
		case Fast:
			skind = "FAST"; 
			break;
		default:				
		}
		System.out.println("Kind:" + skind + " name:" + name + " restaurant:" + restaurant + " phone:" + phone + " price:" + price);
	}
}
