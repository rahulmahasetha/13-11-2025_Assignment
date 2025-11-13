import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> accounts = new ArrayList<>();

        System.out.println("Enter 5 bank account numbers:");
        for (int i = 0; i < 5; i++) {
            accounts.add(sc.nextLong());
        }

        System.out.print("Enter account number to search: ");
        long search = sc.nextLong();

        if (accounts.contains(search)) {
            System.out.println("Account FOUND!");
        } else {
            System.out.println("Account NOT found.");
        }
        sc.close();
    }
}
/* output
 Enter 5 bank account numbers:
544658
4476
654
67
68
Enter account number to search: 68
Account FOUND!

 */