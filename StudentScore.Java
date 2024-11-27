import java.util.Scanner;
   public class StudentScores {
    public static void main(String[] args) {
        String[] students = {"Ixia", "Alice", "Mia", "Alu", "Zina"};
        int[] scores = {85, 92, 76, 88, 9};
        
        displayScores(students, scores);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the name of the student to update the score: ");
        String studentName = scanner.nextLine();
        
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(studentName)) {
                
                index = i;
                
                break;
       
    }
} 
if (index != -1) {
            System.out.print("Enter the new score for " + studentName + ": ");
            scores[index] = scanner.nextInt();
            
            System.out.println("Updated Student List:");
            displayScores(students, scores);
        } else {
            System.out.println("Student not found.");
        }
        
        scanner.close();
    }
    
    public static void displayScores(String[] students, int[] scores) {
        System.out.println("Student List:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + "-" + scores[i]);
        }
    }
}
            
             
        
    
        
