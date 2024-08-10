package stringPrograms.level1;

public class ImplementationClass implements QueRequirement{
    @Override
    public void printFibonnaciSerice(int num) {
        System.out.println("Fibonnaci series till: "+num+"\n");
        int n1=0,n2=1,n3;
        for (int i=0; i<=num; i++){
            System.out.print(n1 + ", ");
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
    }
}