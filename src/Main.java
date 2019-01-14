import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Лабораторная работа №3");
        System.out.println("Условие задачи: Спроектировать архитектуру  приложения," +
                " в котором пользователю будет предоставляться возможность выбрать фигуру из предложенных и выбрать куда вывести фигуры," +
                " ввод необходимых параметров для фигуры.");

        Scanner scan = new Scanner(System.in);

        for(;;) {
            System.out.println("\nВыбирите фигуру:\n" +
                    "1)треугольник\n" +
                    "2) круг\n" +
                    "3)прямоугольник\n");

            int a = scan.nextInt();

            switch (a) {
                case 1:
                    Triangle triangle = new Triangle();
                    triangle.Draw();
                    break;

                case 2:
                    Circle circle = new Circle();
                    circle.Draw();
                    break;

                case 3:
                    Rectangle rectangle = new Rectangle();
                    rectangle.Draw();
                    break;

                default:
                    System.out.println("Нет такой цифры, повторите попытку");
            }
        }
    }
}