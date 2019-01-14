package bubblesort;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers = new int[N];
        boolean sort = true;
        
        for (int x = 0; x < numbers.length; x++) {
            numbers[x] = sc.nextInt();
        }
        
        int y = 0;
        
        while (sort) {
            int temp = numbers[y];
            if (temp > numbers[y + 1]) {
                numbers[y] = numbers[y + 1];
                numbers[y + 1] = temp;
                System.out.print(print(numbers, 0, ""));
                System.out.println("");
            }
            y++;
                     
            if (y == numbers.length - 1) {
                sort = check(numbers);
                y = 0;
            }
        }
        
    }
    
    public static boolean check(int[] x) {
        for (int y = 0; y < x.length - 1; y++) {
            if (x[y] > x[y+1]) {
                return true;
            }
        }
        return false;
    }
    
    public static String print(int[] x, int y, String ret) {
        if (y == x.length - 1) {
            return ret + x[y];
        } else {
            return print(x, y+1, ret + x[y] + " ");
        }
    }
}
