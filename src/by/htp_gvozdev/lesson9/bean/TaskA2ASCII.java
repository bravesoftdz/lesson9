package by.htp_gvozdev.lesson9.bean;

/*
В тексте каждую букву заменить ее порядковым номером в алфавите. При
выводе в одной строке печатать текст с двумя пробелами между буквами,
в следующей строке внизу под каждой буквой печатать ее номер.
 */

public class TaskA2ASCII {
	public static void getTaskA2ASCII() {
		System.out.println("\n\ntask A-2(ASCII)");
		System.out.println("-----------------------------------------------------------------------");
		StringBuilder str = new StringBuilder();
		str.append("hello world");
		String codeStr = "";
		String formatStr = "";
		String strS = str.toString();
		for (char value : strS.toCharArray()) {
			codeStr += Character.isAlphabetic(value) ? String.format("%-3s", value - 'a' + 1) : value;
			formatStr += Character.isAlphabetic(value) ? String.format("%-3s", value) : value;
		}
		System.out.println(formatStr);
		System.out.println(codeStr);
	}
}

/*
 * if (Character.isAlphabetic(value)) { codeStr = codeStr +
 * String.format("%-3s", value - 'a' + 1); } else { formatStr = formatStr +
 * String.format("%-3s", value); }
 */