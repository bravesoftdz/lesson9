package by.htp_gvozdev.lesson9.bean;

/*
 * Исключить из текста подстроку максимальной длины, начинающуюся и за-
канчивающуюся одним и тем же символом.
 */
public class TaskC2 {
	public static void gettaskC2() {
		System.out.println("\ntask C-2");
		//System.out.println("-----------------------------------------------------------------------");
		String s = "Aleksander Nikolaevich Gvozdev";
		s = s.replaceAll(" N.*h", "");
		System.out.println(s); // abcd
	}
}
