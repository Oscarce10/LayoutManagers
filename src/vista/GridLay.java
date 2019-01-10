package vista;
import javax.swing.*; // for GUI components
import java.awt.event.*; // for action events
import java.awt.*; // for layout managers
import java.io.*;


public class GridLay extends JFrame implements ActionListener {
	private JButton btn;
	public GridLay() {
		// TODO Auto-generated constructor stub
		setLayout(new GridLayout(2,10)); //(Rows, Columns)
		setSize(260, 300);
		for (int i = 1; i <= 20; i++) {
			add(new JButton("Button "+i));
		}
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		GridLay ob = new GridLay();
	}

}
