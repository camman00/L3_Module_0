package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class LogSearch implements ActionListener {
	private HashMap<Integer,String> hashTag = new HashMap<Integer,String>();
	private JFrame jFrame;
	private JPanel jPanel;
	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton3;
	private JButton jButton4;
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	public static void main(String[] args) {
		LogSearch logSearch = new LogSearch();
	}
	public LogSearch() {
		jFrame = new JFrame();
		jPanel = new JPanel();
		jFrame.add(jPanel);
		jFrame.setVisible(true);
		jButton1 = new JButton();
		jButton2 = new JButton();
		jButton3 = new JButton();
		jButton4 = new JButton();
		jButton1.setText("Add an entry!");
		jButton2.setText("Search by entry!");
		jButton3.setText("View list!");
		jButton4.setText("Remove entry!");
		jPanel.add(jButton1);
		jPanel.add(jButton2);
		jPanel.add(jButton3);
		jPanel.add(jButton4);
		jButton1.addActionListener(this);
		jButton2.addActionListener(this);
		jButton3.addActionListener(this);
		jButton4.addActionListener(this);
		jFrame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jButton1) {
			int id = Integer.valueOf(JOptionPane.showInputDialog("Enter an id!"));
			String name = JOptionPane.showInputDialog("Student name");
			hashTag.put(id, name);
		}
		else if(e.getSource() == jButton2) {
			int id = Integer.valueOf(JOptionPane.showInputDialog("Enter an id!"));
			if(hashTag.containsKey(id)) {
				JOptionPane.showMessageDialog(jButton2, hashTag.get(id));
			}
			else {
				JOptionPane.showMessageDialog(jButton2, "Does not exist!");
				
			}
		}
		else if(e.getSource() == jButton3) {
			String s = "";
			for(int key : hashTag.keySet()) {
				s += "ID: " + String.valueOf(key) + " " + "Name: " + hashTag.get(key) + "\n";
			}
			JOptionPane.showMessageDialog(jButton3, s);
		}
		else if(e.getSource() == jButton4) {
			int idRemove = Integer.parseInt(JOptionPane.showInputDialog(null, "Id to remove?"));
			if(hashTag.containsKey(idRemove)) {
				hashTag.remove(idRemove);
			}
			else {
				JOptionPane.showMessageDialog(null, "Does not exist");
			}
			
			
		}
	}

}
