package studio3;

import java.util.Scanner; 

public class Sieve {

	public static void main(String[] args) {
		System.out.println ("Enter a number : ");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		boolean [] numbersArray = new boolean [number+1];
		for (int i = 0; i < number+1; i++) {
			numbersArray [i] = true;
		}
		for (int i = 2; i < number +1 ; i++) {
			if (numbersArray [i] == true) {
				for (int j = i*i ; j <= number ; j = j + i) {
					numbersArray [j] = false;
				}
			}
		}
		for (int i = 1; i < number+1; i++) {
			if (numbersArray [i] == true) {
				System.out.println (i + " is prime");
	}
}
}
}