package AnimalPicker;

import java.util.Scanner;

public class SelectAnimal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Would you like to see a picture of a dog, cat, or fish?");
		System.out.println("Type \"dog\" for a dog, \"cat\" for a cat, and \"fish\" for a fish!");
		String ans = sc.nextLine();
		
		while (!ans.equalsIgnoreCase("dog") && !ans.equalsIgnoreCase("cat") && !ans.equalsIgnoreCase("fish")) {
			System.out.println("Error. Input " + ans + " is invalid.");
			System.out.println("Type \"dog\" to see a dog, \"cat\" to see a cat, and \"fish\" to see a fish.");
			ans = sc.nextLine();
		}
		
		if (ans.equalsIgnoreCase("dog")) {
			System.out.println("  __      _\no\'\')}____//\n `_/      )\n (_(_/-(_/");
		}
		else if (ans.equalsIgnoreCase("cat")) {
			System.out.println(" |\\__/,|   (`\\\n |_ _  |.--.) )\n ( T   )     /\n(((^_(((/(((_/");
		}
		else {
			System.out.println("      /`·.¸\n     /¸...¸`:·\n ¸.·´  ¸   `·.¸.·´)\n: © ):´;      ¸  {\n `·.¸ `·  ¸.·´\\`·¸)\n     `\\\\´´\\¸.·´");
		}
		
	}

}
