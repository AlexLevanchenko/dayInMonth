import java.util.Calendar;
import java.util.Scanner;

public class dayInMonth {
    public static void main(String[] args) {
        System.out.println("Введите год и месяц, я вам скажу скольк дней в месяце было.");
        Calendar myCalendar = (Calendar) Calendar.getInstance().clone();
        int your_year;
        int your_month;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите год: ");
        your_year = input.nextInt();
        System.out.print("Введите месяц: ");
        your_month = input.nextInt();
        myCalendar.set(your_year, your_month, -1);
        int max_date = myCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.print("Количество дней в месяце: " + max_date);

    }
}
