package Pratice;

import java.util.Arrays;
import java.util.Scanner;

public class maxValue {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println(" Nhập vào số phần tử của mảng: ");
            size = scanner.nextInt();
            if(size >20){
                System.out.println("Mảng không quá 20 phần tử");
            }
        }while(size>20);
        array = new int[size];
        for(int i=0;i<array.length;i++){
            System.out.println("Phần tử thứ "+ (i+1));
            array[i] = scanner.nextInt();
        }
        System.out.println("Phần tử mảng: "+ Arrays.toString(array));
        int max = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("GTLN cả mảng: "+max);
    }
}
