package vista;
import javax.swing.*; // for GUI components
import java.awt.event.*; // for action events
import java.awt.*; // for layout managers
import java.io.*;



public class FlowLay extends JFrame implements ActionListener {
	
	private JLabel label = new JLabel("Type your ZIP code: ");
	private JTextField field = new JTextField(5);
	private JButton button = new JButton("Submit");
	
	public FlowLay() {
		add(label);
		add(field);
		add(button);
		setLayout(new FlowLayout());
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		FlowLay ob = new FlowLay();
	}

}
