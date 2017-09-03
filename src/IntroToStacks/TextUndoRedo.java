package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	private JLabel jlabel;
	private JFrame jframe;
	public static void main(String[] args) {
		TextUndoRedo tur = new TextUndoRedo();
	}
	public TextUndoRedo() {
		jframe = new JFrame();
		JPanel jpanel = new JPanel();
		jlabel = new JLabel();
		jframe.add(jpanel);
		jpanel.add(jlabel);
		jlabel.setText("");
		jframe.addKeyListener(this);
		jframe.setVisible(true);
		jframe.pack();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() != 8 || e.getKeyCode() != KeyEvent.VK_EXCLAMATION_MARK) {
			jlabel.setText(jlabel.getText() + Character.toString(e.getKeyChar()));
			jframe.pack();
		}
		if(e.getKeyCode() == 8) {
			jlabel.setText(jlabel.getText().substring(0, jlabel.getText().length() - 2));
		}
		System.out.println(e.getKeyCode() == 8);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
