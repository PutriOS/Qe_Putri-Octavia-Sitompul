public class Play_With_Asterisk {
    private static void playWithAsterisk(int n){
        int k = 2*n - 2,i,j;
        for (i=0; i<n; i++)
        {
            for (j=0; j<k; j++)
            {
                System.out.print(" ");
            }
            k = k - 1;
            for (j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        playWithAsterisk(5);
    }
}
