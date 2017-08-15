
//1509264 Zhiyong Liu

public class Question2 {
    
    public static void main(String[] args) {
        
        Celsius number1= new Celsius();
        Celsius number2= new Celsius();
        Celsius number3= new Celsius();
        Celsius number4= new Celsius();
        Celsius number5= new Celsius();
        
        System.out.print("Celsius      Fahrenheit\n");
        System.out.print("100"+"              "+number1.transform(100)+"\n");
        System.out.print("87"+"               "+number1.transform(87)+"\n");
        System.out.print("47"+"               "+number1.transform(47)+"\n");
        System.out.print("12"+"               "+number1.transform(12)+"\n");
        System.out.print("-5"+"               "+number1.transform(-5)+"\n");

        
    }
    
}

class Celsius
{
    
     int transform(int Celsius)
    {
        int fahrenheit= (int)Math.rint(Celsius * 9 / 5 + 32);
        return fahrenheit;
    }
}
