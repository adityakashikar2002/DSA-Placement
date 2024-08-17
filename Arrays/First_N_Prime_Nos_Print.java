import java.util.*;
public class n_prime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        N_prime(n);
    }

    public static void N_prime(int N)
    {
        int x = 2;

        while (N > 0) {
            boolean isPrime = true;

            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(x + " ");
                N--;
            }

            x++;
        }
    }
}
