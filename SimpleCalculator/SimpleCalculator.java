package SimpleCalculator;

import java.util.Scanner;

public class SimpleCalculator 
{
    public static void ArithmeticCalculator() throws ArithmeticExceptionClass
    {
        int choice;
        float num1, num2, result;
        Scanner Sc = new Scanner(System.in);
        System.out.println("\n\nMenu : \n1. Addition\n2. Substraction\n3. Division\n4. Multiplication\n5. Modulo\n");
        System.out.print("Enter your choice : ");
        choice = Sc.nextInt();
                switch (choice) 
                {
                    case 1:
                        System.out.print("Enter two numbers num1 and num2 : ");
                        num1 = Sc.nextFloat();
                        num2 = Sc.nextFloat();
                        result = num1 + num2;
                        System.out.print("The addition of " + num1 + " and " + num2 + " is : " + result);
                        break;

                    case 2:
                        System.out.print("Enter two numbers num1 and num2 : ");
                        num1 = Sc.nextFloat();
                        num2 = Sc.nextFloat();
                        result = num1 - num2;
                        System.out.print("The substraction of " + num1 + " and " + num2 + " is : " + result);
                        break;

                    case 3:
                            System.out.print("Enter two numbers num1 and num2 : ");
                            num1 = Sc.nextFloat();
                            num2 = Sc.nextFloat();
                            if (num2 == 0) 
                            {
                            try 
                            {
                                throw new ArithmeticExceptionClass();
                            } catch (ArithmeticExceptionClass e) 
                            {
                                System.out.println("Divisor must be non zero number");
                            }
                            }
                            else
                            {
                                result = num1 / num2;
                                System.out.print("The division of " + num1 + " and " + num2 + " is : " + result);
                            }
                            break;
        
                    case 4:
                        System.out.print("Enter two numbers num1 and num2 : ");
                        num1 = Sc.nextFloat();
                        num2 = Sc.nextFloat();
                        result = num1 * num2;
                        System.out.print("The multiplication of " + num1 + " and " + num2 + " is : " + result);
                        break;

                    case 5:
                        System.out.print("Enter two numbers num1 and num2 : ");
                        num1 = Sc.nextFloat();
                        num2 = Sc.nextFloat();
                        result = num1 % num2;
                        System.out.print("The modulo of " + num1 + " and " + num2 + " is : " + result);
                        break;

                    default:
                        System.out.print("Wrong Choice...\n");
                        break;
                }
    }


    public static void ScientificCalculator() throws ArithmeticExceptionClass
    {
        int choice;
        float num1, num2, result;
        Scanner Sc = new Scanner(System.in);
        System.out.println("\n\nMenu : \n1. Ciel\n2. Floor\n3. Square Root\n4. Exponential\n");
        System.out.print("Enter your choice : ");
        choice = Sc.nextInt();
        switch (choice) 
                    {
                        case 1:
                            System.out.print("Enter numbers num1 : ");
                            num1 = Sc.nextFloat();
                            if (num1 <= 0) 
                            {
                                try 
                                {
                                    throw new ArithmeticExceptionClass();
                                } catch (ArithmeticExceptionClass e) 
                                {
                                    System.out.println("Must be a non-negative integer and non zero number");
                                }
                            }
                            else
                            {
                                result= (float) Math.ceil(num1);
                                System.out.print("The Ceiling  of "+num1 +" is : "+result);
                            }
                            break;

                                    
                        case 2:
                                System.out.print("Enter numbers num1 : ");
                                num1=Sc.nextFloat();
                            if (num1 <= 0) 
                            {
                                try 
                                {
                                    throw new ArithmeticExceptionClass();
                                } catch (ArithmeticExceptionClass e) 
                                {
                                    System.out.println("Must be a non-negative integer and non zero number");
                                }
                            }
                            else
                            {
                                result= (float) Math.floor(num1);
                                System.out.print("The Floor of "+num1 +" is : "+result);
                            }
                            break;
                                                                        
                        case 3:
                            System.out.print("Enter numbers num1 : ");
                            num1=Sc.nextFloat();
                            if (num1 <= 0) 
                            {
                                try 
                                {
                                    throw new ArithmeticExceptionClass();
                                } catch (ArithmeticExceptionClass e) 
                                {
                                    System.out.println("Must be a non-negative integer and non zero number");
                                }
                            }
                            else
                            {
                                result=(float) Math.sqrt(num1);
                                System.out.print("The square root of "+num1 +" is : "+result);
                            }
                            break;
                                                    
                        case 4:
                            System.out.print("Enter two numbers num1 and num2 : ");
                            num1=Sc.nextFloat();
                            num2=Sc.nextFloat();
                            if (num1 <= 0 || num2 <= 0) 
                            {
                                try 
                                {
                                    throw new ArithmeticExceptionClass();
                                } catch (ArithmeticExceptionClass e) 
                                {
                                    System.out.println("Must be a non-negative integer and non zero number");
                                }
                            }
                            else
                            {
                                result=(float) Math.pow(num1, num2);
                                System.out.print("The exponential of "+num1 +" and " +num2 +" is : "+result);
                            }
                            break;	
    
                        default : 
                        System.out.print("Wrong Choice...\n");
                        break;
                    }
    }

    public static void main(String args[]) throws ArithmeticExceptionClass
    {
        int choice;
        char ch = 'n';
        Scanner Sc = new Scanner(System.in); 
        do 
        {
            System.out.println("\n\nMenu : \n1. Arithmetic Calculator\n2. Scientific Calculator\n3. Exit\n");
            System.out.print("Enter your choice : ");
            choice = Sc.nextInt();
            switch(choice)
            {    
                case 1:
                    {
                        ArithmeticCalculator();
                        break;
                    }
                case 2:
                    {
                        ScientificCalculator();
                        break;                   
                    }
            
                case 3:
                    {
                        break;
                    }
                default :
                    {
                        System.out.println("Wrong Choice !!!");
                    }
            }
            System.out.println("\nDo you want to continue (Y/N)");
            ch = Sc.next().charAt(0);
        }while(ch=='y' || ch=='Y');
}
}