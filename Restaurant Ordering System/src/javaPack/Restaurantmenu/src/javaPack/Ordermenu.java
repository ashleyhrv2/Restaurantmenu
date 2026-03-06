package javaPack;

import java.util.ArrayList;

public class Ordermenu 
{
    ArrayList<String> cart;

    public Ordermenu() 
    {
        cart = new ArrayList<String>();
    }

    public void addItem(String item)
    {
        cart.add(item);
        System.out.println(item + " added to cart.");
    }

    public ArrayList<String> getCart()
    {
        return cart;
    }
}