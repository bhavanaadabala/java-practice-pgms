package bhavana;

import java.util.Scanner;

public class CharacterDisplay {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word");
		String word = sc.nextLine();
		//System.out.print(word.charAt(0));
		//System.out.print(word.charAt(2));
		//System.out.print(word.charAt(4));
		//System.out.print(word.charAt(6));
		for(int i=0;i<word.length();i+=2)
		{
			System.out.print(word.charAt(i));
		}
	}

}
