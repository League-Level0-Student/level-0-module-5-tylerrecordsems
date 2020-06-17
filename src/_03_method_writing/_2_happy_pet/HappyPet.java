package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public abstract class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String f = JOptionPane.showInputDialog(null, "What kind of pet do you want?");
		// 7. R.E.P.E.A.T steps 3 - 6 enough times to make your pet happy!
while(happinessLevel<16){
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What would you like to do with your "+f+" first?", f, 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Pet", "feed", "take a walk" }, null);
if(task ==( 0)){
	pet(f);
	happinessLevel += 5;
}if(task ==( 1)){
	feed(f);
	happinessLevel += 4;
}if(task ==( 2)){
	walk(f);
	happinessLevel += 3;
}
JOptionPane.showMessageDialog(null, "Your pet loves you");
	// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		}
	}

	

	static // 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
void pet(String f) {
JOptionPane.showMessageDialog(null, "Your " + f + " likes you +5 happiness more" );	
}
static void feed(String f) {
JOptionPane.showMessageDialog(null, "Your " + f + " likes you +4 happiness more" );	
}
static void walk(String f) {
JOptionPane.showMessageDialog(null, "Your " + f + " likes you +3 happiness more" );	
}




}
//



//
   //
  //
 //
//








