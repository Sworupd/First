import java.util.Scanner;
public class Election {
    public static void main(String[] args) {
        int age;
        Scanner elect = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = elect.nextInt();
        if (age >= 18) {
            System.out.println("You are able to vote in Nepal");
        }
        else{
            System.out.println("You are not able to vote in Nepal");
        }
    elect.close();
    }
}
