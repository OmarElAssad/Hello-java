import java.util.Scanner;

public class WeekDays1 {
   public static void main(String[] args) {
       System.out.println("Enter day number: ");
       Scanner in = new Scanner(System.in);
       int day = in.nextInt();

       if (day == 1) {
           System.out.println("It's Monday");
       } else if (day == 2) {
           System.out.println("It's Tuesday");
       } else if (day == 3) {
           System.out.println("It's Wednesday");
       } else if (day == 4) {
           System.out.println("It's Thursday");
       } else if (day == 5) {
           System.out.println("It's Friday");
       } else if (day == 6) {
           System.out.println("It's Saturday");
       } else if (day == 7) {
           System.out.println("It's Sunday");
       } else {
           System.out.println("Day numbers are from 1-7");
       }
   }
}
