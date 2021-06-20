package _02_nested_loops._1_snowflake;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;


public class Snowflake {
	
	public static void main(String[] args) {

		// #1. Make a new Robot
Robot ice= new Robot("mini");
Robot ice2= new Robot("mini");
Robot ice3= new Robot("mini");
Robot ice4= new Robot("mini");
		// #2. Set your robot’s position to x=300 and y=300
 ice.setX(100);
 ice.setY(100);
 ice2.setX(200);
 ice2.setY(150);
 ice3.setX(350);
 ice3.setY(350);
 ice4.setX(600);
 ice4.setY(150);
 
 
		// #3. Put the robot's pen down
ice.penDown();
ice.setPenColor(Color.orange);
		// #4. Set the robot’s speed to 5
ice.setSpeed(50);
for (int i = 0; i < 2; i++) {
	
ice.move(-300);
ice.turn(-90);
ice.move(-700);
ice.turn(-90);
}


ice2.setPenColor(Color.yellow);
ice2.penDown();
ice2.setSpeed(50);
ice2.move(-200);
ice2.turn(60);
ice2.move(100);
ice2.turn(-60);
ice2.move(110);
ice2.turn(-60);
ice2.move(100);

ice3.setPenColor(Color.red);
ice3.penDown();
ice3.setSpeed(50);
ice3.turn(20);
ice3.move(200);
ice3.turn(140);
ice3.move(200);
ice3.turn(180);
ice3.move(120);
ice3.turn(-70);
ice3.move(50);

ice4.setPenColor(Color.yellow);
ice4.penDown();
ice4.setSpeed(50);
ice4.move(-200);
ice4.turn(60);
ice4.move(100);
ice4.turn(-60);
ice4.move(110);
ice4.turn(-60);
ice4.move(100);

ice.penUp();
ice.moveTo(-10, -10);

ice2.penUp();
ice2.moveTo(-10, -10);

ice3.penUp();
ice3.moveTo(-10, -10);

ice4.penUp();
ice4.moveTo(-10, -10);

String dad = JOptionPane.showInputDialog( "Who Is the Best DAD ever?");

if (dad.equals("shawn")) {
	JOptionPane.showMessageDialog(null, "You Are Correct My Friend!");
}else {
	JOptionPane.showMessageDialog(null, "No!");
}
	
String yes = JOptionPane.showInputDialog( "Would You Like A Present?");

if(yes.equals("yes")) {
	JOptionPane.showMessageDialog(null, "Click on Moms Email Tab!");
}else {
	JOptionPane.showMessageDialog(null, "Too Bad!");
}
// #5. use a for loop below to do everything ( #6, #7, #8, #9, #12, #13, #14 ) 6 times (use i as the counter)
/*
for (int i = 0; i < 6; i++) {
	

			
			// #6. Set the pen color to black
ice.setPenColor(Color.black);
			
			// #7. move the robot by 50
ice.move(50);
			
			// #8. turn the robot to the right by 60
			ice.turn(60);
			
			
		// #12. set the pen color to blue for even numbers of i
			if(i%2==0) {
			ice.setPenColor(Color.cyan);
			}else {
				ice.setPenColor(Color.red);
				
			}
			// #13. set the pen color to red for all odd numbers of i
			
			
			// #9. Use a for loop to do everything (#10, #11) 6 times ( use j as a counter )
		
	
	
	for (int j = 0; j < 6; j++) {
		
	

					// #10. turn the robot to the left by 60
		ice.turn(-60);
	
					// #11. move the robot by 50 (play the start button)
ice.move(50);
	}
				
//#14. set the pen color to black
		ice.setPenColor(Color.black);	
				
		*/
	}
	}

