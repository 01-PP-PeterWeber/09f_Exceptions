package com.cc.java;

public class App {

	public static void main(String[] args) {
		
		String str;  // String
		char ch; // Character
		
		try 
		{		
			str = "Wizzywizzrd is tha mothafuckin' best!";
			System.out.println("Stringlänge :" + str.length());
			
			ch = str.charAt(200);
			System.out.println("Character :" + ch);	
		} 
		catch (StringIndexOutOfBoundsException e) {
			// Fehlerbehandlung ...
			System.out.println("Index Fehler, bitte Eingabe prüfen!");		
		}
		catch (Exception e) {
			// Weitere Fehler-Routinen ....
		}
		
		
	}

}
