package question2;

import java.util.Scanner;

public class PairOfTargetValue1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Total Pairs : " + pairsOfDifference(n, k, arr));
    }

    private static int pairsOfDifference(int n, int k, int[] arr) {
        int counter = 0;
        for (int p : arr) {
            for (int q : arr) {
                if (q < p) {
                    int value = p - q;
                    if (value == k) {
                        counter += 1;
                    }
                }
            }
        }
        return counter;
    }
}
