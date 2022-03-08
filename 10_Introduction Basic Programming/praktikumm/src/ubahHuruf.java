public class ubahHuruf {
    private static String ubahHuruf(String s) {
        String encryptedMessage = "";
        char ch;
        for(int i = 0; i < s.length(); ++i){
            ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch + 10);

                if(ch > 'z'){
                    ch = (char)(ch - 'z' + 'a' - 1);
                }

                encryptedMessage += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + 10);

                if(ch > 'Z'){
                    ch = (char)(ch - 'Z' + 'A' - 1);
                }

                encryptedMessage += ch;
            }
            else {
                encryptedMessage += ch;
            }
        }
        return encryptedMessage;
    }
        public static void main (String[]args){
            System.out.println(ubahHuruf("SEPULSA OKE"));
            System.out.println(ubahHuruf("ALTERRA ACADEMY"));
            System.out.println(ubahHuruf("INDONESIA"));
            System.out.println(ubahHuruf("GOLANG"));
            System.out.println(ubahHuruf("PROGRAMMER"));
        }
}
