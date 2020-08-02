package vowels;
/*Reine Julianne Jorda
Mr. Christian
 * ICS4U
 * 11 July 2019
 * 
 *Create a CountVowels application that prompts the user for a string and then displays a count of the
number of vowels in the string. Application output should look similar to:
 
                                Enter text : Java is amazing.
           Number of vowels in Java is amazing is 6.

 */
import java.util.Scanner;
public class vowel {

	public static void main(String[] args) {
		Scanner text = new Scanner(System.in);
		String sentence;
		System.out.println("Enter any line of text to determine the number of vowels:");
		sentence = text.nextLine();
		//change all text to lowercase so no need to include upper case letters
		String line = sentence.toLowerCase();
		/* for every character in the string, check if it is a vowel. To do so, I need to start
		 * my index at zero and proceed to continuously go up. I do this by first setting my index value as 0,
		 * then check if that index is less than the number of characters in the actual string so I can check each one
		   after this, I will proceed with an increment for my index variable so it adds 1 every time it loops*/
		int vowelCounter = 0;
		for (int i = 0; i < line.length(); i++){
			char character = line.charAt(i);
			/* create a char and set it's value to the character at certain index for sentence. This will reset
			 * every time I loop each value. I proceed by having an if statement which determines whether that
			 * character is equal to any of the vowels (a,e,i,o,u). If that is true, the vowel counter will add
			 * and the number of vowels will be determined after going through each character.
			 */
			if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
			vowelCounter++;
			}
			}
		System.out.println("The number of vowels in " + sentence + " is: " + vowelCounter);
	}

}
