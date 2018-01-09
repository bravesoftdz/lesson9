package by.htp_gvozdev.lesson9.bean;

public class TaskC2 {
	public static void gettaskC2() {
		System.out.println("\ntask C-2");
		System.out.println("-----------------------------------------------------------------------");
		String s = "Aleksander Nikolaevich Gvozdev";
		s = s.replaceAll(" Nikolaevich", "");
		System.out.println(s); // abcd
	}
}
