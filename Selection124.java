import java.util.Scanner;

/**
 * Selection124
 */
public class Selection124 {

    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        System.out.print("Input a number = ");
        int number = input24.nextInt();
    if(number%2 == 0){
        System.out.println(number+" is an even number!");
    }else{
        System.out.println(number+" is an odd number!");
    }
    }
}