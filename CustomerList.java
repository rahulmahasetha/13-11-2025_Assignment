import java.util.ArrayList;

public class CustomerList {
    public static void main(String[] args) {
        ArrayList<Customer> list = new ArrayList<>();

        list.add(new Customer(1, "Rahul", 8000));
        list.add(new Customer(2, "Riya", 15000));
        list.add(new Customer(3, "Aman", 22000));
        list.add(new Customer(4, "Sneha", 5000));

        System.out.println("Customers with balance > 10,000:");
        for (Customer c : list) {
            if (c.balance > 10000) {
                System.out.println(c.id + " - " + c.name + " - ₹" + c.balance);
            }
        }
    }
    
}
class Customer {
    int id;
    String name;
    double balance;

    Customer(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
}
