package Food;

import java.util.Scanner;

public abstract class Food { // protected 를 사용함으로써 자신의 서브 클래스가 아니면 다른 클래스에서는 접근하지 못하도록 합니다.
	protected FoodKind kind = FoodKind.Korean;
	protected String name;
	protected String restaurant;
	protected String phone;
	protected int price;
	
	public Food() {
	}
	
	public Food(FoodKind kind) {
		this.kind = kind;
	}
	
	public Food(String name, String restaurant) {
		this.name = name;
		this.restaurant = restaurant;
	}

	public Food(String name, String restaurant, String phone, int price) {
		this.name = name;
		this.restaurant = restaurant;
		this.phone = phone;
		this.price = price;
	}
	
	public Food(FoodKind kind, String name, String restaurant, String phone, int price) {
		this.kind = kind;
		this.name = name;
		this.restaurant = restaurant;
		this.phone = phone;
		this.price = price;
	}
	
	// getters 와 setters 를 사용하여 private 변수의 값을 다른 클래스에서 볼 수 있게 하거나 값을 입력받아 담거나 변경하는데 사용함
	public FoodKind getKind() {
		return kind;
	}

	public void setKind(FoodKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public abstract void printInfo();
	

}
