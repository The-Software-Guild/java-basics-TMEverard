import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void main (String[] args) {
        System.out.println("What is your dog's name? ");
        Scanner sc = new Scanner(System.in);
        String dogName = sc.nextLine();

        System.out.println("I have the DNA report on " + dogName + " right here ");

        Random genes = new Random();
        double num1 = genes.nextFloat();
        double num2 = genes.nextFloat();
        double num3 = genes.nextFloat();
        double num4 = genes.nextFloat();
        double num5 = genes.nextFloat();
        double sum = num1+num2+num3+num4+num5;
        double[] percs = {0,0,0,0,0};
        percs[0] = Math.round(100 * num1 / sum);
        percs[1] = Math.round(100 * num2 / sum);
        percs[2] = Math.round(100 * num3 / sum);
        percs[3] = Math.round(100 * num4 / sum);
        percs[4] = Math.round(100 * num5 / sum);

        String[] breed = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug",
                    "Common Cur", "King Doberman"};

        for(int j=0; j < breed.length; j++)
            System.out.println(dogName + " is " + percs[j] + "% " + breed[j]);
        }
    }
