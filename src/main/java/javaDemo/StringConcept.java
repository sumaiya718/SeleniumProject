package javaDemo;

public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "I am a girl.";
		String str2 = "I am Sumaiya.";
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		String str3 = "Learning String";
		String str4 = "Learning String";
		
		System.out.println(str3.equals(str4));
		
		System.out.println(str3.length());
		
		System.out.println(str1.concat(str2));
		
		String str5 = "      Trimming white space";
		
		System.out.println(str5.trim());
		
		System.out.println(str1.toLowerCase());
		System.out.println(str2.toUpperCase());
		
		System.out.println(str2.contains("umai"));
	}

}
