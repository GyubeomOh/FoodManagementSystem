package Food;

import java.util.Scanner;

public class ChineseFood extends Food {
	
	protected String phone;
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public ChineseFood(FoodKind kind) {
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
				System.out.print("Phone number exist? (Y or N)");
			}
		}
		
		answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Owner's phone number exist? (Y or N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer =='Y') {
				System.out.print("Owner's phone number : ");
				String phone = input.next();
				super.setPhone(phone);
				System.out.println("Test");
				break;
			}
			else if (answer == 'n' || answer =='N') {
				super.setPhone("");
				break;
			}
			else {
				System.out.print("Phone number exist? (Y or N)");
			}
		}
		
		System.out.print("Food price : "); 
		int price = input.nextInt();
		this.setPrice(price);
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
		System.out.println("Kind:" + skind + " name:" + name + " restaurant:" + restaurant + " phone:" + this.phone + " price:" + price + "¿ø owner's phone" + super.phone);
	}
}
