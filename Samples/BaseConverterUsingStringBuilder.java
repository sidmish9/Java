import java.util.Scanner;

public class Main {

    static int convToDecimal(int num, int base) {

        int sum = 0;
        int i = 0;
        while (num >= 1) {
            sum += (int) (Math.pow(base, i) * (num % 10));
            num = num / 10;
            i++;


        }
        return sum;
    }



    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a the decimal number");
        int num = sc.nextInt();
        System.out.println("Enter the base you want to convert to (<10)");
        int base = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (num >= 1) {
            sb.append(num % base);
            num = num / base;
        }
        int result = Integer.parseInt(sb.reverse().toString());
        System.out.println(result);
        System.out.println("Converting back to decimal gives :" + convToDecimal(result, base));
    }


}





