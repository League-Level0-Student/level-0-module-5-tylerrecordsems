package _01_algorithms._2_fibonacci;

public class fibonacci {
public static void main(String[] args) {
	int number1 =0;
	int number2 =1;
	int sum = 0;
	System.out.println(number1 +" " + number2);
	for (int i = 0; i < 10; i++) {
		sum= number1 + number2;
	System.out.println(sum);
	number1 =number2;
	number2=sum;
	}
	
	// 0 1 1 2 3 5 8 13
	
	
}
}
