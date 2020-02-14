
/*
 * Cynthia C.
 * 13 February, 2020
 */
package sharing_project;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		int percent, letter;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the percentage: ");
		percent = input.nextInt();
		int a = 0;
		
		//comparing the percentage to a letter grade
    
		//Generates a GPA for each percentage grade
		if(percent < 60){
			System.out.println("The corresponding letter grade is: F");
			System.out.println("The corresponding GPA is: 0.00");
      System.out.println("rough go");
      System.out.println("Take your L and get out");
		}else if(percent < 70){
			System.out.println("The corresponding letter grade is: D");
			if(percent < 63) {
				System.out.println("The corresponding GPA is: 0.67");
			}else if(percent < 67) {
				System.out.println("The corresponding GPA is: 1.00");
			}else{
				System.out.println("The corresponding GPA is: 1.33");
			}
		}else if(percent < 80){
			System.out.println("The corresponding letter grade is: C");
      //isugrfweroiugbiruhgbgiehbvetbg
			if(percent < 73) {
				System.out.println("The corresponding GPA is: 1.67");
			}else if(percent < 77) {
				System.out.println("The corresponding GPA is: 2.00");
			}else{
				System.out.println("The corresponding GPA is: 2.33");
			}
		}else if(percent < 90){
			System.out.println("The corresponding letter grade is: B");
      //wiuegfwrfbuwrgfiwehfiwfbriguirger
			if(percent < 83) {
				System.out.println("The corresponding GPA is: 2.67");
			}else if(percent < 87) {
				System.out.println("The corresponding GPA is: 3.00");
			}else{
				System.out.println("The corresponding GPA is: 3.33");
			}
		}else{
			System.out.println("The corresponding letter grade is: A");
      System.out.println("yeah");
			System.out.println("nooononononon");

			if(percent < 93) {
				System.out.println("The corresponding GPA is: 3.67");
			}else{
				System.out.println("The corresponding GPA is: 4.00");
      }
		
		System.out.print("hi, thats epic");

		}
	}
}


