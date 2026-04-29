import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int number;
        int digit;
        int reverse = 0;

        System.out.print("Enter any number  :");
        number  = sc .nextInt();

        int temp = number;

        while(number != 0){
            digit = number % 10;
            number = number / 10;
            System.out.println(digit);
            reverse = reverse * 10 + digit;
        }
        System.out.println("Your number is "+temp);

        System.out.println("Reverse number is "+reverse);

        if(temp == reverse){
            System.out.print("Palindrome numbers ");


        }
        else{
            System.out.print("Number is not a Palindrome numbers");

        }
    }
}