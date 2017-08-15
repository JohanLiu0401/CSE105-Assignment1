
//1509264 Zhiyong Liu

import java.util.*;
public class Question3 {

   
    public static void main(String[] args) 
    {
        Scanner a= new Scanner(System.in);
        System.out.print("Please enter the fist edge:");
        int firstEdge = a.nextInt();
        
        Scanner b= new Scanner(System.in);
        System.out.print("Please enter the second edge:");
        int secondEdge = b.nextInt();
        
        Scanner c= new Scanner(System.in);
        System.out.print("Please enter the third edge:");
        int thirdEdge = c.nextInt();
        
        
        if((firstEdge>0 && secondEdge >0 && thirdEdge>0)&&(firstEdge+secondEdge>thirdEdge || firstEdge+thirdEdge>firstEdge || secondEdge+thirdEdge>firstEdge))
        {
             if((firstEdge == secondEdge) && (firstEdge == thirdEdge))
             {
                 System.out.print("It is a equilateral triangle.\n");
             }
             else if((firstEdge == secondEdge) || (firstEdge == thirdEdge))
             {
                 System.out.print("It is a isosceles triangle.\n");
             }
             else
             {
                 System.out.print("It is a scalene triangle.\n");
             }
        }
        else
        {
            System.out.print("The inputs do not represent a triangle.\n");
        }
    }
    
}
