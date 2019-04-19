package StringProblems;

import java.util.Arrays;

public class UniqueString {
	
	public static final int MAX_CHARS = 256;
	public static void main(String args[]) {
		
		String inputStrng = "abcddadaa";
		
		if(Structures(inputStrng)) {
			
			System.out.println("Unique elements using data structure");
		}
		
	}
	
	public static void withoutDataStructure(String inputStrng) {
		
		for (int i=0; i<=inputStrng.length()-1;i++) {
			if(i!=inputStrng.length()-1) {
			if(inputStrng.substring(i+1, inputStrng.length()-1).contains(String.valueOf(inputStrng.charAt(i)))){
				
				System.out.println("String does not have unique characters");
				
			}else {
				System.out.println("String has unique values");
			}
			}	
		}
		
		
	}
	
	public static boolean Structures(String inputString) {
		
		
		boolean[] chars = new boolean[MAX_CHARS];
		Arrays.fill(chars, false);
		
		for (int i = 0 ; i<inputString.length();i++) {
			
			int index = inputString.charAt(i);
			
			if(chars[index] == true) {
				return false;
			}
			chars[index] = true;
			
		}
		return true;
		
		
	}

}
