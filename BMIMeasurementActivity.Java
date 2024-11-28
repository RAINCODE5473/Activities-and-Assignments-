import java.util.Scanner;
public class Bmimeasurement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("BMI Measurement");

        System.out.println("Enter your weight in kg: ");

        double weight = sc.nextDouble();
        System.out.println("Enter your height in meters: ");

        double height = sc.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18.5){
            System.out.println("You are underweight.");
        } else if (bmi > 18.5 && bmi <25.0){
            System.out.println("You are normal weight");
        } else if (bmi > 25.0 && bmi <30.0){
            System.out.println("You are underweight");
        } else {
            System.out.println("You are obese");
        }

    }
    
}
