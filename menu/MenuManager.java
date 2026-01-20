package menu;

import model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuManager implements Menu {

    private ArrayList<Product> products;
    private Scanner scanner;

    public MenuManager() {
        products = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    @Override
    public void displayMenu() {
        System.out.println("\n--- CLOTHING SHOP MENU ---");
        System.out.println("1. Add Shirt");
        System.out.println("2. Add Pants");
        System.out.println("3. View Products");
        System.out.println("4. Wear All Products");
        System.out.println("0. Exit");
    }

    @Override
    public void run() {
        boolean running = true;

        while (running) {
            displayMenu();
            try {
                System.out.print("Choice: ");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1 -> addShirt();
                    case 2 -> addPants();
                    case 3 -> viewProducts();
                    case 4 -> wearProducts();
                    case 0 -> running = false;
                    default -> System.out.println("Invalid choice");
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private void addShirt() {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Price: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.print("Size: ");
        String size = scanner.nextLine();

        products.add(new Shirt(name, price, size));
        System.out.println("Shirt added!");
    }

    private void addPants() {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Price: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.print("Length: ");
        int length = Integer.parseInt(scanner.nextLine());

        products.add(new Pants(name, price, length));
        System.out.println("Pants added!");
    }

    private void viewProducts() {
        for (Product p : products) {
            p.displayInfo();
        }
    }

    private void wearProducts() {
        for (Product p : products) {
            p.wear(); // POLYMORPHISM
        }
    }
}
