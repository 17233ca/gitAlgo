package com.npu.algo;

import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author choud
 */
// package com.npu.algo;

class MinMax {
	private int[] a;
	private int n;
	private int min;
	private int max;
	private int numCompare;
	private int minr;
	private int maxr;
	private int numComparer;
	private int numRecursionr;
	private static final IntUtil u = new IntUtil();

	MinMax(int s) {
		numCompare = 0;
		numComparer = 0; // 5000
		numRecursionr = 0;
		System.out.println("--------------------------------");
		System.out.println("--------Simple----------");
		a = u.generateRandomNumber(s, false); // 5k random nos.
		minMaxSimple();
		System.out.println("Min= " + min + " Max= " + max);
		u.printStatistics(n, numCompare, 0, 0);
		System.out.println("---------Recursive--------------");
		minMaxRecursive(0, n - 1);
		System.out.println("Minr= " + minr + " Maxr= " + maxr);
		assert (min == minr);
		assert (max == maxr);
		u.printStatistics(n, numComparer, 0, numRecursionr);
		System.out.println("--------------------------------");
	}

	private void minMaxSimple() {

		n = a.length;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				numCompare++;
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		min = a[0];
		max = a[a.length - 1];
	}

	private void minMaxRecursive(int l, int r) {
		numRecursionr++;
		int i = l;
		int j = r;

		int pivot = a[l + (r - l) / 2];

		numComparer++;
		while (i <= j) {
			

			while (a[i] < pivot) {
				i++;
			}
			while (a[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchangeNumbers(i, j);

				i++;
				j--;
			}
		}

		if (l < j)
			minMaxRecursive(l, j);
		if (i < r)
			minMaxRecursive(i, r);
		minr = a[0];
		maxr = a[a.length - 1];
		
	}

	private void exchangeNumbers(int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	private static void testBench() {
		MinMax t = new MinMax(5000);
		MinMax t1 = new MinMax(50001);
	}

	public static void main(String[] args) {
		System.out.println("MinMax.java");
		testBench();
	}
}
