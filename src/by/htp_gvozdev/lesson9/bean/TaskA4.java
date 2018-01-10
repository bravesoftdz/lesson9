package by.htp_gvozdev.lesson9.bean;

/* 4. В тексте после k-го символа вставить заданную подстроку. */
public class TaskA4 {
	public static void getTaskA4() {

		System.out.println("\ntask A-4");
		//System.out.println("-----------------------------------------------------------------------");
		StringBuilder str1 = new StringBuilder();
		String str2 = new String();
		int insertIndex = 8;
		str1.append("012345679");
		str2 = "8";
		StringBuilder newStr = new StringBuilder();
		newStr = str1.insert(insertIndex, str2);
		System.out.println("old string: " + str1 + " insert string: " + str2 + " RESULT: " + newStr);

	}
}
