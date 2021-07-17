import java.util.Scanner;

public class DayFinder 
{

    public static void main(String[] args) 
    {
        int next_day, curr_day, sum, result;
        Scanner input = new Scanner(System.in);
  
        System.out.println("\nEnter the current day : \n 1 for Monday, \n 2 for Tuesday, \n 3 for Wednesday, \n 4 for Thusday, \n 5 for Friday, \n 6 for Saturday, \n 7 for Sunday");
        curr_day = input.nextInt();
        System.out.println();

        System.out.println("Enter number of days form today : ");
        next_day = input.nextInt();
        System.out.println();

        sum=curr_day+next_day;

        result=(sum%7);

        switch (result)
        {
            case 1 : 
                    System.out.println("It's Monday...");
            break;
            case 2 : 
                    System.out.println("It's Tuesday...");
            break;
            case 3 : 
                    System.out.println("It's Wednesday...");
            break;
            case 4 : 
                    System.out.println("It's Thusday...");
            break;
            case 5 : 
                    System.out.println("It's Friday...");
            break;
            case 6 : 
                    System.out.println("It's Saturday...");
            break;
            case 7 : 
                    System.out.println("It's Sunday...");
            break;
        }
    }
}