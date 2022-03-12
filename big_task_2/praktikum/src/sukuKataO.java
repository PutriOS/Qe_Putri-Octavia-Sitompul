import java.util.Scanner;

public class sukuKataO {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan kata : ");
        String oldString = scanner.next();
        String newString = changeVowels(oldString);
        System.out.println("Input Kata : " + newString);
        scanner.close();
    }

    private static String changeVowels(String oldString) {
        String str1=oldString.toLowerCase();
        char[] characters = str1.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            switch (characters[i]) {
                case 'a':
                    characters[i] = '.';
                    break;
                case 'i':
                    characters[i] = '.';
                    break;
                case 'o':
                    characters[i] = '-';
                    break;
                case 'u':
                    characters[i] = '.';
                    break;
                default:
                    characters[i] = ' ';
                    break;
            }
        }
        return String.valueOf(characters);
    }
}
