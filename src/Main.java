import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter first string");
        Scanner input = new Scanner(System.in);
        String num1 = input.next();
        System.out.println("Enter second value");
        int num2 = input.nextInt();
        Integer num111 = Integer.valueOf(num1);
        Integer num222 = Integer.valueOf(num2);
        Integer less;
        Integer larger;

        int compareResult = num222.compareTo(num111);
        if (compareResult==1){
            larger=num222;
            less=num111;
            System.out.println("Big:" + larger);
            System.out.println("Small:" +(double)less);
        }
        else if (compareResult==-1){
            larger=num111;
            less =num222;
            System.out.println("Big:" + larger);
            System.out.println("Small:" +(double)less);
        }

    }
}



