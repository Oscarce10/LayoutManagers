package vista;
import javax.swing.*; // for GUI components
import java.awt.event.*; // for action events
import java.awt.*; // for layout managers
import java.io.*;

//Source: https://www.youtube.com/watch?v=CajXXmhIndI&index=15&list=PLsyeobzWxl7pVZdyDXj0arOdTzo4MYekh
public class MouseDemo extends JFrame {

	public MouseDemo() {
		// TODO Auto-generated constructor stub
		 
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				int x= me.getX();
				int y= me.getY();
				System.out.println("x= "+x+", y= "+y);
			}
		});
		setLayout(new FlowLayout());
		setSize(300, 300);
		//pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseDemo ob = new MouseDemo();
	}
	
	

}
