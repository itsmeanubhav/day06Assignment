import java.util.Scanner;

public class FibonacciSeries {
    //using recursion
    int n1 = 0, n2 = 1, n3 = 0;

    public int itsFibonacci(int count){

        if(count > 0){
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;

            System.out.print(" , "+ n3);
            itsFibonacci(count-1);
        }

        return n3;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        FibonacciSeries fS = new FibonacciSeries();
        System.out.print(fS.n1 + " , " + fS.n2);
         fS.itsFibonacci(count - 2);
    }
}
