/**
name: Kiersten Cavalli
date: 3/13/24
program: Geometry.java
 */
import java.util.*;
import java.text.NumberFormat;
public class Geometry {
    public static void main(String[]args){
        int n;
        int m; 
        NumberFormat money= NumberFormat.getCurrencyInstance();
        Scanner input= new Scanner(System.in);
        System.out.print("what is the value of n: ");
        n= input.nextInt();
        System.out.print("what is the value of m so that m>n: ");
        m= input.nextInt();
        int side1= (m*m)-(n*n);
        int side2= (2*m)*n;
        int hyp= (m*m)+(n*n);
        double cost= (2.412*(double)side1)+(3.767*(double)side2)+(15.758*(double)hyp);
        System.out.print("\nside 1= "+side1+" side 2= "+side2+" hypotenuse= "+hyp);
        System.out.print("\nthe cost of your triangle is "+(money.format(cost)));
    }
    
}
