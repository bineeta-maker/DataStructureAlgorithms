package com.searchandsort;

import java.util.Arrays;

public class RadixSorter {
    public static void main(String[] args) {

        int[] data = {344, 656, 945, 2234, 123, 245, 657, 968, 372, 568, 6788, 970};
        System.out.println(Arrays.toString(data));
        new RadixSorter().radixSort(data);
        System.out.println(Arrays.toString(data));
    }

    // The main function to that sorts arr[] of
    // size n using Radix Sort
    static void radixSort(int[] data) {
        // Find the maximum number to know number of digits
        int max = getMax(data);

        // Do counting sort for every digit. Note that
        // instead of passing digit number, exp is passed.
        // exp is 10^i where i is current digit number
        String num = Integer.toString(max);
        System.out.println(+num.length());
        for (int exp = 1; exp <= num.length(); exp++)
            countSort(data, exp);
        //for (int exp = 1; m / exp > 0; exp *= 10)
    }

    static void countSort(int data[], int exp) {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[(data[i] / exp) % 10]++;

        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[(data[i] / exp) % 10] - 1] = data[i];
            count[(data[i] / exp) % 10]--;
        }

        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to current
        // digit
        for (i = 0; i < n; i++)
            data[i] = output[i];
    }

    // A utility function to get maximum value in arr[]
    static int getMax(int data[]) {
        int max = data[0];
        for (int i = 1; i < data.length; i++)
            if (data[i] > max)
                max = data[i];
        return max;
    }
}
