package application;

import java.util.Scanner;

import entities.ReverseWords;

public class Program {

	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escreva o que deve ser invertido: ");
		String words = input.nextLine();
		
		ReverseWords reverseWords = new ReverseWords();
			
		System.out.println(reverseWords.reverseWords(words));
		
		
		
		input.close();
	}

}
