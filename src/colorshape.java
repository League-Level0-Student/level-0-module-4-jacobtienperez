import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class colorshape {
public static void main(String[] args) {
	Robot virtualboy = new Robot();
	virtualboy.penDown();
	virtualboy.setSpeed(9001);
	
	virtualboy.hide();
String over = JOptionPane.showInputDialog("how many shape");
int num=Integer.parseInt(over);
String vsauce = JOptionPane.showInputDialog("what color");
for(int i = 0; i < num; i ++);{
	virtualboy.move(100);
	virtualboy.turn(90);
}
	}
}
