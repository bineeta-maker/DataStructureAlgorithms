package com.searchandsort;

import java.util.Arrays;

public class QuickSorter {
    private int[] data;

    public static void main(String[] args) {

        int[] data = {34,6,9,2,1,45,67,98,32,56,678,50};
        System.out.println(Arrays.toString(data));
        new QuickSorter().quicksort(data, 0,data.length-1);
        System.out.println(Arrays.toString(data));
    }

    private void quicksort(int[] data, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(data, start, end);
            quicksort(data, start, pivotIndex-1);
            quicksort(data, pivotIndex+1, end);
        }
    }

    private int partition(int[] data, int start, int end) {
        int pivot = data[end];
        int i = start;
        for (int j=start; j <= end - 1 ;j++){// partition counter to start from split array start
            if (data[j] < pivot){
                int tmp = data[i];
                data[i] = data[j];
                data[j] = tmp;
                i++;
            }
        }
        data[end] = data[i];
        data[i] = pivot;
        System.out.println("PP:"+ Arrays.toString(data));
        return i;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        for (int i : data) {
            sb.append(i);
            sb.append(',');
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append('}');
        return sb.toString();
    }

}
