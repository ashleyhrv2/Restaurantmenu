package javaPack;

import java.util.ArrayList;

public class Reciept 
{
    public void printReceipt(ArrayList<String> cart)
    {
        System.out.println("\n===== RECEIPT =====");

        double total = 0;

        for (int i = 0; i < cart.size(); i++)
        {
            String item = cart.get(i);
            System.out.println((i + 1) + ". " + item);

            int dollar = item.indexOf("$");
            String priceText = item.substring(dollar + 1);
            double price = Double.parseDouble(priceText);

            total += price;
        }

        System.out.println("-------------------");
        System.out.println("Total: $" + total);
        System.out.println("===================\n");
    }
}