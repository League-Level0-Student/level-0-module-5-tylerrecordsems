package _04_practice._1_skill_practice;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {
	SkillPractice skills = new SkillPractice();
    skills.skill1();
   // skills.skill2();
   // skills.skill3();
   // skills.skill4();
    //skills.skill5();
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
	// If they are shorter than 36 inches, tell them to eat their Wheaties




	}
	
	

}
