package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Exception.PhoneFormatException;
import Food.FoodInput;
import Food.FoodKind;
import Food.KoreanFood;
import manager.FoodManager;

public class FoodAdderListener implements ActionListener {

	JTextField fieldName;
	JTextField fieldRestaurant;
	JTextField fieldPhone;
	JTextField fieldPrice;
	
	FoodManager foodManager;
		
	public FoodAdderListener(JTextField fieldName,
			JTextField fieldRestaurant,
			JTextField fieldPhone,
			JTextField fieldPrice,
			FoodManager foodManager) {
		
		this.fieldName = fieldName;
		this.fieldRestaurant = fieldRestaurant;
		this.fieldPhone = fieldPhone;
		this.fieldPrice = fieldPrice;
		this.foodManager = foodManager;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		FoodInput food = new KoreanFood(FoodKind.Korean);
		try {
			food.setName(fieldName.getText());
			food.setRestaurant(fieldRestaurant.getText());
			food.setPhone(fieldPhone.getText());
			food.setPrice(Integer.parseInt(fieldPrice.getText()));
			foodManager.addFood(food);
			putObject(foodManager, "foodmanager.ser");
			food.printInfo();
		} catch (PhoneFormatException e1) {
			e1.printStackTrace();
		}
		
	}
	
	public static void putObject(FoodManager foodManager, String filename) {
		
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(foodManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
