package views;

import java.util.Scanner;

public class UserView {
//*Метод возвращает фильм, который надо взять в аренду*/    
    public String showSubmitMenu(){
        System.out.println("Введите название фильма для аренды:");
        Scanner sc = new Scanner(System.in);
        var res = sc.nextLine();
        return res;
    }
 //*Метод возвращает фильм, который надо вернуть*/
    public String showReturnMenu(){
        System.out.println("Введите название фильма для возврата:");
        Scanner sc = new Scanner(System.in);
        var res = sc.nextLine();
        return res;
    }
}
