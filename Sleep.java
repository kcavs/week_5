import java.util.*;
public class Sleep {
    
    public static void main(String[]args){
        int dayB;
        int monthB;
        int yearB;
        int dayN;
        int yearN;
        int monthN;
        int days_alive;
        int hrs_slept;
        Scanner input= new Scanner(System.in);
        System.out.println("enter your birthdate: ");
        System.out.print("year: ");
        yearB=input.nextInt();
        System.out.print("\nmonth: ");
        monthB=input.nextInt();
        System.out.print("\nday: ");
        dayB=input.nextInt();
        System.out.println("enter todays date: ");
        System.out.print("year: ");
        yearN=input.nextInt();
        System.out.print("\nmonth: ");
        monthN=input.nextInt();
        System.out.print("\nday: ");
        dayN=input.nextInt();
        days_alive=((yearN*365)+(monthN*30)+dayN)-((yearB*365)+(monthB*30)+dayB);
        hrs_slept=((days_alive*24)-(days_alive*8))/2;
        System.out.println("you have been asleep for "+hrs_slept+" hours");
        System.out.println("you have been alive for "+days_alive+" days");




    }
}
