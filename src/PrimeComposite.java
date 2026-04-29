import java.util.*;
public class PrimeComposite{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any natural number :");
        int number = sc.nextInt();
        int i = 0;
        if ( number <= 1 ){
            System.out.println("Your number is invalid :");
            System.out.println("1 Number is neither prime nor composite");
        }
        else{
            for ( i = 2 ; i < number ; i++){
                if( number % i == 0 ){
                    System.out.println("Your number is composite number");
                    break;
                }
            }
        }
        if ( i == number ){
            System.out.println("Your number is a prime number ");
        }
    }
}
