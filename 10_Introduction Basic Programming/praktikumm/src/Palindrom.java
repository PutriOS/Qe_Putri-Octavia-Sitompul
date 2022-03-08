public class Palindrom {
    private static boolean palindrome(String value) {
        String original, reverse = "";
        int length = value.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + value.charAt(i);
        if (value.equals(reverse)) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
    }
}