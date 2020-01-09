import java.util.*;

public class lab00{

	public static void main(String[]args){
	// declaring and intitializing some variables
	int x = 5;
	String y = "Hello";
	double z = 9.8;

	//printing the variables
	System.out.println("X: " + x + " Y: " + y + " Z: " + z);

	//an array of numbers and for each loop to print numbers
	int[] myArray = {3, 6, -1, 2};
	for(int array: myArray){
		System.out.println(array);
	}

	//for loop
	for(int i = 1; i <=11; i++){
		System.out.print(i + " ");
	}
	System.out.println();

	//function call
	int numFound = char_count(y, 'l');
	System.out.println("Found: " + numFound);

	}

// function to check if character is equal to string variable
public static int char_count(String y, char c){
	int count = 0;
	for(int i = 0; i < y.length(); i++){
		if(y.charAt(i) == c){
			count++;
		}
	}
	return count;
}


}