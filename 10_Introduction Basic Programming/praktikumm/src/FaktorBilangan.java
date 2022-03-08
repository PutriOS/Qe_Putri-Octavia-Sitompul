import java.util.Scanner;

public class FaktorBilangan {
    public static void main(String[] args)
    {
        int bilangan;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka yang ingin dicari faktornya : ");
        bilangan = input.nextInt();
        System.out.print("Faktor dari " + bilangan + " adalah : ");
        for(int i=1;i<=bilangan;i++)
        {
            if(bilangan%i == 0)
            {
                System.out.print("\n" + i);
            }
        }
    }
}
