import static javax.swing.JOptionPane.*;

import javax.swing.JOptionPane;
public class oklji { public static void main(String[] args) {
	String alpha=showInputDialog("number");
	int myInt=Integer.parseInt(alpha);
	boolean prime = true;
	for(int i=2; i<myInt; i++) {
		if(myInt % i ==0) {
		prime = false;
	}
		else {
		prime=true;
		}
		}
	if( prime == true) {
		JOptionPane.showMessageDialog(null, "it's prime ribs");
	}
		else {
			JOptionPane.showMessageDialog(null, "composite");
		}
	
}
}


