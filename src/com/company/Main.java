package com.company;

public class Main {

    public static void main(String[] args) {
	int[] arr = {1,2,3,-4,5,6,-7,8,-9,10};
	   int max = arr[0];
       int imax = 0;
       int i = 0;
       while (i < arr.length) {
           if (arr[i] > max) {
               max = arr[i];
               imax = i;
           }
         i++;
       }
        System.out.println(max);

       int count = 0;
       for(int element : arr) {
           if(element > 0){
               count++;
           }
       }
        System.out.println(count);

       int sum = 0;
       for(int element : arr) {
           if(element < 0){
               sum += element;
           }
       }
        System.out.println(sum);

    }
}
