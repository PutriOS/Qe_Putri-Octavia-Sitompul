import java.util.Scanner;

public class jamPasir {
    public static void main (String args[])
    {
        Scanner s = new Scanner(System.in);
        int row, column, star;
        System.out.println("enter number: ");
        int number = s.nextInt();

        for(row = 1;row <= number;row ++)
        {
            for(column = 1;column <= row;column ++)
            {
                System.out.print(" ");
            }
            for(star = number;star >= row;star --)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(row = 1;row <= number;row ++)
        {
            for(column = number;column >= row;column --)
            {
                System.out.print(" ");
            }
            for(star = 1;star <= row;star ++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
