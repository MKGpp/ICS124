import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("enter int: ");
        int newInt = sc.nextInt();
        
        System.out.print("enter string: ");
        String newString = sc.nextLine();

        System.out.println(newInt + newString);
    }
}