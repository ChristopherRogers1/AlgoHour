import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        isPrime(2);
        isPrime(0);
        isPrime(1);
        isPrime(31);
    }

    public static boolean isPrime(int num)
    {
        Scanner scan = new Scanner(System.in);

        int checkNum = num;

        boolean isPrime = false;

        for (int n = 1; n < checkNum; n++)
        {
            if (checkNum%n==0)
                isPrime=true;

        }

        if (isPrime)
            System.out.println("This number is prime!");
        else
            System.out.println("This number is not prime.");

        return isPrime;
    }
}