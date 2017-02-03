package Exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Answers {
	
		

	public static void duplicatesWithCount(String input){
		List<Character> list = new ArrayList<Character>();
		System.out.println("(Question-1):\n Printing Duplicate characters in a String and the count ");

				for(int i=0;i<input.length();i++){   //Seperating the characters from the string 
													//and adding them to the list.
					list.add(input.charAt(i));
				}
					
		
				Set<Character> Set = new HashSet<Character>(list); // Getting rid of all duplicate characters in side the list.
				
				for (Character chr : Set) {         //Counting duplicates by comaparing with the list and the set.
					System.out.println(chr + ": " + Collections.frequency(list, chr)+"X");
				}

	System.out.println("\n=====================================================================================================");

			
	  }
		
	
	
	
	
	
		
		public static String ReverseWordsInAString(String WordsInAstring){
			System.out.println("(Question-2):\nReversing Words In a String\n ");
			String reversedScentence;
			String []splitting=WordsInAstring.split(" "); // Seperating the words by space and putting them into an Array.
			List<String>setting=new ArrayList<>();  // Collecting words in reversed form
			String reverseSet=""; 
		
				
			
			for(int i=splitting.length-1;i>=0;i--){    // Reversing the words and adding them to the list.
					
					setting.add(splitting[i]);
					
					
				}
				
				
				
				for(int i=0;i<setting.size();i++){     //Preparing for reverse by taking the entire list and converting them to "one" String.
					reverseSet +=setting.get(i)+" ";
					
				}
				
					
				reversedScentence=reverseSet.substring(0,1).toUpperCase()+reverseSet.substring(1).toLowerCase(); //Capitalizing the first Letter 
				System.out.println(reversedScentence);
				System.out.println("\n=====================================================================================================");
				return reversedScentence; //Returning ReversedString, incase of multiple use.
		}
		
	
		
		
		
		
		
		
	 public static String ReverseCharactersInStringWithoutStringBuffer(String input){
		 
		System.out.println("(Question-3):\nReversing Characters in a String without StringBuffer or StringBuilder\n ");
		 List<Character>list=new ArrayList<>(); //Initializing list for the characters.
		 
		 System.out.println(input+ " - Original String\n ");
		 
		 for(int i=0;i<input.length();i++){   //adding characters of the String to a list.
			 list.add(input.charAt(i));
			 
		 }
		 
		 Collections.reverse(list);  //Reversing the list
		 
		 
		 String reversedCharacter=""; 
		 
		 for(int i=0;i<list.size();i++){          // Taking reversed list and converting to one String.
		reversedCharacter+=list.get(i);
			 
		 }
		 System.out.println(reversedCharacter+ "  - Reversed String\n");
		 System.out.println("\n=====================================================================================================");
		 
		 return reversedCharacter;
	 }
			
	
	 
	 
	 
	 
	 
	public static void swapTwoNumbersWithoutTemp(int input1,int input2){
		System.out.println("(Question-4):\nSwaping Two numbers without temp variables\n");
		
		System.out.println(input1+"   " + input2 + "  <<<<<BeforeSwap");
		
		input1+=input2-(input2=input1); //Swaping the values
		
		System.out.println(input1+"   " + input2 + "  <<<<<AfterSwap");
		
		 System.out.println("\n=====================================================================================================");
		
		
	}
	
	
	
	
	

	public static void palindromeCheck(Integer input){
		
		System.out.println("(Question-5&6) Checking number, if it is Palindrome");
		
		
		List<String>list=new ArrayList<>(); //initializing list for Integers to be converted to string so we can start checking.
		
		String inputConV=input+"";//Converted input to string just for loop conditioning.
		
		String reversedList="";
		
		for(int i=0;i<inputConV.length();i++){
			String intToString=input.toString().charAt(i)+"";       //adding the characters of the string separately to list
			//System.out.println(intToString);
			list.add(intToString);
			
			
		}
		Collections.reverse(list);  //Reversed the list, to see if palindrome or not, 
									//because if Palindrome, then reverse or not reverse, it would be the same.
		
		
		for(int i=0;i<list.size();i++){
			
			reversedList+=list.get(i);    //Converting the list to one String.
			
		}
		
		int inputMain =Integer.parseInt(reversedList); //Converting the String, back to Integer because it was converted to string for comparison.
		
		
		if(input==inputMain){
			System.out.println("Palindrome Number");
		}else{
			System.out.println("Not a Palindrome");
		}
		
		
	}

	
	

		
		public static void main(String[] args) {
			duplicatesWithCount("ksjklakdjfhfyakaisjsfgftfffhfyhwkjlkjlkjlkjlk");  //Question 1 << insert characters 
			
			ReverseWordsInAString("Giving a");  // Question 2 << insert a sentence, or combination of words
			
			ReverseCharactersInStringWithoutStringBuffer("iuyuyuyttyt"); // Question 3 << insert a String
			
			swapTwoNumbersWithoutTemp(1,9);  // Question 4 <<  insert  two numbers
			
			
			palindromeCheck(77777);  // Question 5 << insert number.
				
			
		}
		
		
	}

	
	
	


