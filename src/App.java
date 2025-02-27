import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i = 1; i<= N;i++)
        {
            if(i%3 == 0 && i%5 !=0)
            System.out.println("Fizz");
            else if(i%3 != 0 && i%5 ==0)
            System.out.println("Buzz");
            else if(i%3 == 0 && i%5 ==0)
            System.out.println("FizzBuzz");
            else
            System.out.println(i);

            
        }

    }
}
