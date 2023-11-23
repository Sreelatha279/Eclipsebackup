package Basics;

import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
		boolean flag = false;
		Scanner sc = new Scanner(System.in);// object for scanner nonstatic class
		System.out.println("Enter input");
		int x = sc.nextInt();// object.methodname

		for (int j = 2; j < x; j++) {

			if (x % j == 0) {
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("Not Prime num");

		} else {
			System.out.println("Prime num");

		}

	}

}
