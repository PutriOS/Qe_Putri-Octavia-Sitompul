import java.util.Scanner;

public class indexHuruf {
    public static void main(String args[]) {
        String[][] myChar = {
                {"A","B","C","D","E"},
                {"F","G","H","I","J"},
                {"L","M","N","O","P"},
                {"Q","R","S","T","U"},
                {"V","W","X","Y","Z"}
        };

        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Input     : ");
        str=sc.nextLine().toUpperCase();
        int i,j,k,l;

        for (i=0;i<5;i++){
            for (j=0;j<5;j++){
                if(str.equals(myChar[i][j])){
                    j +=1;
                    i +=1;
                    System.out.print("Output    : "+j+" "+i);
                }else if(str.equals("K")){
                    str = "C";
                    for (k=0;k<5;k++){
                        for (l=0;l<5;l++){
                            if(str.equals(myChar[k][l])){
                                k +=1;
                                l +=1;
                            }
                        }
                    }
                }
            }
        }
    }
}
