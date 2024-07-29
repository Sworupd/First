import java.util.Scanner;
public class Hotcold {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = imp.nextInt();

        int n = 55;
        if(num1 == n){
            System.out.println("You have guessed the correct number. Congratulations!");
        }
        else if(num1 > n-2 && num1 < n+2){
            System.out.println("Extreme Hot!");
        }
        else if(num1 > n-5 && num1 < n+5){
            System.out.println("Hot!");
        }
        else if(num1 > n-15 && num1 < n+15){
            System.out.println("Cold!");
        }
        else if(num1 > n-30 && num1 < n+30){
            System.out.println("Extreme Cold!");
        }
    }
}
