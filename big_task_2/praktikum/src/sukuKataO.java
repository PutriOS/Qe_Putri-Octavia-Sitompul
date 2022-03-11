import java.util.Scanner;

public class sukuKataO {
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);

        //Ask for user input
        System.out.print("Enter String: ");
        String str= sc.nextLine();

        //Converting the string into UPPER CASE
        String str1=str.toUpperCase();

        //Converting String 'str1' into character Array
        char[] ch = str1.toCharArray();

        for(int i=0 ;i<ch.length-1;i++)
        {
            // checking for 'vowel'
            if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
            {
                // if vowel found then increase 1 in the ASCII value of character
                // typecast into character and store in the same array position
                ch[i] = (char)(ch[i]+1);

            }
        }

        //Converting the array into String and store in str2
        String str2 = new String(ch);

        //Print the final output
        System.out.print(str2);

    }
}
