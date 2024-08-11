package stringPrograms.level1;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ImplementationClass implements QueRequirement{
    @Override
    public void printFibonnaciSeries(int num) {
        if(num>0) {
            System.out.println("\nSeries till: "+num);
            int n1=0,n2=1,n3;
            for (int i=0; i<=num; i++){
                System.out.print(n1);
                n3=n1+n2;
                n1=n2;
                n2=n3;
                if(i!=num) System.out.print(", ");
            }
        } else System.out.println("Enter Positive Number");
    }

    @Override
    public long countOfWords(String s) {
        if (s.isEmpty()) return 0;
        // It first split the string
        // i.e. if there are more than one or more whitespaces it will split the string to array
        return Arrays.stream(s.split("\\s+")).count();
    }

    @Override
    public double medianOfArray(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        if(n%2==1) return arr[n/2];
        else return (double) (arr[n-1]/2+arr[n/2])/2.0;
    }

    @Override
    public void printAlternateElements(int[] num){
        IntStream.range(0, num.length).filter(n->n%2==0).map(i->num[i]).forEach(j-> System.out.print(j+" "));
    }

}
