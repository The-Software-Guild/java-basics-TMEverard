import java.util.Scanner;
public class HealthyHearts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean condition = true;
        int age;
        System.out.println("Please enter your age: ");
        try {
            age = sc.nextInt();
            int MaxHR = 220 - age;
            System.out.println("Your maximum heart rate should be " + MaxHR + " beats per minute");
            int lowerHR = (int) Math.floor(0.50 * MaxHR);
            int upperHR = (int) Math.ceil(0.85 * MaxHR);
            System.out.println("Your target heart rate zone is " + lowerHR + "-" + upperHR + " beats per minute.");
        } catch(Exception e) {
            System.out.println("Not an integer age.");
        }
    }
}