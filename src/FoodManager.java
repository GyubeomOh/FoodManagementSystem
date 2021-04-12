import java.util.Scanner;

public class FoodManager {
	Food food;	
	Scanner input;
	FoodManager(Scanner input){
		this.input= input;
	}
	
	public void addFood() { // addFood 함수 정의
		food = new Food();
		for (int i = 0; i<food.name.length; i++) {
			System.out.print("Food name : ");
			food.name[i] = input.next();
			System.out.print("restaurant name : ");
			food.restaurant[i] = input.next();
			System.out.print("Phone number : "); 
			food.phone[i] = input.nextInt();
			System.out.print("Food price : "); 
			food.price[i] = input.nextInt();
		}
	}
	
	public void deleteFood() { // deleteFood 함수 정의
		System.out.print("Food name : ");
		String foodname = input.next();
		for(int i = 0; i<food.name.length; i++) {
			if (food.name[i].equals(foodname)) {
				food.name[i] = null;
				food.restaurant[i] = null;
				food.phone[i] = (Integer) null;
				food.price[i] = (Integer) null;
				System.out.println("the food is deleted");
			}
			else {
				System.out.println("the food has not been registered");
				return;
			}
		}
	}
	
	public void editFood() { // editFood 함수 정의
		System.out.print("Food name : ");
		String foodname = input.next();
		for (int i = 0; i<food.name.length; i++) {
			if (food.name[i].equals(foodname)) {
				int num = 0;
				while (num !=4) {
					System.out.println("1. edit restaurant");
					System.out.println("2. edit phone");
					System.out.println("3. edit price");
					System.out.println("4. EXIT");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("restaurant name : ");
						food.restaurant[i] = input.next();
					}
					if (num == 2) {
						System.out.print("Phone number : "); 
						food.phone[i] = input.nextInt();
					}
					if (num == 3) {
						System.out.print("Food price : "); 
						food.price[i] = input.nextInt();
					}
					else {
						continue;
					}
				}
			}
		}
	}
	
	public void viewFood() { // viewFood 함수 정의
		food.printInfo();
	}
}
