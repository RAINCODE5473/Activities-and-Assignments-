import java.util.Scanner;

public class CovidChecker {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        
        System.out.println("Do you have a fever? (Yes/No)");
        String fever = scnr.next(); 
        
        System.out.println("Do you have a cough? (Yes/No)");
        String cough = scnr.next(); 
        
        System.out.println("Do you have difficulty in breathing? (Yes/No)");
        String breathing = scnr.next(); 

        
        if (fever.equalsIgnoreCase("Yes") || cough.equalsIgnoreCase("Yes") || breathing.equalsIgnoreCase("Yes")) {
            System.out.println("You may have COVID-19 symptoms. Please consult a doctor!");
        } else {
            System.out.println("You do not exhibit significant COVID-19 symptoms. Stay safe!");
        }

        
        scnr.close();
    }
}
