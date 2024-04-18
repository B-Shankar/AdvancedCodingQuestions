package question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int K = input.nextInt();
        input.close();

        int count = 0;
        for (int i = N; i >= 1; i--){
            if(N % i == 0){
                count++;
            }
            if (count == K){
                System.out.println(i);
                break;
            }
        }
        if(count != K){
            System.out.println(1);
        }
    }
}
