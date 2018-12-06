public class InputOperation {
    public static int getOperation(){
        Settings scanOper = new Settings();
        System.out.println("Введите число:");
        int num;
        if(scanOper.scanner.hasNextInt()){
            num = scanOper.scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanOper.scanner.next();//рекурсия
            num = getOperation();
        }
        return num;
    }
}
