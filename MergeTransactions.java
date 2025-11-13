import java.util.*;

class MergeTransactions {
    public static void main(String[] args) {
        LinkedList<Integer> t1 = new LinkedList<>();
        LinkedList<Integer> t2 = new LinkedList<>();

        t1.add(101);
        t1.add(102);
        t1.add(103);

        t2.add(201);
        t2.add(202);
        t2.add(203);

        System.out.println("Transactions 1: " + t1);
        System.out.println("Transactions 2: " + t2);

        t1.addAll(t2);

        System.out.println("Merged: " + t1);
    }
}
