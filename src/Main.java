//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num1;
        Scanner input = new Scanner(System.in);
            System.out.println("Enter the number");
            num1 = input.nextInt();
            if(num1%2==0) {
                System.out.println("The number is even");
            }
            else{
                System.out.println("The number is odd");
            }

        float principle, time, si;
         int rate;
        Scanner interest = new Scanner(System.in);
        System.out.println("Enter the principle");
        principle = interest.nextFloat();
        System.out.println("Enter the time");
        time = interest.nextFloat();
        System.out.println("Enter the rate");
        rate = interest.nextInt();
        si = (principle*time*rate)/100;
        System.out.println("The simple interest is " + si);

    }
}