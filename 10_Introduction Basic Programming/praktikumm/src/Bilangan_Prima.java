public class Bilangan_Prima {
    private static boolean primeNumber(int input) {
        int status = 0;
        for(int a = 1; a <= input; a++) {
            int result = input%a;
            if(result == 0) {
                status++;
            }
        }
        if(status < 3) {
           return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));
    }
}
