package Food;

import java.util.Scanner;

public class JapaneseFood extends Food {
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
		
		System.out.print("Food price : "); 
		int price = input.nextInt();
		this.setPrice(price);
	}
}
