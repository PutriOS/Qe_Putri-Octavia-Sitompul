public class Play_With_Asterisk {
    private static void playWithAsterisk(int n){
        // k= number of spaces
        int k = 2*n - 2,i,j;

        // outer loop to handle number of rows

        for (i=0; i<n; i++)
        {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (j=0; j<k; j++)
            {
                // printing spaces
                System.out.print(" ");
            }

            // decrementing k after each loop
            k = k - 1;

            // inner loop to handle number of columns

            for (j=0; j<=i; j++ )
            {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }
    }
    public static void main(String[] args) {
        playWithAsterisk(5);
    }
}
