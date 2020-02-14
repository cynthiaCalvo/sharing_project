/*
 * Cynthia C.
 * 13 Febuary, 2020
 */
package sharing_project;

import java.util.Scanner;
import java.util.Random;

public class First {

	public static void main(String[] args) {
		int percent, letter, duh;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the percentage: ");
		percent = input.nextInt();
		
		//comparing the percentage to a letter grade
		if(percent < 50){
			System.out.println("The corresponding letter grade is: F");
			System.out.println("rough go");
		}else if(percent < 65){
			System.out.println("The corresponding letter grade is: D");
		}else if(percent < 70){
			System.out.println("The corresponding letter grade is: C");
			
		}else if(percent < 90){
			System.out.println("The corresponding letter grade is: B");
			
		}else{
			System.out.println("The corresponding letter grade is: A");
			System.out.println("yeah");
			System.out.println("nooononononon");
			
		}
		

	}

}
