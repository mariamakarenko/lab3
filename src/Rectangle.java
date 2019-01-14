import java.util.Scanner;

public class Rectangle extends figura {
    private figura upper_left_point = new figura();
    private figura lower_right_point = new figura();

    public void Draw (){
        System.out.println("Введите координаты левой верхней точки:");
        Scanner scan = new Scanner(System.in);
        upper_left_point.setX(scan.nextInt());
        upper_left_point.setY(scan.nextInt());
        System.out.println("Введите координаты нижней правой точки:");
        lower_right_point.setX(scan.nextInt());
        lower_right_point.setY(scan.nextInt());
        menu_output();
        System.out.println("с координатами:");
        System.out.println("(" + upper_left_point.getX()+";"+upper_left_point.getY() + ")" + "(" + lower_right_point.getX()+";"+lower_right_point.getY() + ")");

    }
}
