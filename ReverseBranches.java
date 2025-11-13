import java.util.*;

class ReverseBranches {
    public static void main(String[] args) {
        LinkedList<String> branches = new LinkedList<>();

        branches.add("Delhi");
        branches.add("Mumbai");
        branches.add("Kolkata");
        branches.add("Chennai");

        System.out.println("Original: " + branches);

        Collections.reverse(branches);

        System.out.println("Reversed: " + branches);
    }
}
