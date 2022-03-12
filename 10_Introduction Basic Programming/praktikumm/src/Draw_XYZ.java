public class Draw_XYZ {
    private static void drawXYZ(int n){
        String cetak = "";
        int hasil = 0;
        for (int o = 1; o <= n; o++){
            for (int p = 1; p <= n; p++){
                hasil = hasil+1;
                if (hasil %3 == 0){
                    cetak += " " + "X";
                    /*System.out.println("X");*/
                }
                else if (hasil %2 == 0){
                    cetak += " " + "Z";
                    /*System.out.println("Z");*/
                }
                else{
                    cetak += " " + "Y";
                    /*System.out.println("Y");*/
                }
            }cetak += "\n";
        }
        System.out.println(cetak);
    }

    public static void main(String[] args) {
        drawXYZ(3);
        System.out.println("=====================");
        drawXYZ(5);
        System.out.println("=====================");
        drawXYZ(1);
    }
}
