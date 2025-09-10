package cote.exam14681;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				Scanner a = new Scanner(System.in);
				int A = a.nextInt();
				int B = a.nextInt();
				
				a.close();
				
				if(A>0 && B>0) {
					System.out.println("1");
				}
				else if(A<0 && B>0) {
					System.out.println("2");
				}
				else if(A<0 && B<0) {
					System.out.println("3");
				}
				else {
					System.out.println("4");
				}
	}

}
