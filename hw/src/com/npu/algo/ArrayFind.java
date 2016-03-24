package com.npu.algo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFind {

	public void arrayTest(int[] a, int x) {

		System.out.print("A= {");
		for(int z:a){
			System.out.print(" "+z);
		}
		System.out.println("}");
		System.out.println("X = "+x);
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[i] + a[j] == x) {
					System.out.println("The pairs are: {" + a[i] + " " + a[j] + "}");
				}
			}
		}
	}

	public void arrayGen() {
		int[] a = { 6, 4, 5, 7, 9, 1, 2 };
		int x = 10;

		arrayTest(a, x);
	}

	public void arrayTest2(int[] b) {

		while (true) {
			int x = (int) (-2147483648 + Math.random() * 2147483648L);

			if (b.equals(x)) {
				continue;
			} else {
				System.out.println("The number not in the array is:" + x);
				break;
			}
		}

	}

	public void arrayGen2(int n) {
		int[] b = new int[n];

		System.out.print("{");
		for (int i = 0; i < n; i++) {
			b[i] = (int) (-2147483648 + Math.random() * 2147483648L);
			System.out.print(b[i] + " ");
		}
		System.out.println("}");

		arrayTest2(b);
	}

	public void quest2() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		arrayGen2(n);

	}

	public static void main(String[] args) {

		ArrayFind arrayFindObj = new ArrayFind();
		arrayFindObj.arrayGen();
		System.out.println("");
		arrayFindObj.quest2();
	}
}
