package com.neoprism.arthamticoperators;

public class JavaExercises {
	public static void main(String[] args) {
		selectCharacters();
	}

	private static void selectCharacters() {
		int i = 1;
		while (i <= 122) {
			System.out.print((char) i + "\t");
			if (i % 10 == 0)
				System.out.print("");
			i++;
		}

	}

}