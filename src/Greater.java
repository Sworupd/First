import java.util.Scanner;
public class Greater {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = sc.nextInt();
        System.out.print("Enter Third Number: ");
        num3 = sc.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println("Greater Number is " +num1);
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println("Greater Number is " +num2);
        }
        else{
            System.out.println("Greater Number is " +num3);
        }
    sc.close();
    }
}
