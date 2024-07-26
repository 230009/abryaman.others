import java.util.Scanner;

//Дано целое число в диапазоне 1–7. Вывести строку — название дня недели, соответствующее данному числу
// (1 — «понедельник», 2 — «вторник» и т. д.).
public class case1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number from 0 to 7");
        int num = scan.nextInt();
        String day;
        switch(num){
            case 1:
                day = "monday";
                break;
            case 2:
                day = "tuesday";
                break;
            case 3:
                day = "wednesday";
                break;
            case 4:
                day = "thursday";
                break;
            case 5:
                day = "friday";
                break;
            case 6:
                day = "saturday";
                break;
            case 7:
                day = "sunday";
                break;
            default:
                day = "error";
        }
        System.out.println(day);


        }
    }
