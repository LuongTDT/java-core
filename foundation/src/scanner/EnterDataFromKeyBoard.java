package scanner;

import java.util.Scanner;

public class EnterDataFromKeyBoard {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println(" plz enter any string: ");
		String s = scanner.nextLine();
		System.out.println("ban vua nhap: "+s);
		System.out.println(" plz enter any string: ");
		String s1 = scanner.nextLine();
		System.out.println("ban vua nhap: "+s1);
	}
}
