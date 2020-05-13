package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime {
public static void main(String[] args) {
	boolean isprime = true;
	String prime = JOptionPane.showInputDialog(null,"If thouest isith strongith then thouist mustist nameist a numberist");
	
	
	
	int prime2 = Integer.parseInt(prime);
	for (int i = 2; i < prime2; i++) {
	
		if (prime2 % i == 0) {
	isprime=false;
	break;
	}
	}
	
	if(isprime ) {
	JOptionPane.showMessageDialog(null, "It is PPRRIIMMEE");
	
	}else { 
		JOptionPane.showMessageDialog(null, "too bad it is not prime");
}	
}
}
