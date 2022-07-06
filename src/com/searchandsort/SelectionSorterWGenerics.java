package com.searchandsort;



public class SelectionSorterWGenerics<T> {
	
	public void sort(Comparable<T>[] objects) {
		for (int i=0; i < objects.length-1; i++) {

			int minIndex = i;

			System.out.println("\n\nminIndex" +minIndex);
			System.out.println("i" +i);

			for (int j = i+1; j < objects.length; j++) {
				if (objects[j].compareTo((T) objects[minIndex]) < 0) {
					minIndex = j;
				}
			}
			System.out.println("minIndex" +minIndex);
			Comparable<T> tmp = objects[minIndex];
			objects[minIndex] = objects[i];
			objects[i] = tmp;
			for (int b=0; b < objects.length; b++) {
				System.out.print(objects[b]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Circle[] circles = new Circle[]{new Circle(12), new Circle(4), 
				new Circle(2), new Circle(19), new Circle(6)};
		SelectionSorterWGenerics<Circle> sorter = new SelectionSorterWGenerics<Circle>();
		sorter.sort(circles);
		for (int i=0; i < circles.length; i++) {
			System.out.print(circles[i]);
		}
	}

}
