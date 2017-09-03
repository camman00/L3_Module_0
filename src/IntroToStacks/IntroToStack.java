package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> stacks = new Stack<Double>();
		
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 100; i++) {
			stacks.push((double) new Random().nextInt(101));
		}
		int numb1 = Integer.parseInt(JOptionPane.showInputDialog("Numb 1 bro"));
		int numb2 = Integer.parseInt(JOptionPane.showInputDialog("Numb 2 bro"));
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		for (int i = 0; i < stacks.size(); i++) {
			Double d = stacks.pop();
			if(numb1 > numb2) {
				if(numb2 < d && numb1 > d) {
					System.out.println(d);
				}
			}
			else if(numb2 > numb1) {
				if(numb1 < d && numb2 > d) {
					System.out.println(d);
				}
			}
		}
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
