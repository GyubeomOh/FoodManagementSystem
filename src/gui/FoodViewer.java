package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Food.FoodInput;
import manager.FoodManager;

public class FoodViewer extends JPanel {
	
	WindowFrame frame;
	
	FoodManager foodManager;
	
	public FoodManager getFoodManager() {
		return foodManager;
	}

	public void setFoodManager(FoodManager foodManager) {
		this.foodManager = foodManager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Restaurant");
		model.addColumn("Phone");
		model.addColumn("Price");
		
		for(int i = 0; i<foodManager.size(); i++) {
			Vector row = new Vector();
			FoodInput si = foodManager.get(i);
			row.add(si.getName());
			row.add(si.getRestaurant());
			row.add(si.getPhone());
			row.add(si.getPrice());
			model.addRow(row);
		}
			
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

	public FoodViewer(WindowFrame frame, FoodManager foodManager) {
		this.frame = frame;
		this.foodManager = foodManager;
		
		System.out.println("***" + foodManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Restaurant");
		model.addColumn("Phone");
		model.addColumn("Price");
		
		for(int i = 0; i<foodManager.size(); i++) {
			Vector row = new Vector();
			FoodInput si = foodManager.get(i);
			row.add(si.getName());
			row.add(si.getRestaurant());
			row.add(si.getPhone());
			row.add(si.getPrice());
			model.addRow(row);
		}
			
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
