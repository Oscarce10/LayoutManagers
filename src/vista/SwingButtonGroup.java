package vista;
import javax.swing.*; // for GUI components
import java.awt.event.*; // for action events
import java.awt.*; // for layout managers
import java.awt.TrayIcon.MessageType;
import java.io.*;


public class SwingButtonGroup {

	public SwingButtonGroup() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButtons ob = new RadioButtons();
	}

}

class RadioButtons extends JFrame{
	JLabel lbl;
	JTextField txt;
	JButton btn;
	JRadioButton rd, rd1;
	JCheckBox cb, cb1;
	
	public RadioButtons() {
		lbl =  new JLabel("Greeting");
		txt = new JTextField(15);
		btn = new JButton("Ok");
		btn.setBackground(Color.CYAN);
		rd = new JRadioButton("Male");
		rd1 = new JRadioButton("Female");
		cb = new JCheckBox("Playing");
		cb1 = new JCheckBox("Jumping");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rd);
		bg.add(rd1);
		
		add(txt);
		add(btn);
		add(rd);
		add(rd1);
		add(lbl);
		add(cb);
		add(cb1);
		setLayout(new FlowLayout());
		setSize(400, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name="";
				boolean r = true;
				if(!rd.isSelected() && (!rd1.isSelected())) {
					JOptionPane.showMessageDialog(rootPane, "No gender selected");
					r=false;
				}
				else if(txt.getText().isEmpty()) {
					JOptionPane.showMessageDialog(rootPane, "No name");
					r=false;
				}
				else if(rd.isSelected()) {
					name = "Mr. "+txt.getText();
				}
				else if(rd1.isSelected()) {
					name = "Ms. "+txt.getText();
				}
				if(r) {
				lbl.setText("Hello "+name);
				bg.clearSelection();
				txt.setText("");
				}
				else {
					lbl.setText("Greeting");
					bg.clearSelection();
					txt.setText("");
				}
			}
		});
		
		cb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent ie) {
				// TODO Auto-generated method stub
				if(cb.isSelected()) {
				System.out.println("Esta seleccionado cb");
				lbl.setText("CheckBox selected");
				}
				else {
					System.out.println("No esta seleccionado cb");
					lbl.setText("CheckBox is not selected");
				}
			}
		});
		
	}
}
