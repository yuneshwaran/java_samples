import java.time.LocalDate;
import java.util.Scanner;

public class dateTime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Date: ");
        int day = sc.nextInt();
        System.out.print("Enter Month: ");
        int month = sc.nextInt();
        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        String result = currentDay(day, month, year);
        System.out.print("Day of the week: " + result);
        sc.close();
    }

    public static String currentDay(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }
}
