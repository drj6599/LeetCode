import java.util.Scanner;

public class Assignment23 {

    //23. Input a number and print all the factors of that number (use loops).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println("Output: ");
        for (int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
