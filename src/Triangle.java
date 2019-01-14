import java.util.Scanner;

public class Triangle extends figura {

    private figura P1 = new figura(),P2 = new figura(),P3=new figura();

    public void Draw (){
        System.out.println("Введите три вершины треугольника");

        Scanner scan = new Scanner(System.in);
        P1.setX(scan.nextInt());
        P1.setY(scan.nextInt());
        P2.setX(scan.nextInt());
        P2.setY(scan.nextInt());
        P3.setX(scan.nextInt());
        P3.setY(scan.nextInt());
        menu_output();
        System.out.println("с координатами:");
        System.out.println("(" + P1.getX()+";"+P1.getY()+") " + "("+ P2.getX()+";"+P2.getY()+") "+ "(" + P3.getX()+";"+P3.getY() + ")");

    }
}