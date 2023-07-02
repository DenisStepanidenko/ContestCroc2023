package Problems.number2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        //Stack<Integer> current = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        List<String> all = new ArrayList<>();
        int count = 0;
        StringBuilder answer = new StringBuilder();
        //int i = 0;
        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();
            StringBuilder lineNew = new StringBuilder(line.trim());

            if (lineNew.length() == 0) {
                System.out.print(lineNew.toString() + '\n');
            } else {
                int start = count;

                for (int j = 0; j < lineNew.length(); j++) {
                    if (lineNew.charAt(j) == '{') {
                        count += 4;
                    }
                    if (lineNew.charAt(j) == '}' && count != 0) {
                        count -= 4;
                        start -= 4;
                    }


                }
                for (int m = 0; m < start; m++) {
                    lineNew.insert(0, " ");
                }
                lineNew.append("\n");
                System.out.print(lineNew.toString());
            }
        }
        scanner.close();
    }
}
