package javaPack;

import java.util.Scanner;

public class MainRestaurant 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // show your original menu
        DisplayMenu menu = new DisplayMenu();

        Ordermenu order = new Ordermenu();
        Reciept receipt = new Reciept();

        // arrays for menu items
        String[] breakfast = {
            "Pancakes --------- $4.50",
            "Scrambled eggs --- $2.00",
            "Bacon ------------ $2.50",
            "Bagel ------------ $4.50",
            "Waffles ---------- $4.50"
        };

        String[] lunch = {
            "Ham Sandwich ----- $4.50",
            "Salad ------------ $8.50",
            "Soup ------------- $13.50",
            "Burger ----------- $8.00",
            "Rice ------------- $15.50"
        };

        String[] dinner = {
            "Spaghetti -------- $4.50",
            "Lasagna ---------- $2.00",
            "Steak ------------ $2.50",
            "Chicken ---------- $4.50",
            "Burrito ---------- $4.50"
        };

        boolean running = true;

        while (running)
        {
            System.out.println("Choose a menu:");
            System.out.println("1. Breakfast");
            System.out.println("2. Lunch");
            System.out.println("3. Dinner");
            System.out.println("4. Checkout");
            System.out.print("Enter choice: ");

            int choice = input.nextInt();

            if (choice == 4)
            {
                receipt.printReceipt(order.getCart());
                running = false;
                continue;
            }

            String[] selectedMenu = null;

            if (choice == 1) selectedMenu = breakfast;
            else if (choice == 2) selectedMenu = lunch;
            else if (choice == 3) selectedMenu = dinner;
            else {
                System.out.println("Invalid choice.");
                continue;
            }

            // show items using array
            for (int i = 0; i < selectedMenu.length; i++)
            {
                System.out.println((i + 1) + ". " + selectedMenu[i]);
            }

            System.out.print("Pick an item number: ");
            int itemNum = input.nextInt();

            if (itemNum >= 1 && itemNum <= selectedMenu.length)
            {
                order.addItem(selectedMenu[itemNum - 1]);
            }
            else
            {
                System.out.println("Invalid item number.");
            }
        }

        System.out.println("Thanks for visiting!");
    }
}