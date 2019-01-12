package vista;
import javax.swing.*; // for GUI components
import java.awt.event.*; // for action events
import java.awt.*; // for layout managers
import java.awt.TrayIcon.MessageType;
import java.io.*;

public class Calcul extends JFrame implements ActionListener {
	
	JTextField txt, txt1;
	JButton btnAdd, btnSub;
	JLabel lbl;

	public Calcul() {
		// TODO Auto-generated constructor stub
		txt = new JTextField(8);
		txt1 = new JTextField(8);
		btnAdd = new JButton("Add");
		btnSub = new JButton("Sub");
		lbl = new JLabel("Result");
		add(txt);
		add(txt1);
		add(btnAdd);
		btnAdd.addActionListener(this);
		add(btnSub);
		btnSub.addActionListener(this);
		add(lbl);
		setLayout(new FlowLayout());
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcul ob = new Calcul();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		try {
		int a, b;
		a = Integer.parseInt(txt.getText());
		b = Integer.parseInt(txt1.getText());
		int value = 0;
		if(ae.getSource() == btnAdd) {
			value = (a+b);
		}
		
		else {
			value = (a-b);
		}
		lbl.setText(""+value);
		}
		catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(rootPane, "Error");
		}
}
}
