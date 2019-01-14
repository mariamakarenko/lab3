import java.util.Scanner;

public class Circle extends figura {

    private int radius;
    private figura center = new figura();

    public void Draw() {
        System.out.println("Введите координаты центра:");

        Scanner scan = new Scanner(System.in);
        center.setX(scan.nextInt());
        center.setY(scan.nextInt());
        System.out.println("\nВведите радиус круга:");
        radius = scan.nextInt();
        menu_output();
        System.out.println("с центром в точке:" + "(" +center.getX() + ";" + center.getY() + ")");
        System.out.println("и радиусом " + " R=" + radius);

    }
}