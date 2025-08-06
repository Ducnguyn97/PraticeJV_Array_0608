import java.util.Arrays;
import java.util.Scanner;

public class invertArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner =new Scanner(System.in);
        do{
            System.out.println("Nhập vào số phần tử của mảng");
            size=scanner.nextInt();
            if(size > 20){
                System.out.println("Mảng không quá 20 phần tử");
            }
        }while(size>20);
        array=new int[size];
        for(int i=0 ; i<array.length ; i++){
            System.out.println("Phần tư thứ "+ (i+1));
            array[i]=scanner.nextInt();
        }
        System.out.println("Phần tử của mảng: "+ Arrays.toString(array));
        int first = 0;
        int last =  array.length-1;
        int temp =0;
        while(first<last){
            temp=array[first];
            array[first]=array[last];
            array[last]=temp;
            first++;
            last--;
        }
        System.out.println("Phần tử của mảng đảo ngược: "+ Arrays.toString(array));
    }

}
