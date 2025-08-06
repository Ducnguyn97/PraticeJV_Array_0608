package Pratice;

import java.util.Arrays;
import java.util.Scanner;

public class minValue {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Nhập vào số pần tử của mảng: ");
            size = Integer.parseInt(scanner.nextLine());
            if(size > 20){
                System.out.println("Mảng không quá 20 phần tử");
            }
        }while(size>20);
        array  = new int[size];
        for(int i=0;i<array.length;i++){
            System.out.println("Phần tử thứ "+ (i+1));
            array[i]= Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng: " + Arrays.toString(array));
        System.out.println("GTNN: "+ minValue(array));
    }
    public static int minValue(int[] array){
        int min = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
