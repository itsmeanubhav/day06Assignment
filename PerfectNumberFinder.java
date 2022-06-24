import java.util.Scanner;

public class PerfectNumberFinder {

    public int perfectNumberOrNot(int iP){
        int sum = 0;
        for(int i = 1; i <= iP/2; i++){
            if((iP % i) == 0)
            sum += i;
        }
        if(sum == iP){
            System.out.println("It is a Perfect Number");
        }else{
            System.out.println("It is not a Perfect Number");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int iP = scan.nextInt();

        PerfectNumberFinder PNF = new PerfectNumberFinder();
        PNF.perfectNumberOrNot(iP);
    }
}
