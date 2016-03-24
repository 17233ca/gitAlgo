package com.npu.algo;

import java.util.Scanner;

public class TruthTable {

	private static void printTruthTable(int n) {
		long count = 0;
		System.out.println("---------Truth Table of " + n + " input function---------");
		int rows = (int) Math.pow(2, n);

		if (n < 30) {
			for (int i = 0; i < rows; i++) {
				for (int j = n - 1; j >= 0; j--) {
					count++;
					System.out.print((i / (int) Math.pow(2, j)) % 2 + " ");
				}
				System.out.println();
			}
		} else if (n >= 30) {
			for (int i = 0; i < rows; i++) {
				for (int j = n - 1; j >= 0; j--) {
					count++;
					// System.out.print((i/(int) Math.pow(2, j))%2 + " ");
				}
			}
			System.out.println("The total steps: " + count);
			System.out.println("For " + n + "inputs" + " table size is " + (long) Math.pow(2, n));

		}
		System.out.println("The total steps: " + count);
		System.out.println("For " + n + " inputs," + " table size is " + (long) Math.pow(2, n));
	}

	public static void main(String[] args) {
		char temp1;
		System.out.println("Class TruthTable");

		do {

			System.out.print("Enter an input function: ");
			Scanner sc = new Scanner(System.in);
			int temp = sc.nextInt();
			printTruthTable(temp); // enter any natural int
			System.out.print("wish to continue?");
			char conti = sc.next().charAt(0);
			temp1 = Character.toUpperCase(conti);
		} while (temp1 == 'Y');

	}
}