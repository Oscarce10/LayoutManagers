package vista;
import javax.swing.*; // for GUI components
import java.awt.event.*; // for action events
import java.awt.*; // for layout managers
import java.io.*;

//Source: https://drive.google.com/drive/u/0/my-drive --> GUI JAVA lecture.pdf --> Page 843
public class CompositeLayoutMail {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Mail");
		frame.setLayout(new BorderLayout());
		
		//Section NORTH
		JPanel north = new JPanel(new BorderLayout());
		JPanel northW = new JPanel(new GridLayout(3, 1));
		northW.add(new JLabel("From: "));
		northW.add(new JLabel("To: "));
		northW.add(new JLabel("Subject: "));
		north.add(northW, BorderLayout.WEST);
		
		JPanel northC = new JPanel(new GridLayout(3, 1));
		northC.add(new JTextField());
		northC.add(new JTextField());
		northC.add(new JTextField());
		north.add(northC, BorderLayout.CENTER);
		
		JPanel northE = new JPanel(new GridLayout(3, 1));
		northE.add(new JButton("Browse..."));
		northE.add(new JButton("Browse..."));
		north.add(northE, BorderLayout.EAST);
		
		frame.add(north, BorderLayout.NORTH);
		
		//Section CENTER
		frame.add(new JTextArea());
		
		//Section SOUTH
		JPanel south = new JPanel(new FlowLayout());
		south.add(new JButton("Send"), BorderLayout.CENTER);
		frame.add(south, BorderLayout.SOUTH); 
		
		frame.setSize(400, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

	}

}
