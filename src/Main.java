import java.util.Scanner;

public class Main {
    // 0 veya negatif sayıya kadar çıkar ve çıkanı ekrana yaz
    static int recursiveMethodMinus(int controlValue) {
        if (controlValue <= 0) return controlValue;
        System.out.println(controlValue + " ");
        return recursiveMethodMinus(controlValue - 5);
    }
    //Girilen değere kadar topla ve ekrana yazdır
    static void  recursiveMethodPlus(int controlValue, int userValue){
        if (userValue >= controlValue) {
            System.out.println(controlValue + " ");
            recursiveMethodPlus(controlValue + 5, userValue);
        }
    }
    public static void main(String[] args) {
        //Kullanıcı veri girişi
        Scanner inp =  new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int userValue = inp.nextInt();
        int controlValue = recursiveMethodMinus(userValue);
        recursiveMethodPlus(controlValue, userValue);

    }
}


