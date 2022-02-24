# (4) Software Testing Fundamental

##  Resume 

> Pengertian :

- Menurut standar (ANSI/IEEE 1059) ***Software Testing*** Sebuah proses menganalisis item perangkat lunak untuk mendeteksi perbedaan antara kondisi yang ada dan yang dibutuhkan (yaitu cacat) dan untuk mengevaluasi fitur dari item perangkat lunak.

- Mengapa software testing itu penting ??
  - Menghemat uang
  - Menjaga Kualitas produk
  - Keamanan
  - Kepuasan Kustom

- Bug perangkat lunak bisa mahal atau bahkan berbahaya yang mana Bug perangkat lunak berpotensi menyebabkan kerugian moneter dan manusia


> Types Of Software Testing :

**1. Functional Testing**

- Manual 

    - Dalam proses ini, penguji perangkat lunak menjalankan kasus uji dan menghasilkan laporan pengujian.

    - Ini adalah metode klasik dari semua jenis pengujian dan membantu menemukan bug dalam sistem perangkat lunak.

- Automate

    - Penguji menulis kode/skrip pengujian ke mengotomatisasi pelaksanaan tes.

    - Penguji menggunakan alat otomatisasi yang sesuai untuk mengembangkan skrip pengujian dan memvalidasi perangkat lunak

    - Tujuannya adalah untuk menyelesaikan eksekusi tes dalam waktu yang lebih singkat.

**2. Non-Functional Testing**

  - Performance Testing
PENGUJIAN KINERJA didefinisikan sebagai jenis pengujian perangkat lunak untuk memastikan aplikasi perangkat lunak akan bekerja dengan baik di bawah beban kerja yang diharapkan.

**3. Maintenance**

  - Regression 
PENGUJIAN REGRESI Jenis pengujian perangkat lunak untuk mengonfirmasi bahwa fitur baru atau perubahan kode tidak berdampak buruk pada fitur yang ada.


> Levels of Testing : 

1. Unit Testing adalah tingkat pengujian perangkat lunak di mana unit individu / komponen perangkat lunak diuji.
2. Integration Testing adalah tingkat pengujian perangkat lunak di mana unit individu digabungkan dan diuji sebagai sebuah kelompok.
3. System Testing adalah tingkat pengujian perangkat lunak di mana perangkat lunak yang lengkap dan terintegrasi diuji.
4. Acceptance Testing adalah tingkat pengujian perangkat lunak di mana sistem diuji untuk penerimaan.


## TASK 

**TASK 1**

![Task1 section4](https://user-images.githubusercontent.com/94749506/155451615-5bfbd2e1-b0eb-45ac-afb0-917697b9fcf5.PNG)

- Sebuah program dikatakan “baik” jika mutation score yang didapatkan bernilai 100%. Sedangkan pada mutation score yang didapatkan diatas pada com.hascode.tutorial.entity 67%, dan com.hashcode.tutorial.service 75%. Agar mendapatkan mutasi score senilai 100%, maka langkah yang perlu kita lakukan adalah menambahkan test case untuk program tersebut. Jika test case tersebut terhitung mendapatkan nilai yang berbeda dari expected outcome, maka mutant tersebut dinyatakan terbunuh. Setelah semua mutant terbunuh, maka akan didapatkan mutation score senilai 100%.

- Line coverage merupakan jumlah baris yang dieksekusi dibagi dengan jumlah total baris. 
Hanya baris yang berisi pernyataan yang dapat dieksekusi yang dipertimbangkan, bukan yang memiliki deklarasi murni. Line coverage pada com.hascode.tutorial.entitiy terdapat  6 dari 9 baris kode yang ditulis telah dilakukan testing. Sedangkan line coverage pada com.hascode.tutorial. service menunjukkan bahwa seluruh  baris kode yang ditulis telah dilakukan testing. 


**TASK 2**

![Task2 section4](https://user-images.githubusercontent.com/94749506/155451663-cc830f65-3850-4266-915d-e1ca640c14a7.PNG)

- Terdapat dua metode didalam kelas Calculator Service Impl yaitu metode add dan metode subtract dengan memiliki 2 parameter yang menyimpan nilai dari inputan yang akan dimasukkan. Inputan tersebut akan dilanjutkan dengan perhitungan operasi yang dilakukan pada masing – masing metode. Metode add merupakan fungsi untuk melakukan pertambahan sedangkan metode subtract merupakan fungsi untuk melakukan pengurangan. 


*Ada beberapa kriteria yang perlu dipertimbangkan saat menulis tes:*

- Memastikan bahwa bagian kode yang paling baik diuji adalah bagian yang paling mungkin mengandung bug.
- Memfokuskan pengujian kami pada bagian aplikasi yang penting, bagian di mana bug paling mungkin menyebabkan hasil yang buruk bagi pelanggan.
- Menulis tes yang berulang kali mencakup area kode yang sama sambil mengabaikan bagian lain dari kode.

Kode ini berwarna merah, kuning, atau hijau untuk menunjukkan apakah tidak ada, sebagian, atau lengkap cakupan kode untuk setiap baris.
- Cakupan Penuh (Default: penyorotan hijau)
  - warna Hijau, itu berarti semua baris tersebut tercakup dalam pengujian Junit.
- Cakupan Sebagian (Default: penyorotan kuning)
  - warna Kuning berarti tes yang dibuat telah mengikuti instruksi, tetapi tidak semua kemungkinan kasus telah tercakup.
- Tidak Ada Cakupan (Default: sorotan merah)
  - warna Merah, itu berarti semua garis tersebut tidak tercakup dalam pengujian Junit.
