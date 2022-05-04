package example01;

import java.util.Arrays;

public class BubbleSortEx {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 20) + 1;
		}
		
		System.out.println("sorting �� : " + Arrays.toString(arr));
		
		// 1. Bubble Sort
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		// 2. Arrays Ŭ���������� sort(��������) ����
		Arrays.sort(arr);
		
		System.out.println("sorting �� : " + Arrays.toString(arr));
		

		
	}
}
