
//1509264 Zhiyong Liu

import java.util.*;

public class Question4 {

    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter the year:");
        int year = kb.nextInt();
        
        if(year%100==0)
        {
            if(year%400==0)
            {
                System.out.print("It is a leap year.\n");
            }
            else
            {
                System.out.print("It is not a leap year.\n");
            }
        }
        else
        {
            if(year%4==0)
            {
                System.out.print("It is a leap year.\n");
            }
            else
            {
                System.out.print("It is not a leap year.\n");
            }
        }
    }
    
}
