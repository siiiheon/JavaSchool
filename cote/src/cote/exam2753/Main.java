package cote.exam2753;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				Scanner a = new Scanner(System.in);
				int A = a.nextInt();
				
				a.close();
				
				if(A%4==0) {
					if(A%400==0) System.out.println("1");
					else if(A%100==0) System.out.println("0");
					else System.out.println("1");
				}
				else System.out.println("0");
	}

}