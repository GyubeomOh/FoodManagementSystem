package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listener.FoodAdderCancelListener;
import listener.FoodAdderListener;
import manager.FoodManager;

public class FoodAdder extends JPanel {
	
	WindowFrame frame;
	
	FoodManager foodManager;
	
	public FoodAdder(WindowFrame frame, FoodManager foodManager) {
		this.frame = frame;
		this.foodManager = foodManager;
		
		JPanel panel = new JPanel(new SpringLayout());
		panel.setLayout(new SpringLayout());
		
		JLabel labelName = new JLabel("Name : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelRestaurant = new JLabel("Restaurant : ", JLabel.TRAILING);
		JTextField fieldRestaurant = new JTextField(10);
		labelRestaurant.setLabelFor(fieldRestaurant);
		panel.add(labelRestaurant);
		panel.add(fieldRestaurant);
		
		JLabel labelPhone = new JLabel("Phone : ", JLabel.TRAILING);
		JTextField fieldPhone = new JTextField(10);
		labelPhone.setLabelFor(fieldPhone);
		panel.add(labelPhone);
		panel.add(fieldPhone);
		
		JLabel labelPrice = new JLabel("Price : ", JLabel.TRAILING);
		JTextField fieldPrice = new JTextField(10);
		labelPrice.setLabelFor(fieldPrice);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new FoodAdderListener(fieldName, fieldRestaurant, fieldPhone, fieldPrice, foodManager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new FoodAdderCancelListener(frame));
		
		panel.add(labelPrice);
		panel.add(fieldPrice);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
	
		this.add(panel);
		this.setVisible(true);
	}
}
