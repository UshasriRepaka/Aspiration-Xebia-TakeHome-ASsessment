package AspirationTakeHomeAssessment;

/*Convert the given binary number into decimal.
Examples below
Input 111
Output 7
Or 
Input 1010
Output 10*/

import java.util.Scanner;

public class convertingbinarynumberintodecimal {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Binary Number");
		String BinaryString = input.nextLine();
		int decimal=Integer.parseInt(BinaryString,2);
		System.out.println("Converting Binary Number: "+BinaryString+" to Decimal is: "+decimal);
		input.close();
	}

}
