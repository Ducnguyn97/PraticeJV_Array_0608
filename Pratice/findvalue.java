package Pratice;

import java.util.Arrays;
import java.util.Scanner;

public class findvalue {
    public static void main(String[] args) {
        int size;
        String[] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Nhập số phần tử của mảng: ");
            size = Integer.parseInt(scanner.nextLine());
            if(size > 20){
                System.out.println("Mảng không vượt quá 20 phần tử");
            }
        }while(size>20);
        array = new String[size];
        for(int i = 0; i < array.length; i++){
            System.out.println("Nhập sinh viến thứ "+ (i+1));
            array[i] = scanner.nextLine();
        }
        System.out.println("Phần tử của mảng: "+ Arrays.toString(array));
        boolean isExist = false;
        System.out.println("Nhập tên sinh viên muốn tìm: ");
        String name = scanner.nextLine();
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(name)){
                System.out.println("Vị trí của "+ name + " trong mảng là : "+ i);
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println("Không tìm thấy sinh viên "+ name);
        }
    }
}
