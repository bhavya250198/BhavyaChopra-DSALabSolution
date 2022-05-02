package com.java.codes.brackets;
import java.util.*;
import com.java.codes.brackets.implementation.Brackets;

public class Main {
	
	private static void showResults() {
		Scanner ob = new Scanner(System.in);
		String str = ob.nextLine();
		
		
		
			Brackets br = new Brackets();
			boolean printBrackets = br.showBalanced(str);
				if(printBrackets)
					System.out.println("The Entered String has Balanced Brackets");
				else
					System.out.println("The Entered String has Unbalanced Brackets");
		}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		showResults();
}
}