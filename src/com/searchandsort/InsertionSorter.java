package com.searchandsort;

import java.util.Arrays;

public class InsertionSorter {
	
	public static void main(String[] args) {
		Integer[] data = {34,6,9,2,1,0,45,67,98,32,56,678};
		System.out.println(Arrays.toString(data));
		new InsertionSorter().sort(data);
		System.out.println(Arrays.toString(data));
	}
	
	public void sort(Integer[] data) {
		for (int i =0; i < data.length; i++) {
			int current = data[i];
			int j = i-1;
			System.out.println("\ncurrent: " +current);
			System.out.println("j: " +j);
			System.out.println(Arrays.toString(data));
			while (j >=0 && data[j] >= current) {// first iteration noting happens
				System.out.println(i +","+j);
				data[j+1] = data[j];
				j--;

			}
			data[j+1] = current; // second element is assigned now as current
			System.out.println(Arrays.toString(data));
		}
	}
}
