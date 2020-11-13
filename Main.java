package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Size of the massive is: ");
        int length= s.nextInt();
        System.out.println("Enter the elements of massive: ");
        int[] array = new int[length];
        for(int i=0;i<length;i++){
            array[i] = s.nextInt();
        }
        System.out.println("Minimum positive value which is not in this massive is: " + notContains(array));
    }
    public static int notContains(int[] array){
        //Arrays.sort(array);
        int minValue = 1; // minimum positive value
        for(int i =0; i<array.length;i++){
            if (array[i] == minValue){
                ++minValue;
            }
        }
        return minValue;
    }
}
