package CurrencyConverter;
import java.util.Scanner;

public class CurrencyConverter
{
        public static void main(String[] args)
    {
        final double USD=74.3, GBP=94.5, JPY=0.67, EUR=85.37, AED=20.25;
        float amount;
        double amount1;
        String srcCurrency, desCurrency;
        double to_usd, to_gbp, to_jpy, to_eur, to_aed;
        System.out.println("Denominations (INR) \t USD \t GBP \t JPY \t EUR \t AED");
        {
            {
                to_usd= 1*USD;
                to_gbp= 1*GBP;
                to_jpy= 1*JPY;
                to_eur= 1*EUR;
                to_aed= 1*AED;
                System.out.println("\t1" +"\t\t" +to_usd +"\t" +to_gbp +"\t" +to_jpy +"\t" +to_eur +"\t" +to_aed);
            }
            {
                to_usd= 10*USD;
                to_gbp= 10*GBP;
                to_jpy= 10*JPY;
                to_eur= 10*EUR;
                to_aed= 10*AED;
                System.out.println("\t10" +"\t\t" +to_usd +"\t" +to_gbp +"\t" +to_jpy +"\t" +to_eur +"\t" +to_aed);
            }
            {
                to_usd= 20*USD;
                to_gbp= 20*GBP;
                to_jpy= 20*JPY;
                to_eur= 20*EUR;
                to_aed= 20*AED;
                System.out.println("\t20" +"\t\t" +to_usd +"\t" +to_gbp +"\t" +to_jpy +"\t" +to_eur +"\t" +to_aed);
            }
            {
                to_usd= 50*USD;
                to_gbp= 50*GBP;
                to_jpy= 50*JPY;
                to_eur= 50*EUR;
                to_aed= 50*AED;
                System.out.println("\t50" +"\t\t" +to_usd +"\t" +to_gbp +"\t" +to_jpy +"\t" +to_eur +"\t" +to_aed);
            }
            {
                to_usd= 100*USD;
                to_gbp= 100*GBP;
                to_jpy= 100*JPY;
                to_eur= 100*EUR;
                to_aed= 100*AED;
                System.out.println("\t100" +"\t\t" +to_usd +"\t" +to_gbp +"\t" +to_jpy +"\t" +to_eur +"\t" +to_aed);
            }
        }
            System.out.println();

            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter the source currency:");
            srcCurrency = sc.next();
            System.out.println("Enter the destination currency: ");
            desCurrency = sc.next();
            System.out.println("Enter the amount :");
            amount = sc.nextFloat();
            switch(srcCurrency) 
            {
                case "USD": 
                {
                    amount1 = (amount*USD);
                break;
                }
                case "GBP": 
                {
                    amount1 = (amount * GBP);
                break;
                }
                case "JPY": 
                {
                    amount1 = (amount * JPY);
                break;
                }
                case "EUR": 
                {
                    amount1 = (amount * EUR);
                break;
                }
                case "AED": 
                {
                    amount1 = (amount * AED);
                break;
                }
                case "INR": 
                {
                    amount1 = amount*1;
                break;
                }
                default: 
                {
                    System.out.printf("Invalid input entered");
                    amount1=0;
                break;
                }
            }
        
            switch(desCurrency) 
            {
                case "USD": 
                {
                    System.out.printf("The Exchange rate for  %.2f %s is : %f  %s \n",amount,srcCurrency,(amount1/USD),desCurrency);
                break;
                }
                case "GBP": 
                {
                    System.out.printf("The Exchange rate for  %.2f %s is : %.2f %s \n",amount,srcCurrency,(amount1/GBP),desCurrency);
                break;
                }
                case "JPY": 
                {
                    System.out.printf("The Exchange rate for  %.2f %s is : %.2f %s \n",amount,srcCurrency,(amount1/JPY),desCurrency);
                break;
                }
                case "EUR": 
                {
                    System.out.printf("The Exchange rate for  %.2f  %s is : %.2f %s \n",amount,srcCurrency,(amount1/EUR),desCurrency);
                break;
                }
                case "AED": 
                {
                    System.out.printf("The Exchange rate for  %.2f %s is : %.2f %s \n",amount,srcCurrency,(amount1/AED),desCurrency);
                break;
                }
                case "INR": 
                {
                    System.out.printf("The Exchange rate for  %.2f %s  is : %.2f %s  \n",amount,srcCurrency,(amount1/1),desCurrency);
                break;
                }
            }        
    }
}