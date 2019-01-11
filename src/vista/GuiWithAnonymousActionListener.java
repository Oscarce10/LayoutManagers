package vista;
import javax.swing.*; // for GUI components
import java.awt.event.*; // for action events
import java.awt.*; // for layout managers
import java.awt.TrayIcon.MessageType;
import java.io.*;

public class GuiWithAnonymousActionListener extends JFrame{
	
	JTextField txt = new JTextField(8);
	JTextField txt1 = new JTextField(8);
	JLabel lb = new JLabel("Result");
	JButton btn = new JButton("Ok");

	public GuiWithAnonymousActionListener() {
		// TODO Auto-generated constructor stub
		add(txt);
		add(txt1);
		add(btn);
		add(lb);
//-------------------------------Cualquier metodo sirve---------------------------		
		/*ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					int num = Integer.parseInt(txt.getText());
					int num2 = Integer.parseInt(txt1.getText());
					lb.setText(""+num+num2);
					pack();
				}
				catch(Exception ex){
					System.out.println("Error");
				}
			}
		};
		
		btn.addActionListener(al);
		*/
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					int num = Integer.parseInt(txt.getText());
					int num2 = Integer.parseInt(txt1.getText());
					lb.setText(""+num+num2);
					pack();
				}
				catch(Exception ex){
					System.out.println("Error");
				}
			}
		});
//-------------------------------------------------------------------------------------------
		
		setLayout(new FlowLayout());
		setVisible(true);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuiWithAnonymousActionListener ob = new GuiWithAnonymousActionListener();
	}

}
