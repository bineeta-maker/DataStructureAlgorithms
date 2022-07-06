package com.searchandsort;

import java.util.Arrays;

public class MergeSorter {

    public static void main(String[] args) {
        Integer[] data = {34,6,9,2,1,0,45,67,98,32,56,678};
        System.out.println(Arrays.toString(data));
        new MergeSorter().sort(data, 0, data.length-1);
        System.out.println(Arrays.toString(data));
    }

    public void sort(Integer[] data, int start, int end) {
        System.out.println("\n start:"+start);

        System.out.println("end:"+end);
        if (start < end){
            int middle = ((start+end) / 2);
            sort(data, start, middle);
            sort(data, middle+1, end);
            merge(data, start, middle, end);
        }

    }

    private Integer[] merge(Integer[] data, int start, int middle, int end) {

        Integer[] left = new Integer[middle - start + 1];
        Integer[] right = new Integer[end - middle];
        System.out.println("merge start:"+start);
        System.out.println("middle:"+middle);
        System.out.println("end:"+end);
        System.out.println("middle - start + 1:"+(middle - start + 1));
        System.out.println("end - middle:"+(end - middle));

        for (int i = 0; i < (middle - start + 1); i++) {
            left[i] = data[start+i];
        }
        for (int i = 0; i < (end - middle); i++) {
            right[i] = data[middle+1+i];
        }




        int i = 0, j = 0;



        for (int k = start; k <= end; k++) {
            // check the size when the array is of size 1, it get arrayindexout of bound for loop in 1 size
            if ((j >= (end - middle)) || (i < (middle - start + 1) && left[i] <= right[j])) {
                data[k] = left[i];
                i++;
            } else {
                data[k] = right[j];

                j++;
            }
            System.out.println(k);
            System.out.println(Arrays.toString(left));
            System.out.println(Arrays.toString(right));
            System.out.println(Arrays.toString(data));




        }
        return data;
    }
}
