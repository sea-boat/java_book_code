package com.java.array;

public class ThreeDimentionArrayTest {
	public static void main(String[] args) {
		int[][][] arr = new int[][][] { { { 1, 2, 3 }, { 4, 5, 6 } },
				{ { 7, 8, 9 }, { 10, 11, 12 } }, { { 13, 14, 15 }, { 16, 17, 18 } } };
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				for (int m = 0; m < arr[i][j].length; m++)
					System.out.println(arr[i][j][m]);
	}
}
