import java.util.Scanner;

/**
 * WeekDays2
 */
public class WeekDays2 {

    public static void main(String[] args) {
        System.out.println("Enter day number: ");
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

        switch (day) {
            case 1: 
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("Number of Weekdays are between 1-7");
        }       

    }
        
}