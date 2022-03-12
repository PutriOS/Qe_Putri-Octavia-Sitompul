public class Cetak_Tabel_Perkalian {
    private static void cetakTablePerkalian(int n){
        String tabelnya = " Tabel Perkalian \n";
        tabelnya += "------------------------------\n";
        int hasil = 0;
        if(n>= 30 || n==0){
            System.out.println("Batas Angka 1-30");
        }else {
            for (int i = 1; i<= n; i++){
                tabelnya += i + " | ";
                for (int j = 1; j<=n; j++){
                    tabelnya += " " + i * j;
                }tabelnya += "\n";
            }

        }
        System.out.println(tabelnya);
    }

    public static void main(String[] args) {
        cetakTablePerkalian(3);
    }
}