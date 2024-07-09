import java.util.Scanner;
public class Election {
    public static void main(String[] args) {
        int age;
        String citizen;
        Scanner elect = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = elect.nextInt();
        System.out.println("Are you a citizen of Nepal?");
        citizen = elect.next();
        if (age >= 18 && citizen.equals("Yes")) {
            System.out.println("You are able to vote in Nepal");
        }
        else{
            System.out.println("You are not able to vote in Nepal");
        }
    elect.close();
    }
}
