package question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KthLargestFactor {
    public static int kthLargestFactor(int N, int k) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                factors.add(i);
            }
        }
        if (k <= factors.size()) {
            return factors.get(factors.size() - k);
        } else {
            return -1; // If k is greater than the number of factors, return -1
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int k = input.nextInt();
        input.close();

        int result = kthLargestFactor(N, k);
        if (result != -1) {
            System.out.println("The " + k + "th largest factor of " + N + " is " + result + ".");
        } else {
            System.out.println("There are fewer than " + k + " factors for " + N + ": "+ 1);
        }
    }
}
