import java.util.Scanner;

public class CalendarPrinter {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
  
        System.out.print("Enter a year: ");
        int Y = input.nextInt();
        System.out.println();
        System.out.print("Enter the  month of which, calendar you want: ");
        int n = input.nextInt();
        System.out.println();
        System.out.println("Enter the weekday from which the month starts : \n 1 for Monday, \n 2 for Tuesday, \n 3 for Wednesday, \n 4 for Thusday, \n 5 for Friday, \n 6 for Saturday, \n 7 for Sunday : ");
        int StartDayOfMonth = input.nextInt();
        System.out.println();
        
        int spaces = StartDayOfMonth;

        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

            int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

                int M=n;
                
            // leap year check
            if  ((((Y % 4 == 0) && (Y % 100 != 0)) ||  (Y % 400 == 0)) && M == 2)
                days[M] = 29;

            System.out.println("          "+ months[n] + " " + Y);

            System.out.println("_____________________________________");
            System.out.println("   Sun  Mon  Tue  Wed  Thu  Fri  Sat");

            spaces = (spaces)%7;
            
            // printing a calendar
            for (int i = 0; i < spaces; i++)
                System.out.print("     ");
            for (int i = 1; i <= days[M]; i++) 
            {
                System.out.printf(" %3d ", i);
                if (((i + spaces) % 7 == 0) || (i == days[M])) System.out.println();
            }
            
            System.out.println();
    }
}