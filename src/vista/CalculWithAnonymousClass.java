package vista;
import javax.swing.*; // for GUI components
import java.awt.event.*; // for action events
import java.awt.*; // for layout managers
import java.awt.TrayIcon.MessageType;
import java.io.*;

public class CalculWithAnonymousClass extends JFrame{
	
	JTextField txt, txt1;
	JButton btnAdd, btnSub;
	JLabel lbl;

	public CalculWithAnonymousClass() {
		// TODO Auto-generated constructor stub
		txt = new JTextField(8);
		txt1 = new JTextField(8);
		btnAdd = new JButton("Add");
		btnSub = new JButton("Sub");
		lbl = new JLabel("Result");
		add(txt);
		add(txt1);
		add(btnAdd);
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				// TODO Auto-generated method stub
				try {
					int a, b;
					a = Integer.parseInt(txt.getText());
					b = Integer.parseInt(txt1.getText());
					int value = 0;
						value = (a+b);
					lbl.setText(""+value);
					}
					catch (Exception e) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(rootPane, "Error");
					}
			}
		});
		add(btnSub);
		btnSub.addActionListener(ae -> {
			try {
				int a, b;
				a = Integer.parseInt(txt.getText());
				b = Integer.parseInt(txt1.getText());
				int value = 0;
					value = (a-b);
				lbl.setText(""+value);
				}
				catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(rootPane, "Error");
				}
		});
		add(lbl);
		setLayout(new FlowLayout());
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculWithAnonymousClass ob = new CalculWithAnonymousClass();
	}

}
