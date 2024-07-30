import java.util.Scanner;
public class case3 {
    //Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 — февраль и т. д.). Вывести название
    // соответствующего времени года («зима», «весна», «лето», «осень»).
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String season = null;
        switch(num){
            case 1, 2, 12:
                season = "winter";
                break;
            case 3, 4, 5:
                season = "spring";
                break;
            case 6, 7, 8:
                season = "summer";
                break;
            case 9, 10, 11:
                season = "autumn";
                break;
            default:
                System.out.println("error");

        }
        System.out.println(season);
    }

}
