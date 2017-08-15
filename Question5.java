
//1509264 Zhiyong Liu

import java.util.*;

public class Question5 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter the number:");
        int theInputNumber = kb.nextInt();
        
        int a = theInputNumber/100;
        int b = (theInputNumber-a*100)/10;
        int c = theInputNumber-a*100-b*10;
        
        if(a*a*a+b*b*b+c*c*c==theInputNumber)
        {
            System.out.print("The input number is an Armstrong number.\n");
        }
        else
        {
            System.out.print("The input number is not an Armstrong number.\n");
        }
        
        
        
    }
    
}
