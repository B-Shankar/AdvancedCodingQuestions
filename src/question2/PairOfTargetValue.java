package question2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PairOfTargetValue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int counter = 0;
        Set<Integer> value = new HashSet<>();
        for(int j : arr){
            value.add(j);
        }

        for(int c: value){
            if(value.contains(c + k)){
                ++counter;
            }
        }
        System.out.println("Total Pairs " + counter);
    }
}
