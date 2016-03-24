package com.npu.algo;

import java.util.Arrays;

class ArrayBubbleSort extends ArraySort {

	@Override
	protected void sort(boolean ascend) {
		numCompare = 0;
		numSwap = 0;
		//Arrays.sort(a);
		//if (ascend == true) {

			for (int i = 0; i < a.length - 1; i++) {
				for (int j = 1; j < a.length - i; j++) {

					numCompare++;
					
					if (a[j - 1] > a[j]) {
						int temp = a[j];
						a[j] = a[j - 1];
						a[j - 1] = temp;
						numSwap++;
					}
				}
				
			}

		//}

	}

	public static void main(String[] args) {
		System.out.println("ArraySort.java");
		ArraySort a = new ArrayBubbleSort();
		a.testBench();

	}

}