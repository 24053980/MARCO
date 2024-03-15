import java.util.Scanner;

public class koketso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("input your first number");
        a = scan.nextInt();
        System.out.println("input your second number");
        b = scan.nextInt();
        c = a-b;
        System.out.println("final answer is :--" + c);
        

    }
}