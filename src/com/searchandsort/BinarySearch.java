package com.searchandsort;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        Integer[] data = {3, 5, 7, 8, 9, 12, 16, 23};

        int l = new BinarySearch().search(data,8, 0, data.length-1);
        System.out.println(l);
    }

    private int search(Integer[] data, int i, int min, int max) {
        int middle = ((max+min) / 2);
        if (data[middle] == i) {
            return middle;
        }

        if (i < data[middle]){
            return search(data, i, min, middle);

        }
        return search(data, i, middle+1, max);
    }

}
