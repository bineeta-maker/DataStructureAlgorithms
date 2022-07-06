package com.searchandsort;

import java.util.Arrays;

public class CountingSorter {

    public static void main(String[] args) {

        int[] data = {5,6,9,2,1,4,5,6,7,9,8,3,2,5,6,6,7,8,5,0};
        System.out.println(Arrays.toString(data));
        new CountingSorter().countSorter(data);
        System.out.println(Arrays.toString(data));
    }

    private void countSorter(int[] data) {
        int[] aux = new int[10];
        for(int d: data){
            aux[d]++;
        }
        int i=0;
        System.out.println(Arrays.toString(aux));
        for (int count = 0; count < aux.length ; count++){
            for (int c = 0; c < aux[count]; c++){
                data[i] = count;
                i++;
            }
        }

    }

}
