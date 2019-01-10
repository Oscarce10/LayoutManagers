package vista;
import javax.swing.*; // for GUI components
import java.awt.event.*; // for action events
import java.awt.*; // for layout managers
import java.io.*;


public class BorderLay{
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setLayout(new BorderLayout());
		frame.add(new JButton("North"), BorderLayout.NORTH);
		frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		frame.add(new JButton("WEST"), BorderLayout.WEST);
		frame.add(new JButton("EAST"), BorderLayout.EAST);
		frame.add(new JButton("Center"), BorderLayout.CENTER);
		frame.pack();
		frame.setSize(230, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
	}

}
