package _02_nested_loops._3_for_loop_gauntlet;

import javax.swing.JOptionPane;

public class Gauntlet {
public static void main(String[] args) {
	for (int i = 0; i < 100; i++) {
		
	
	System.out.println(i);
	}                     
	for (int i = 100; i > 0; i--) {
		
		
	System.out.println(i);
	}              
	for (int i = 0; i < 101; i++) {
		
		if (i % 2 == 0) {
	System.out.println(i);
	}              
	}
for (int i = 0; i < 101; i++) {
		
		if (i % 2 != 0) {
	System.out.println(i);
	}              
	}
for (int i = 1; i < 101; i++) {
	
	if (i % 2 == 0) {
System.out.println(i + " is even");
            
}else {
	System.out.println(i + " is odd");
}
}
for (int i = 0; i < 777; i++) {
	
	if (i % 7 == 0) {
System.out.println(i);
}              
}
for (int i = 2006; i < 2021; i++) {
	
	
System.out.println(" In " +i+ " i was "+(i - 2007));
}             

/////////////////////////////////////////////////////////////

// 012012012
// 000111222

for (int a = 0; a < 3; a++) {
	for (int e = 0; e < 1; e++) {
		System.out.println(e);
	}
}
	
for (int i = 0; i < 3; i++) {
	for (int f = 0; f < 3; f++) {
System.out.println(f);
	
	}
}
	
	
	
	}
}




