package section2;

import java.awt.Color;
import java.awt.event.ActionEvent;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot CSI=new Robot();
		CSI.penDown();
		CSI.setPenColor(Color.blue);
		for (int i = 0; i < 12; i++) {
			CSI.move(100);
			CSI.turn(360/12);
			
		}
		
		
		
		

		
		
		
		
	
		
		
	}
}
