/*
 * Cynthia C.
 * 13 Febuary, 2020
 */
package sharing_project;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		int percent, letter;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the percentage: ");
		percent = input.nextInt();
		
		//comparing the percentage to a letter grade
		if(percent < 60){
			System.out.println("The corresponding letter grade is: F");
		}else if(percent < 70){
			System.out.println("The corresponding letter grade is: D");
		}else if(percent < 80){
			System.out.println("The corresponding letter grade is: C");
		}else if(percent < 90){
			System.out.println("The corresponding letter grade is: B");
		}else{
			System.out.println("The corresponding letter grade is: A");
		}

	}

}
