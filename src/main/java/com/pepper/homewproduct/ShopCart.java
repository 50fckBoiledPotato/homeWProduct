package com.pepper.homewproduct;


import java.util.ArrayList;


public class ShopCart
{
    ArrayList<Product> list;
    
    
    public ShopCart()
    {
        list = new ArrayList<>();
    }
    
    public void add(Product item)
    {
        list.add(item);
    }
    
    public void printItems()
    {
        System.out.println("A kosár tartalma: ");
        for(Product item : list)
        {
            System.out.println(item.title + " (" + item.price + " HUF)" );
        }
    }
    
    public int calcTotal()
    {
        int total = 0;
        for(Product item : list)
        {
            total += item.price;
        }
        return total;
    }
    
    
    
}
