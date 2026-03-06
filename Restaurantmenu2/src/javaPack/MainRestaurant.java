package javaPack;

import java.util.Scanner;

public class MainRestaurant 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        DisplayMenu dm = new DisplayMenu(); // prints everything at once

        Ordermenu order = new Ordermenu();
        Reciept rec = new Reciept();

        // arrays for menu items
        String[] breakfast = {
            "Pancakes --------- $4.50",
            "Scrambled eggs --- $2.00",
            "Bacon ------------ $2.50",
            "Bagel ------------ $4.50",
            "Waffles ---------- $4.50"
        };

        String[] lunch = {
            "Ham Sandwhich ---- $4.50",
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

        boolean run = true;
        int wrongCounter = 0; // never used

        while (run)
        {
            System.out.println("Pick a menu:");
            System.out.println("1) Breakfast");
            System.out.println("2) Lunch");
            System.out.println("3) Dinner");
            System.out.println("4) Checkout");
            System.out.print("choice: ");

            int choice = input.nextInt();

            String[] selected = null;

            if (choice == 1)
                selected = breakfast;
            else if (choice == 2)
                selected = lunch;
            else if (choice == 3)
                selected = dinner;
            else if (choice == 4)
            {
                rec.printReceipt(order.getCart());
                run = false;
                continue;
            }
            else
            {
                System.out.println("wrong input");
                continue;
            }

            // show items
            for (int i = 0; i < selected.length; i++)
            {
                System.out.println((i+1) + ". " + selected[i]);
            }

            System.out.print("Enter item number: ");
            int itemNum = input.nextInt();

            // BUG: no check for negative numbers
            if (itemNum > 0 && itemNum <= selected.length)
            {
                order.addItem(selected[itemNum - 1]);
            }
            else
            {
                System.out.println("not a valid number");
            }
        }

        System.out.println("bye!");
    }
}