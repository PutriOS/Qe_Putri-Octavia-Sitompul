public class Cetak_Tabel_Perkalian {

    private static void cetakTablePerkalian(int n){

        String tabelnya = " Tabel Perkalian \n";
        tabelnya += "------------------------------\n";
        for (int i = 1; i <= n; i++) {
            tabelnya += i + " | ";
            for (int j = 1; j <= n; j++) {
                //menampilkan angka dan pengaturan
                if (i * j < 10) {
                    tabelnya += " " + i * j;
                } else {
                    tabelnya += " " + i * j;

                }
            }
            tabelnya += "\n";
        }
        //menampilkan hasilnya
        System.out.println(tabelnya);
    }

    public static void main(String[] args) {

    cetakTablePerkalian(9);
    }
}