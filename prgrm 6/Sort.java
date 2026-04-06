import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of strings:");
        int n = sc.nextInt();
        sc.nextLine();

        String[] strings = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }

        Arrays.sort(strings);

        System.out.println("\nSorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        sc.close();
    }
}
   
