package Food;

import java.util.Scanner;

import Exception.PhoneFormatException;

public interface FoodInput {
	
	public String getName();
	
	public void setName(String name);
	
	public String getRestaurant();
	
	public void setRestaurant(String restaurant);
	
	public String getPhone();
	
	public void setPhone(String phone) throws PhoneFormatException;
	
	public int getPrice();
	
	public void setPrice(int price);	
	
	public void getFoodInput(Scanner input);
	
	public void printInfo();

	public void setFoodName(Scanner input);
	
	public void setFoodRestaurant(Scanner input);
	
	public void setFoodPhone(Scanner input);
	
	public void setFoodPrice(Scanner input);
}
