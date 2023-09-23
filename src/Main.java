import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int numOne = 0;
        int numTwo = 0;

        System.out.println("Enter a number: ");
        if (in.hasNextInt())
        {
            numOne = in.nextInt();
            in.nextLine(); //clears buffer

            System.out.println("Enter another number: ");
            numTwo = in.nextInt();

            if (numOne == numTwo)
            {
                System.out.println("Your numbers are equal!");
            }
            else if (numOne < numTwo)
            {
                System.out.println("Your first number is less: " + numOne);
            }
            else if (numOne > numTwo)
            {
                System.out.println("Your second number is less: " + numTwo);
            }

        }
    }
}