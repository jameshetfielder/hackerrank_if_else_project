import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        num = input.nextInt();
        if (num >= 1 && num <= 100) {
            if (num % 2 == 1) {
                System.out.print("Weird");
            }
            if (num % 2 == 0) {
                if(num > 2 && num < 5){
                    System.out.print("Not Weird");
                } else if (num > 6 && num < 20) {
                    System.out.print("Weird");
                }
                else if (num > 20){
                    System.out.print("Not Weird");
                }
                else
                    System.out.print("Weird");

            }

        }
    }
}


