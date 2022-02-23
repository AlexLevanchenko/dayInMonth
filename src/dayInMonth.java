import java.util.Calendar;
import java.util.Scanner;

public class dayInMonth {
    public static void main(String[] args) {
        System.out.println("Введите год и месяц, я вам скажу скольк дней в месяце было.");
        Calendar myCalendar = (Calendar) Calendar.getInstance().clone();
        int year, month;
        String monthName = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Ввод года: ");
        year = input.nextInt();
        System.out.print("Введите номер месяца: ");
        month = input.nextInt();
        myCalendar.set(year, month, -1);
        switch (month) {
            case 1 -> monthName = ("Январе");
            case 2 -> monthName = ("Феврале");
            case 3 -> monthName = ("Марте");
            case 4 -> monthName = ("Апреле");
            case 5 -> monthName = ("Мае");
            case 6 -> monthName = ("Июне");
            case 7 -> monthName = ("Июле");
            case 8 -> monthName = ("Августе");
            case 9 -> monthName = ("Сентябре");
            case 10 -> monthName = ("Октябре");
            case 11 -> monthName = ("Ноябре");
            case 12 -> monthName = ("Декабре");
        }
        if (year <= 0 || month <= 0) {
            System.out.println("К сожалению, не смогу вам посчитать, год или месяц не может быть <= 0");
        } else {
            int max_date = myCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            System.out.print("В " + monthName + " " + year + " года " + max_date + " дней");

        }
    }
}

