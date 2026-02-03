package menu;

import database.StaffDAO;
import model.Chef;
import java.util.Scanner;

public class RestaurantMenu {
    private StaffDAO staffDAO = new StaffDAO();
    private Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("1. Add Chef\n2. Search by Name\n3. Delete Staff\n0. Exit");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                staffDAO.insertStaff(new Chef(0, "Aibek", 500000, 5, "Italian"));
                break;
            case 2:
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                staffDAO.searchByName(name).forEach(s -> System.out.println(s.getName()));
                break;
            case 3:
                System.out.print("Enter ID to delete: ");
                int id = scanner.nextInt();
                staffDAO.deleteStaff(id);
                break;
        }
    }
}