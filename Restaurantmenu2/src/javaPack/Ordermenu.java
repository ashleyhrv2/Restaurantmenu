package javaPack;

import java.util.ArrayList;

public class Ordermenu 
{
    ArrayList<String> cart = new ArrayList<String>();
    int count = 0; // never actually used lol

    public Ordermenu()
    {
        // forgot to initialize anything else
    }

    public void addItem(String item)
    {
        cart.add(item);
        System.out.println(item + " added to cart!!"); // double !!
    }

    public ArrayList<String> getCart()
    {
        return cart; // hope this works
    }
}