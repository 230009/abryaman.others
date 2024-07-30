import java.util.Scanner;

public class case2 {
    //Дано целое число K. Вывести строку-описание оценки, соответствующей числу K (1 — «плохо», 2 — «неудовлетворительно»,
    // 3 — «удовлетворительно», 4 — «хорошо», 5 — «отлично»). Если K не лежит в диапазоне 1–5, то вывести строку «ошибка».
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number from 1 to 5");
        int k = scan.nextInt();
        String grade = null;
        switch(k){
            case 1:
                grade = "bad";
                break;
            case 2:
                grade = "unsatisfactorily";
                break;
            case 3:
                grade = "satisfactorily";
                break;
            case 4:
                grade = "good";
                break;
            case 5:
                grade = "excellent";
                break;
            default:
                System.out.println("error");

        }
        System.out.println(grade);

    }

}
