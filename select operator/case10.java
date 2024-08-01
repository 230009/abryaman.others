import java.util.Scanner;
public class case10 {
    //Робот может перемещаться в четырех направлениях («С» — север, «З» — запад, «Ю» — юг, «В» — восток) и принимать три
    // цифровые команды: 0 — продолжать движение, 1 — поворот налево, −1 — поворот направо. Дан символ C — исходное
    // направление робота и целое число N — посланная ему команда. Вывести направление робота после выполнения
    // полученной команды.
    //north - sever, south - yug, west - zapad, east - vostok
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the direction");
        char direction = scan.next().charAt(0);
        System.out.println("Enter the command");
        int command = scan.nextInt();
        char newdir = get(direction, command);
        System.out.println(newdir);

    }

    public static char get(char direction, int command) {
        switch (direction) {
            case 'N': //north
                switch (command) {
                    case 0:
                        return 'N';
                    case 1:
                        return 'W';
                    case -1:
                        return 'E';
                }
            case 'S': //south
                switch(command){
                    case 0:
                        return 'N';
                    case 1:
                        return 'W';
                    case -1:
                        return 'E';
                }
            case 'W': //west
                switch (command){
                    case 0:
                        return 'N';
                    case 1:
                        return 'W';
                    case -1:
                        return 'E';
                }
            case 'E':
                switch(command){
                    case 0:
                        return 'N';
                    case 1:
                        return 'W';
                    case -1:
                        return 'E';
                }
            default:
                System.out.println("error");

        }
        return direction;
    }
}
