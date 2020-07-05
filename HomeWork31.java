import java.util.Scanner;

public class HomeWork31 {

       public static void main(String[] args) {

           Scanner day = new Scanner(System.in);
           System.out.println("Введите день:");
           int nextDay = day.nextInt();

           Scanner month = new Scanner(System.in);
           System.out.println("Введите месяц:");
           int nextMonth = month.nextInt();

           Scanner year = new Scanner(System.in);
           System.out.println("Введите год:");
           int nextYear = year.nextInt();

           if (nextDay > 31 | nextMonth > 12 | nextYear <=0) {
            System.out.println("введена некорректная дата");
           }
           else if (nextDay == 31 && (nextMonth == 2 || nextMonth == 4 || nextMonth == 6 || nextMonth == 9 || nextMonth == 11)) {
               System.out.println("введена некорректная дата");
           }
           else if (nextDay == 30 && nextMonth == 2) {
               System.out.println("введена некорректная дата");
           }
           else if (nextDay == 29 && nextMonth == 2 && nextYear % 4 != 0) {
               System.out.println("введена некорректная дата");
           }
           else if (nextDay == 28 && nextMonth == 2 && nextYear % 4 == 0) {
               System.out.println("Вывожу дату следующего дня: " + ++nextDay + "." + nextMonth + "." + nextYear);
           }
           else if (nextDay == 28 && nextMonth == 2) {
               System.out.println("Вывожу дату следующего дня: " + 1 + "." + ++nextMonth + "." + nextYear);
           }
           else if (nextDay == 31 && (nextMonth == 1 || nextMonth == 3 || nextMonth == 5 || nextMonth == 7 || nextMonth == 8 || nextMonth == 10)) {
               System.out.println("Вывожу дату следующего дня: " + 1 + "." + ++nextMonth + "." + nextYear);
           }
           else if (nextDay == 31 && nextMonth == 12) {
               System.out.println("Вывожу дату следующего дня: " + 1 + "." + 1 + "." + ++nextYear);
           }
           else if (nextDay == 29 && nextMonth == 2) {
               System.out.println("Вывожу дату следующего дня: " + 1 + "." + 3 + "." + nextYear);
           }
           else  {
               System.out.println("Вывожу дату следующего дня: " + ++nextDay + "." + nextMonth + "." + nextYear);
           }
    }
}
