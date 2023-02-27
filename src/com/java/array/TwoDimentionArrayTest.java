package com.java.array;

public class TwoDimentionArrayTest {
	public static void main(String[] args) {
		int[][] arr = new int[][] { { 1, 3, 5, 7 }, { 9, 11, 2, 4 }, { 6, 8, 10, 12 } };
		int[][] arr2 = { { 1, 3, 5, 7 }, { 9, 11, 2, 4 }, { 6, 8, 10, 12 } };

		int[][] arr3 = new int[3][4];
		arr3[0][0] = 1;
		arr3[0][1] = 3;
		arr3[0][2] = 5;
		arr3[0][3] = 7;
		arr3[1][0] = 9;
		arr3[1][1] = 11;
		arr3[1][2] = 2;
		arr3[1][3] = 4;
		arr3[2][0] = 6;
		arr3[2][1] = 8;
		arr3[2][2] = 10;
		arr3[2][3] = 12;

		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[0].length; j++) {
				System.out.println(arr[i][j]);
				System.out.println(arr2[i][j]);
				System.out.println(arr3[i][j]);
			}
	}
}
