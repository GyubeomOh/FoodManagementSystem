package Food;

import java.util.Scanner;

public class FastFood extends Food implements FoodInput {
	
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
		System.out.print("Food name : ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("restaurant name : ");
		String restaurant = input.next();
		this.setRestaurant(restaurant);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Phone number exist? (Y or N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer =='Y') {
				System.out.print("Phone number : ");
				String phone = input.next();
				this.setPhone(phone);
				break;
			}
			else if (answer == 'n' || answer =='N') {
				this.setPhone("");
				break;
			}
			else {
				break;
			}
		}
		
		System.out.print("Food price : "); // 할인쿠폰 유무에 따른 할인가격 적용 및 미적용
		int price = input.nextInt();
		this.setPrice(price);
		answer = 'x';
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
		String skind = "none";
		switch(this.kind) {
		case Korean:
			skind = "Kor";
			break;
		case Chinese:
			skind = "CNA";
			break;
		case Japanese:
			skind = "JAV";
			break;
		case Fast:
			skind = "Fast"; 
			break;
		default:				
		}
		System.out.println("Kind:" + skind + " name:" + name + " restaurant:" + restaurant + " phone:" + this.phone + " price:" + price + "원 discount:" + super.price + "원");
	}
}
