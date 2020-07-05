
import java.util.Scanner;

public class HomeWork32 {
//    Написать программу, вычисляющую корни квадратного уравнения
//    вида ax ² + bx + c = 0, где a, b и c - вводимые пользователем из консоли данные.
//    Учитывать только реальные корни (в случае отрицательного дискриминанта выводить сообщение пользователю).
//     При решении создать и использовать следующие вынесенные  функции:
//   - функция isPositive, определяющая, является ли число положительным
//    - функция isZero, определяющая, является ли число нулём
//    - функция discriminant, вычисляющая дискриминант
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Введите a для уравнения ax²+bx+c=0:");
        double nexta = a.nextInt();

        Scanner b = new Scanner(System.in);
        System.out.println("Введите b для уравнения ax²+bx+c=0:");
        double nextb = b.nextInt();

        Scanner c = new Scanner(System.in);
        System.out.println("Введите c для уравнения ax²+bx+c=0:");
        double nextc = c.nextInt();

        double discriminant = nextb*nextb-(4*nexta*nextc);

        boolean isZero = discriminant == 0;
        if (isZero) {
            double x = (- nextb / 2 * nexta);
            System.out.println("х=" + x +  " - корень уравнения " + nexta + "*x²" + nextb + "*x" + "+" + nextc + "=0");
        }
        else   {
            boolean isPositive = discriminant > 0;
            if (isPositive) {
                double x1 = ((- nextb + Math.sqrt(discriminant)) / 2 * nexta);
                double x2 = ((- nextb - Math.sqrt(discriminant)) / 2 * nexta);
                System.out.println("х1="+ x1 + ", х2="+ x2 + " - корни уравнения " + nexta + "*x²" + nextb + "*x" + "+" + nextc + "=0");
            }
            else   {
                System.out.println("Дискриминант = " + discriminant + " меньше 0, уравнение " + nexta + "*x²" + nextb + "*x" + "+" + nextc + "=0 не имеет корней.");
            }
        }
    }
}
