import java.util.Scanner;

public class ulesanne2 {
    public static void main(String[] args){
        System.out.println("Введите любое 3х начное число, и я посчитсаю сумму чисел");
        Scanner scanner = new Scanner (System.in);
        int num = scanner.nextInt();
        System.out.println("Сумма цифр числа " +num +" равна "+((num%10)+((num/10)%10)+((num/100)%10)));
    }
}

