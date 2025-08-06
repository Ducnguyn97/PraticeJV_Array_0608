import java.util.Scanner;

public class tranferTemperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double f;
        double c;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to celcius");
            System.out.println("2. Celcius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Nhập vào lựa chọn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập vào độ F: ");
                    f = Double.parseDouble(scanner.next());
                    System.out.println("Fahrenheit to celcius: "+ fahrenheitToClesius(f));
                    break;
                case 2:
                    System.out.println("Nhập vào độ C: ");
                    c = Double.parseDouble(scanner.next());
                    System.out.println("Celcius to fahrenheit: "+ clesiusToFahrenheit(c));
            }
        } while(choice!=0);

    }
    public static double clesiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToClesius(double fahrenheit){
        double celsius = ( 5.0/9) * (fahrenheit - 32);
        return celsius;
    }

}
