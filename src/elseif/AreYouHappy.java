package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String question1 = JOptionPane.showInputDialog("Are u Happy?");
	if(question1.equals("yes")) {
		JOptionPane.showMessageDialog(null,"Keep doing what you are doing");
	}
	if(question1.equals("no")) {
		String question2 = JOptionPane.showInputDialog("Do you want to be happy");
		if(question2.equals("yes")) {
			JOptionPane.showMessageDialog(null,"change something");
		}
		else {
			JOptionPane.showMessageDialog(null,"Keep doing what you are doing");
		}
	
	}
	
System.exit(0);
}
}
