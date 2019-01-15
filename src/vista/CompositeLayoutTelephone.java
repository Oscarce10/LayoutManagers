package vista;
import javax.swing.*; // for GUI components
import java.awt.event.*; // for action events
import java.awt.*; // for layout managers
import java.io.*;


public class CompositeLayoutTelephone {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Telephone");
		frame.setLayout(new BorderLayout());
		frame.setSize(new Dimension(250, 200));
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		// main phone buttons
		
		JPanel numbers = new JPanel();
		numbers.setLayout(new GridLayout(4, 3));
		for(int i=1; i<10; i++) {
			numbers.add(new JButton(""+i));
		}
		numbers.add(new JButton("*"));
		numbers.add(new JButton("0"));
		numbers.add(new JButton("#"));
		frame.add(numbers, BorderLayout.CENTER);
		
		// south status panel
		JPanel dial = new JPanel(new FlowLayout());
		dial.add(new JLabel("Number to dial"));
		dial.add(new JTextField(10));
		frame.add(dial, BorderLayout.SOUTH);
		frame.pack();
	}

}
