package cote.exam1330;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				Scanner a = new Scanner(System.in);
				int A = a.nextInt();
				int B = a.nextInt();
				
				a.close();
				
				if(A<B) {
					System.out.println("<");
				}
				else if(A>B) {
					System.out.println(">");
				}
				else {
					System.out.println("==");
				}
	}

}