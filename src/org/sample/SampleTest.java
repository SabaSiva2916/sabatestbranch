package org.sample;

public class SampleTest {

	public static void main(String[] args) {

		System.out.println("Hello java");
		String str = "Welcome world";
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		System.out.println(reverse);
	}
}
