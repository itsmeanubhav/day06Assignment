import java.util.Scanner;

public class PrimeOrNot {

    public int checkPrimeOrNot(int iP){

        if(iP > 2){
            for(int i = 2; i <= iP/2; i++){
                if(iP%i == 0){
                    System.out.println(iP + " is NOT a PRIME NUMBER");
                    break;
                }else{
                    System.out.println(iP + " is a PRIME NUMBER");
                    break;
                }
            }
        }else if(iP == 2){
            System.out.println(iP + " is a PRIME NUMBER");
        }else{
            System.out.println(iP + " is NOT a PRIME NUMBER");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write a number to check whether it is prime or not");
        int iP = scan.nextInt();
        PrimeOrNot checkPrime = new PrimeOrNot();

        checkPrime.checkPrimeOrNot(iP);


    }
}
