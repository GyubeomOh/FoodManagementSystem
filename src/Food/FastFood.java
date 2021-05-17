package Food;

import java.util.Scanner;

public class FastFood extends MixedFood {
	
	protected int price;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public FastFood(FoodKind kind) {
		super(kind);
	}
	
	public void getFoodInput(Scanner input) {
		setFoodName(input);
		setFoodRestaurant(input);
		setFoodPhoneYN(input);
		setFoodPrice(input);
		setFoodDiscount(input);
	}
	
	public void setFoodDiscount(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have discount coupon? (Y or N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer =='Y') {
				System.out.print("Discount : ");
				price = input.nextInt();
				super.setPrice(price);
				break;
			}
			else if (answer == 'n' || answer =='N') {
				super.setPrice(0);
				break;
			}
			else {
				break;
			}
		}
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind:" + skind + " name:" + name + " restaurant:" + restaurant + " phone:" + this.phone + " price:" + price + "¿ø discount:" + super.price + "¿ø");
	}
}
