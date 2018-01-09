package by.htp_gvozdev.lesson9.bean;

import java.util.HashMap;
import java.util.Map;

public class TaskA9 {
	public static void getTaskA9() {
		/*
		 * Определить, сколько раз повторяется в тексте каждое слово, которое
		 * встречается в нем.
		 */
		System.out.println("\ntask A-9");
		System.out.println("-----------------------------------------------------------------------");
		String str = "Вот тут, тут повторяются слова!";
		String[] words = str.toLowerCase().replaceAll("[-.?!(),:]", "").split(" ");

		Map<String, Integer> counterMap = new HashMap<>();
		for (String word : words) {
			if (!word.isEmpty()) {
				Integer count = counterMap.get(word);
				if (count == null) {
					count = 0;
				}
				counterMap.put(word, ++count);
			}
		}
		System.out.println("Sentence: \"" + str + "\"");
		for (String word : counterMap.keySet()) {
			System.out.println(word + ": " + counterMap.get(word));
		}
	}
}
