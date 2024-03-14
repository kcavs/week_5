/**
name: Kiersten Cavalli
date: 3/13/24
program: Building.java
 */
import java.util.*;
import java.text.NumberFormat;
public class Building{
    public static void main(String[]args){
        int num_poles;
        double diameter= 3.0/2;
        double height= 5.0;
        double concrete;
        double cost;
        NumberFormat money= NumberFormat.getCurrencyInstance();
        Scanner input= new Scanner(System.in);
        System.out.print("How many poles are needed: ");
        num_poles= input.nextInt();
        double volume= (num_poles*((3.14*(diameter*diameter))*height));
        concrete= volume/27;
        cost= concrete*12.98;
        System.out.println("\n"+concrete+" cubic feet of concrete are needed");
        System.out.print((money.format(cost))+" is needed to purchase the concrete");

    }
}