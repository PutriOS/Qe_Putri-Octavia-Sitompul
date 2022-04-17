# (25) Mobile Testing

## RESUME

## Part 1

**Appium**

• Appium adalah kerangka kerja otomatisasi seluler untuk menjalankan uji otomatisasi seluler.

• Appium mendukung banyak bahasa pemrograman seperti java, python. javascript. rubi, dll.

• Pustaka Appium dibuat di atas pustaka Selenium.

• Mendukung aplikasi Android, iOS, dan Windows.

**Komponen Appium**

• Di Appium, ada dua komponen utama yang kami gunakan  : 

    1. Appium Server. Appium Server digunakan sebagai jembatan untuk mengontrol perangkat pengujian. Ada dua versi, kita dapat menggunakan desktop appium atau menginstal perintah appium menggunakan npm.

    2. Appium Client. Pustaka ditulis dalam beberapa bahasa untuk membuat skrip pengujian sehingga kami dapat mengirim perintah ke server appium.

**Desired Capabilities**

• Kemampuan yang Diinginkan digunakan untuk memberi tahu appium jenis kemampuan apa yang ingin Anda gunakan (menjalankan aplikasi Android, iOS, atau Windows).

**Appium Locators**

• Appium Locators digunakan untuk menemukan elemen (tombol, tombol radio bidang teks, dll).

• Di appium kita dapat menggunakan 7 pencari:

    1. ID

    2. Class Name

    3. Xpath

    4. Accessibility ID

    5. Android UI Automator

    6. Android View Tag (Espresso Only)

    7. IOS UI Automation

• Pencari yang paling banyak digunakan adalah ID. ID Aksesibilitas, dan Xpath.


## Part 2

**Appium basic action and cucumber**

1. Menambahkan File Fitur

• File fitur digunakan untuk mendefinisikan kasus uji untuk fitur tertentu menggunakan sintaks gherkin

2. Memetakan Setiap Langkah Skenario pada Kelas Langkah

3. Menginisialisasi Appium

• Kami membutuhkan kelas untuk memulai dan menghentikan sesi appium

4. Menambahkan Kemampuan yang Diinginkan (Desired Capabilities)

• Perlunya mengatur Kemampuan yang Diinginkan untuk memberi tahu appium fitur mana yang ingin Anda gunakan (misalnya menjalankan aplikasi android atau aplikasi los, file apk mana yang harus kita instal)

5. Inisialisasi Appium

• Inisialisasi Appium dengan memanggil konstruktor.

6. Cucumber Hooks

• Hooks adalah blok kode yang dapat dijalankan di berbagai titik dalam siklus eksekusi Mentimun Mereka biasanya digunakan untuk pengaturan dan pembongkaran lingkungan sebelum dan sesudah setiap skenario.

• Kita dapat menggunakan Hook @Before untuk menjalankan kode sebelum skenario dijalankan atau Hook @After untuk menjalankan kode setelah skenario dijalankan.

7. Page Object Design Pattern

• Mewakili halaman web sebagai file kelas java tunggal

• Terdiri dari semua tindakan yang dapat dilakukan pada satu halaman web.

• Digunakan untuk mengurangi duplikasi kode

• Membantu kode pengujian lebih mudah dibaca dan dipahami

8. Fungsi By Object dan findElement()

• MobileBy adalah objek untuk menyimpan locators Gunakan metode statis untuk menyimpan data berdasarkan tipe pencari

• fungsi findElement() digunakan untuk menemukan sebuah elemen. Ini menerima satu parameter dengan MobileBy tipe data. Ini mengembalikan tipe data Elemen Android. 

• Catatan findElement wajib digunakan sebelum melakukan tindakan (jenis klik, pilih, dll)

9. Fungsi sendKeys () dan hapus ()

• sendKeys() adalah fungsi di dalam objek Elemen Android untuk mensimulasikan tindakan pengetikan yang menerima satu parameter dengan tipe data Charsequence (Anda juga dapat memasukkan String di atasnya)

