
package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class cdf {
public static void main(String[] args) {
	
	String f = JOptionPane.showInputDialog(null, "Which shape would you like? circle, square, or triangle?");
	if (f .equalsIgnoreCase("square")) {
	drawSquare();
	}else if (f.equalsIgnoreCase("triangle")){
	drawTriangle();
	}else if (f.equalsIgnoreCase("circle")) {
	drawCircle();
	}else {
	 JOptionPane.showMessageDialog(null,"Is this what you wanted");
		drawSquare();
		drawTriangle();
		drawCirclHack();
		 JOptionPane.showMessageDialog(null,"ERROR CODE 1462");
		 JOptionPane.showMessageDialog(null,"ERROR CODE 5903");
		for (int i = 5; i > 0; i--) {
			 JOptionPane.showMessageDialog(null,"SELF DESTROCTION IN "+ i);
		}
		 JOptionPane.showMessageDialog(null,"BOOOOOOOOM");
		 JOptionPane.showMessageDialog(null,"HEH :/");
	}
}

static void drawSquare() {
	Robot ice = new Robot ("batman");
	ice.setSpeed(100);
	ice.penDown();
	for (int i = 0; i < 4; i++) {
		ice.move(150);
		ice.turn(90);
	}
}
static void drawTriangle() {
Robot ice = new Robot ("batman");
ice.setSpeed(100);
ice.penDown();
for (int i = 0; i < 3; i++) {
	ice.move(150);
	ice.turn(360/3);
}
}
static void drawCircle() {
Robot ice = new Robot ("batman");
ice.setSpeed(100);
ice.penDown();
for (int i = 0; i < 120; i++) {
	ice.move(5);
	ice.turn(360/100);
}
}
static void drawCirclHack() {
Robot ice = new Robot ("batman");
ice.setSpeed(100);
ice.penDown();
for (int i = 0; i < 60; i++) {
	ice.setRandomPenColor();
	ice.move(5);
	ice.turn(360/100);
}
  
ice.turn(360/1);
ice.setRandomPenColor();
ice.move(50);
ice.move(50);
ice.move(50);
}
}
