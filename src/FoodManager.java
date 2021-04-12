import java.util.ArrayList;
import java.util.Scanner;

import Food.Food;
import Food.KoreanFood;
import Food.ChineseFood;
import Food.JapaneseFood;
import Food.FastFood;

public class FoodManager {
	ArrayList<Food> foods = new ArrayList<Food>();	
	Scanner input;
	FoodManager(Scanner input){
		this.input= input;
	}
	
	public void addFood() { // addFood 함수 정의
		int kind = 0;
		Food food;
		while (kind != 1 && kind != 2) {
			System.out.println("1 for Korean Food");
			System.out.println("2 for Chinese Food");
			System.out.println("3 for Japanese Food");
			System.out.println("4 for Fast Food");
			System.out.print("Select num for Food Kind between 1 and 4 : ");
			kind = input.nextInt();
			if (kind == 1) {
				food = new KoreanFood();
				food.getFoodInput(input);
				foods.add(food);
				break;
			}
			
			else if (kind == 2) {
				food = new ChineseFood();
				food.getFoodInput(input);
				foods.add(food);
				break;
			}
			
			else if (kind == 3) {
				food = new JapaneseFood();
				food.getFoodInput(input);
				foods.add(food);
				break;
			}
			
			else if (kind == 4) {
				food = new FastFood();
				food.getFoodInput(input);
				foods.add(food);
				break;
			}
			
			else {
				System.out.print("Select num for Food Kind : ");
			}
			
		}

	}
	
	public void deleteFood() { // deleteFood 함수 정의
		System.out.print("Food name : ");
		String foodname = input.next();
		int index = -1;
		for(int i=0 ; i<foods.size(); i++) {
			if (foods.get(i).getName().equals(foodname)) {
				index = i;
				break;
			}
		}
		if (index >= 0) {
			foods.remove(index);
			System.out.println("the food " + foodname + " is deleted");
		}
		else {
			System.out.println("the food has not been registered");
			return;
		}
	}
	
	public void editFood() { // editFood 함수 정의
		System.out.print("Food name : ");
		String foodname = input.next();
		for(int i=0 ; i<foods.size(); i++) {
			Food food = foods.get(i);
			if (food.getName().equals(foodname)) {
				int num = 0;
				while (num !=5) {
					System.out.println("1. edit name");
					System.out.println("2. edit restaurant");
					System.out.println("3. edit phone");
					System.out.println("4. edit price");
					System.out.println("5. EXIT");
					System.out.println("Select one number between 1 - 5");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Food name : ");
						String name = input.next();
						food.setName(name);
					}					
					if (num == 2) {
						System.out.print("Restaurant name : ");
						String restaurant = input.next();
						food.setRestaurant(restaurant);
					}
					if (num == 3) {
						System.out.print("Phone number : "); 
						String phone = input.next();
						food.setPhone(phone);
					}
					if (num == 4) {
						System.out.print("Food price : "); 
						int price = input.nextInt();
						food.setPrice(price);
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}
	
	public void viewFood() { // viewFood 함수 정의
//		System.out.print("Food name :");
//		String Food.name = input.next();
		System.out.println("# of registered foods: " + foods.size());
		for(int i=0 ; i<foods.size(); i++) {
			foods.get(i).printInfo();
		}
	}
}

