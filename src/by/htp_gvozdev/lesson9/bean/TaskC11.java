package by.htp_gvozdev.lesson9.bean;

import java.util.Random;

/*
Пусть текст содержит миллион символов и необходимо сформировать
из них строку путем конкатенации. Определить время работы кода.
Ускорить процесс, используя класс StringBuilder.
 */

public class TaskC11 {

	static String dictString = "abcdefghijklmnopqrstuvwxyz";
	static char[] chString = new char[1000000];
	static Random rnd = new Random();
	static char[] dicInArrString;
	static long t;
	static long N;

	public static void getTaskC11() {
		System.out.println("\n\ntask C-11");
		//System.out.println("-----------------------------------------------------------------------");
		N = 100000;
		t = System.nanoTime();

		System.out.println("Сoncatenation 1 by 'String'");
		dicInArrString = dictString.toCharArray();
		for (int i = 0; i < chString.length; i++) {
			int number = rnd.nextInt(dicInArrString.length - 1);
			char valueSymbol = dicInArrString[number];
			chString[i] = valueSymbol;
		}
		time();

		System.out.println("Сoncatenation 2 by 'StringBuilder'");
		for (int i = 0; i < chString.length; i++) {
			int number = rnd.nextInt(dicInArrString.length - 1);
			char valueSymbol = dicInArrString[number];
			chString[i] = valueSymbol;
		}
		String newString = new String();
		newString = chString.toString();
		StringBuilder newStrBuilder = new StringBuilder();
		newStrBuilder.append(newString);
		time();
	}

	static void time() {
		System.out.println((System.nanoTime() - t) / 1.0 / N);
		t = System.nanoTime();
	}

}
