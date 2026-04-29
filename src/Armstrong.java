import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        int number;
        int digit;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        number  = sc .nextInt();

        int temp = number;

        while(number != 0){
            digit = number % 10;
            number = number / 10;
            sum = sum + digit*digit*digit;

        }
        if(temp == sum){
            System.out.print("The number is an Armstrong number");
        }
        else{
            System.out.print("The number is not Armstrong number");


        }
    }

}