package listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import gui.FoodViewer;
import gui.WindowFrame;
import manager.FoodManager;

public class ButtonViewerListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonViewerListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FoodViewer foodViewer = frame.getFoodviewer();
		FoodManager foodManager = getObject("foodmanager.ser");
		foodViewer.setFoodManager(foodManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getFoodviewer());
		frame.revalidate();
		frame.repaint();

	}

	public static FoodManager getObject(String filename) {
		FoodManager foodManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			foodManager = (FoodManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return foodManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return foodManager;
	}
	
}
