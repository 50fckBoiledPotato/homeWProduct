package com.pepper.homewproduct;
public class HomeWProduct
{
    public static void main(String[] args) 
    {
        Product one = new Product("Kenyér", 790);
        Product two = new Product("sajt", 4180);
        Product three = new Product("vaj", 1190);
        
        ShopCart newList = new ShopCart();
        newList.add(one);
        newList.add(two);
        newList.add(three);
        
        newList.printItems();
        int total = newList.calcTotal();       
        System.out.println("A kosár végösszege: " + total);
    }
}
