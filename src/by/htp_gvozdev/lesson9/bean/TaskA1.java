package by.htp_gvozdev.lesson9.bean;

/*
В каждом слове текста k-ю букву заменить заданным символом. Если k
больше длины слова, корректировку не выполнять.
*/

public class TaskA1 {

	public static void getTaskA1() {
		System.out.println("task A-1");
		System.out.println("-----------------------------------------------------------------------");
		String str = "java is e very good language!";
		int k = 2;
		String temp;
		String[] words = str.split("[\\s\\.\\!\\,]");
		for (int l = 0; l < words.length; l++) {
			System.out.print("");
			if (k < words[l].length()) {
				temp = "";
				temp += words[l].substring(0, k - 1);
				temp += '~';
				temp += words[l].substring(k, words[l].length());
				words[l] = temp;
			}
			System.out.print(" " + words[l]);
		}
	}

}
