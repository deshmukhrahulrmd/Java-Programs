package stringPrograms.level1;

import java.util.Scanner;

public class Driver {
    private final static ImplementationClass imp1 = new ImplementationClass();
    private final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Number for Fibonnaci Series: ");
        imp1.printFibonnaciSeries(sc.nextInt());
    }
}
