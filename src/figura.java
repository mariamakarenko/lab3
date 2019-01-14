import java.util.Scanner;

public class figura {

    private int x, y;

    public figura(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public figura() {
        this.x = 0;
        this.y = 0;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public  void drawSD(){
        System.out.println("Вывожу фигуру на SD-карту");
    }
    public  void drawPrinter(){
        System.out.println("Вывожу фигуру на принтер");
    }
    public  void drawScreen(){
        System.out.println("Вывожу фигуру на экране");
    }

    public void menu_output(){
        for(;;){
            Scanner scan = new Scanner(System.in);
            System.out.println("Выбирите,где вывести фигуру:\n" +
                    "1)на принтере\n" +
                    "2)на SD-карте\n" +
                    "3)на экране\n");
            int num = scan.nextInt();
            switch (num) {
                case 1:
                    drawPrinter();
                    break;
                case 2:
                    drawSD();
                    break;
                case 3:
                    drawScreen();
                    break;
                default:
                    System.out.println("Нет такой цифры, повторите попытку");
            }
        }
    }
}