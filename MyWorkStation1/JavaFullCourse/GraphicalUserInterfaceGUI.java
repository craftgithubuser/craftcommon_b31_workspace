package JavaFullCourse;

import javax.swing.JOptionPane;

public class GraphicalUserInterfaceGUI {

	public static void main(String[] args) {
		
		// first step is to import javax.swing.JOptoinPane; on our class.

	String name = JOptionPane.showInputDialog("Enter your name");
	JOptionPane.showMessageDialog(null, "Hello "+name);
	
	 
	int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
	JOptionPane.showMessageDialog(null,"you are " + age + "years old");
	
	double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
	JOptionPane.showMessageDialog(null,"you are" + height+ "CM");
	
	
	
	}

}
