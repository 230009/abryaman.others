import java.util.Scanner;
public class case4 {
    // Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 — февраль и т. д.). Определить количество дней в
    // этом месяце для невисокосного года.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String day = null;
        switch(num){
            case 1, 3, 5, 7, 8, 10, 12:
                day = "31 days";
                break;
            case 4, 6, 9, 11:
                day = "30 days";
                break;
            case 2:
                day = "28 or 29";
                break;
            default:
                System.out.println("error");

        }
        System.out.println(day);
    }

}

