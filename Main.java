import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Clothing> store = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Shirt");
            System.out.println("2. Add Pants");
            System.out.println("3. View All");
            System.out.println("4. Buy All");
            System.out.println("0. Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Size: ");
                String size = sc.next();

                store.add(new Shirt(name, price, size));
            }

            else if (choice == 2) {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Material: ");
                String material = sc.next();

                store.add(new Pants(name, price, material));
            }

            else if (choice == 3) {
                for (Clothing c : store) {
                    System.out.println(c);
                }
            }

            else if (choice == 4) {
                for (Clothing c : store) {
                    c.buy();
                }
            }

            else if (choice == 0) {
                break;
            }
        }
    }
}