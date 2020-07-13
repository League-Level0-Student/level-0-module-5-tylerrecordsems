package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {
	SkillPractice skills = new SkillPractice();
  skills.skill1();
    skills.skill2();
     skills.skill3();
   skills.skill4();
    skills.skill5();
}

void skill1() {
	// Use pop-ups for the following.
	// Ask the user how many dimes they have
String f = JOptionPane.showInputDialog("How many dimes do you have");
// Tell them how many cents they have (hint multiply by 10)
JOptionPane.showMessageDialog(null, "You have "+f+"0 cents");

	// Ask the user how tall they are (inches)
String p = JOptionPane.showInputDialog("How tall are you in inches");
int num=Integer.parseInt(p);
if(num <= 36) {
	 JOptionPane.showMessageDialog(null,"Eat your Wheaties");
}
}
	// If they are shorter than 36 inches, tell them to eat their Wheaties

 
// Write a loop to print every third number between 1 and 30 to the console 
void skill2() {
for (int i = 1; i < 31; i+=3) {
	System.out.println(i);
}
}    
void skill3() {
	Random num=new Random();
	int Gummy= num.nextInt(21);
System.out.println(Gummy);
int Slime=num.nextInt(10);	
System.out.println(Slime);
JOptionPane.showMessageDialog(null, "The difference between the two numbers are "+(Gummy - Slime ));
}
void skill4() {
String f=	JOptionPane.showInputDialog("Which city do you live in? (No caps!)");
if(f.equals("san diego")) {
	JOptionPane.showMessageDialog(null, "You live in America's Finest City ");
}else {
	 JOptionPane.showMessageDialog(null,"Move to San Diego");


int cars =4;{
if (cars>=1) {
	JOptionPane.showMessageDialog(null, "There are "+ cars*4 +" Wheels");
}
}
}
}
void skill5() { // In a pop-up, ask the user for the name of their school
	String school=	JOptionPane.showInputDialog("What is the name of your school");


	// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 
JOptionPane.showMessageDialog(null,school + " is a fantastic school");
}
}

	


