import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt();
        if (number<2){
            System.out.println("KHONG PHAI SNT");
        }
        if (number>2){
            boolean check = true;
            int i = 2;
            while (i <= Math.sqrt(number)){
                if (number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number+" la snt");
            else
                System.out.println(number+" khong phai snt");
        }
    }
}
