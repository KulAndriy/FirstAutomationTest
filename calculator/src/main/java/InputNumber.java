import java.util.Scanner;

public class InputNumber {

    public static int getInt(){
        Settings scanNum = new Settings();
        System.out.println("Введите число:");
        int num;
        if(scanNum.scanner.hasNextInt()){
            num = scanNum.scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanNum.scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }


}
