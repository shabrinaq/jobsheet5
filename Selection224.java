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
        String message = total <65 ? "Retake" : "Pass";
        System.out.println("Final Grade = " + total + " and the decission is " + message);
        

    }
}