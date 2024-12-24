import java.util.*;

public class Main {


    public ListNode AddTwoNumbersSolution(ListNode l1, ListNode l2) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        while(l1 != null && l2 != null) {
            sb1.append(l1.val);
            l1 = l1.next;

            sb2.append(l2.val);
            l2 = l2.next;
        }

        int sum1 =  Integer.parseInt(sb1.reverse().toString()) + Integer.parseInt(sb2.reverse().toString());

        char[] a = Character.toChars(sum1);
        StringBuilder sb = new StringBuilder();
        for (char c : a) {
            sb.append(c);
        }
        int sum = Integer.parseInt(sb.reverse().toString());


        if (sum == 0) {
            return new ListNode(0);
        }

        while(sum>0) {
            int digit = sum % 10;
            ListNode newNode = new ListNode(digit);
            newNode.next = l1;
            l1 = newNode;
            sum = sum / 10;
        }

        return l1;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}