• Dapat menggabungkan dengan fungsi clear() untuk menghapus data terlebih dahulu pada bidang teks sebelum Anda memasukkannya jika data input elemen sudah diisi sebelumnya

10. Fungsi klik ()

• click() adalah fungsi di dalam objek Elemen Android untuk mensimulasikan tindakan klik.

11. Fungsi getText()

• getText() adalah fungsi di dalam objek AndroidElement untuk mendapatkan teks elemen yang terlihat mengembalikan tipe data String.

12. Fungsi isDisplayed()

• Fungsi isDisplayed() digunakan untuk memeriksa apakah elemen ditampilkan di layar atau tidak mengembalikan tipe data Boolean

13. Perform Assertions

• Perpustakaan JUnit untuk memvalidasi data dan membandingkan apakah data aktual sama tidak sama, berisi, tidak kosong dll dengan data yang diharapkan.

## Part 3

**Appium Complex Actions & Maximizing the Project Structure**

**Working With Wait : The Web driver Wait Object**

• Webdriver Wait object digunakan untuk mengatur wait sampai elemen memenuhi kondisi. Ex tunggu sampai elemen terlihat, tunggu sampai elemen hilang, dll.

• Ini adalah bagian dari Explicit wait (Ini hanya berlaku untuk AndroidElement tertentu)

• Konstruktor itu sendiri memiliki 3 parameter:

    • Parameter pertama untuk Objek Driver Android

    • Parameter ke-2 untuk batas waktu (waktu maksimum yang kami tunggu untuk elemen memenuhi kondisi)

    • Parameter ke-3 untuk waktu pemungutan suara (periksa setiap x milis)


• Objek ExpectedConditions menyimpan daftar kondisi yang didukung oleh appium.

**Setting Up Implisit Wait**

• Penantian implisit akan diterapkan untuk setiap AndroidElement yang kita buat menggunakan fungsi findElement().

• Anda dapat mengatur waktu tunggu implisit setelah Anda menginisialisasi Driver Android

**The BasePageObject class**

• Kelas BasePageObject bertujuan untuk membungkus semua fungsi appium untuk membantu kita menulis lebih sedikit kode di kelas halaman.

• Kita bisa menggunakan warisan. Jadi setiap kelas halaman harus memperluas kelas BasePageObject.


**Performing complex actions**

• Objek TouchAction digunakan untuk melakukan tindakan kompleks (gulir, atas dan tahan. dll).

• Ini menggunakan pola desain builder sehingga menggunakan metode chaining dan Anda dapat menggabungkannya untuk melakukan tindakan tertentu.

**Taking Screenshot**

**1. Adding cucumber.properties file**

Kita dapat mengonfigurasi pengaturan mentimun dengan menambahkan file properti mentimun di dalam folder sumber daya.

mentimun.glue = untuk mengatur lokasi langkah dan kelas pengait

mentimun.plugin = untuk mengaktifkan plugin mentimun (menghasilkan file JSON untuk hasil, menambahkan laporan sederhana, dll)

mentimun.fitur mengatur lokasi/jalur file fitur

Cucumber.publish.enabled untuk mengaktifkan laporan online mentimun

Cucumber.publish.quiet = untuk menonaktifkan/mengaktifkan info laporan mentimun saat kita tidak menyalakannya.

**2. The takes Screenshot Interface**

- Kelas AndroidDriver mengimplementasikan antarmuka TakesScreenshot

- Antarmuka TakesScreenshot digunakan untuk melakukan screenshot ke layar.

- Dapat menggunakan referensi Antarmuka untuk mengakses metode pengambilan tangkapan layar

- Dapat meletakkannya di kelas kait sehingga setiap kali skenario gagal, appium akan mengambil tangkapan layar

**Configuration file**

- Konfigurasi menggunakan format YAML

- YAML adalah bahasa serialisasi data yang sering digunakan untuk menulis file konfigurasi

- YAML adalah singkatan dari bahasa markup lain atau YAML bukan bahasa markup (akronim rekursif), yang menekankan bahwa YAML adalah untuk data, bukan dokumen
