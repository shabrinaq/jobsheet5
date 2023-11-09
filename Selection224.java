import java.util.Scanner;

/**
 * Selection224
 */
public class Selection224 {

    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        System.out.print("Nilai uas    : ");
        float finalExam = input24.nextFloat();
        System.out.print("Nilai uts    : ");
        float midExam = input24.nextFloat();
        System.out.print("Nilai kuis   : ");
        float quiz = input24.nextFloat();
        System.out.print("Nilai tugas  : ");
        float assigment = input24.nextFloat();

        float total = (finalExam * 0.4F) + (midExam * 0.3F) + (quiz * 0.1F) + (assigment * 0.2F);
        
        if (total > 80 && total <= 100) {
            System.out.println("Final score " + total + "equivalent to A / a with Excellent qualification");
        } else if (total > 73 && total <= 80) {
            System.out.println("Final score " + total + "equivalent to B+ / 3,5 with Excellent qualification");
        } else if (total > 65 && total <= 73) {
            System.out.println("Final score " + total + "equivalent to B / 3 with Excellent qualification");   
        } else if (total > 60 && total <= 65) {
            System.out.println("Final score " + total + "equivalent to C+ / 2,5 with Excellent qualification");
        } else if (total > 50 && total <= 60){
            System.out.println("Final score " + total + "equivalent to C / 2 with Excellent qualification");
        } else if (total > 39 && total <= 50){
            System.out.println("Final score " + total + "equivalent to D / 1 with Excellent qualification");
        } else if (total <= 39){
            System.out.println("Final score " + total + "equivalent to E / 0 with Excellent qualification");
        } else
            System.out.println("Invalid!!!");
    }         
}