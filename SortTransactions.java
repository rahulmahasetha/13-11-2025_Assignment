import java.util.ArrayList;
import java.util.Collections;

public class SortTransactions {
    public static void main(String[] args) {
        ArrayList<Integer> transactions = new ArrayList<>();

        transactions.add(5000);
        transactions.add(1500);
        transactions.add(9000);
        transactions.add(2500);
        transactions.add(400);

        System.out.println("Before sorting: " + transactions);

        Collections.sort(transactions);

        System.out.println("After sorting: " + transactions);
    }
}
