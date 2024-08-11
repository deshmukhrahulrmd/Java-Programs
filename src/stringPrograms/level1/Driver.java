package stringPrograms.level1;

import java.util.Scanner;

public class Driver {
    private final static ImplementationClass imp1 = new ImplementationClass();
    private final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        /*
        // 1. Fibonnaci Series.
        System.out.println("Enter Number for Fibonnaci Series: ");
        imp1.printFibonnaciSeries(sc.nextInt());

        // 2. Count of Words.
        System.out.println("Enter a String: ");
        System.out.printf("Total number of words are: %d", imp1.countOfWords(sc.nextLine()));;


        // 3. The Median of a Array.
        System.out.println("Enter a size of Array: ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter array elements (Press Enter after every entry): ");
        for (int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The median of array is: " + imp1.medianOfArray(arr));


        // 4. Print alternate words in string
        System.out.println("Enter a size of Array: ");
        int[] arr1 = new int[sc.nextInt()];
        System.out.println("Enter array elements (Press Enter after every entry): ");
        for (int i=0; i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Printing: ");
        imp1.printAlternateElements(arr1);
         */

        System.out.println("Enter a number: ");
        System.out.println(imp1.checkPalindrome(sc.nextInt())?"The number is Palindrome":"The number is Not Palindrome");
    }
}
