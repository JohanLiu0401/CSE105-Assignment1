
//1509264 Zhiyong Liu

import java.util.*;

public class Question1 {

    
    public static void main(String[] args) {
        
        Scanner m = new Scanner(System.in);
        System.out.print("Please enter n:\n");
        
        int inPutNumber = m.nextInt();
        
        int factorial = 1;
        
        if(inPutNumber == 0)
        {
            System.out.print("The factorial of n is 1.\n");
        }
        else
        {
            
            for(int i=1;i<=inPutNumber;i++)
            {
                factorial = factorial*i;
            }
        
            System.out.println("the factorial of "+inPutNumber+" is:"+factorial);
        }
    }
    
}
