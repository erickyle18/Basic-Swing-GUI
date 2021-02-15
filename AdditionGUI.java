import javax.swing.JOptionPane;

public class AdditionGUI {
	
	public static void main(String[] args) {
		
		//obtain user input from JOptionPane input dialogs
		String firstNumber = JOptionPane.showInputDialog("Enter first integer: ");
		String secondNumber = JOptionPane.showInputDialog("Enter second integer: ");
		
		//convert Strings into integers for further processing
		int number1 = Integer.parseInt(firstNumber);
		int number2 = Integer.parseInt(secondNumber);
		
		int sum = number1 + number2;
		
		//display the result in JOptionPane message dialog
		JOptionPane.showMessageDialog(null, "The sum is " + sum, "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
	}

}
