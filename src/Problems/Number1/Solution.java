package Problems.Number1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int current[] = new int[a];
        int answer[] = new int[a];
        for (int i = 0; i < a; i++) {
            int x = scanner.nextInt();
            current[i] = x;
        }
        answer[0] = 1;
        int currentNumber = current[0];
        if(current[0] == 0){
            System.out.println(1);
        }
        else {
            answer[1] = currentNumber;
            int i = 2;
            if (i == a) {
                for (int j = answer.length - 1; j >= 0; j--) {
                    if (j == 0) {
                        System.out.print(answer[j]);
                    } else {
                        System.out.print(answer[j] + " ");
                    }
                }
            } else {
                while (currentNumber != 0) {
                    currentNumber = current[currentNumber - 1];
                    if (currentNumber != 0) {
                        answer[i] = currentNumber;
                        i++;
                    }
                }

                for (int j = answer.length - 1; j >= 0; j--) {
                    if (j == 0) {
                        System.out.print(answer[j]);
                    } else {
                        System.out.print(answer[j] + " ");
                    }
                }
            }
        }
    }
}