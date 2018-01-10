package by.htp_gvozdev.lesson9.bean;

/*
В тексте каждую букву заменить ее порядковым номером в алфавите. При
выводе в одной строке печатать текст с двумя пробелами между буквами,
в следующей строке внизу под каждой буквой печатать ее номер.
 */

public class TaskA2Alphabet {

	public static void getTaskA2Alphabet() {
		System.out.println("\n\ntask A-2(Alphabet)");
		//System.out.println("-----------------------------------------------------------------------");
		String alphabet = "abcdefghijklmnopqrstuvwxyz".toLowerCase();
		StringBuilder oldStr = new StringBuilder();
		oldStr.append("hello world");
		String str = oldStr.toString();
		char[] charArray = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			System.out.print(charArray[i] + "  ");
		}
		System.out.println("");
		for (char x : charArray) {
			if (x == ' ') {
				System.out.print(" ");
			} else {
				int i = alphabet.lastIndexOf(x);
				i += 1;
				System.out.print(i + " ");
			}
		}
	}
}
