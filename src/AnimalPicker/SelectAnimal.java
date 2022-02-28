package AnimalPicker;

import java.util.Scanner;

public class SelectAnimal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String ans = sc.nextLine();
		
		System.out.println("Would you like to see a picture of a dog or cat?");
		System.out.println("Type \"dog\" for a dog and \"cat\" for a cat.");
		
		if(ans.equalsIgnoreCase("dog")) {
			System.out.println("DOG ASCII ART HERE");
		}
		else if(ans.equalsIgnoreCase("cat")) {
			System.out.println("CAT ASCII ART HERE");
		}
		else {
			System.out.println("Error. Incorrect input.");
		}
	}

}
