package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	static JButton jButton1;
	static JButton jButton2;
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	private static ArrayList<String> names = new ArrayList<String>();
	public static void main(String[] args) {
		GuestBook b = new GuestBook();
		b.run();
		
	}
	public void run() {
		JFrame jFrame = new JFrame();
		JPanel jPanel = new JPanel();
		jButton1 = new JButton();
		jButton2 = new JButton();
		jFrame.add(jPanel);
		jPanel.add(jButton1);
		jPanel.add(jButton2);
		jFrame.setVisible(true);
		jButton1.setText("Add Name");
		jButton1.addActionListener(this);
		jButton2.setText("View names");
		jButton2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jButton1) {
			names.add(JOptionPane.showInputDialog("Add a name!"));
		}
		else if(e.getSource() == jButton2) {
			String s = "";
			for (int i = 0; i < names.size(); i++) {
				s += "Guest #" + (i + 1) + ":" + names.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, s);
		}
		
	}
}
