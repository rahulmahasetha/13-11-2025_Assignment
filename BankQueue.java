import java.util.*;

class BankQueue {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();

        queue.add("Rahul");
        queue.add("Riya");
        queue.add("Aman");
        queue.add("Sneha");

        System.out.println("Bank Queue: " + queue);

        // Serving the first customer
        String served = queue.poll();
        System.out.println("Serving: " + served);

        System.out.println("Remaining Queue: " + queue);
    }
}
