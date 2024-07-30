import java.util.Scanner;
public class case3 {
    //Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 — февраль и т. д.). Вывести название
    // соответствующего времени года («зима», «весна», «лето», «осень»).
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String month = null;
        switch(num){
            case 1:
                month = "january";
                break;
            case 2:
                month = "february";
                break;
            case 3:
                month = "march";
                break;
            case 4:
                month = "april";
                break;
            case 5:
                month = "may";
                break;
            case 6:
                month = "june";
                break;
            case 7:
                month = "july";
                break;
            case 8:
                month = "august";
                break;
            case 9:
                month = "september";
                break;
            case 10:
                month = "october";
                break;
            case 11:
                month = "november";
                break;
            case 12:
                month = "december";
                break;
            default:
                System.out.println("error");

        }
        System.out.println(month);

    }

}
