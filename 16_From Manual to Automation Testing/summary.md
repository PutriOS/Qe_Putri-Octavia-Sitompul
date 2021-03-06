# (16) From Manual to Automation Testing

- Dalam Pengujian Manual, kasus uji dijalankan oleh penguji dan perangkat lunak manusia Objektif: Eksplorasi dan Pengamatan manusia.

## Manual Testing

- Manual testing adalah langkah untuk mencari cacat atau bug pada program perangkat lunak. Pada metode ini tester atau penguji memiliki peran penting sebagai pengguna akhir pengecekan semua fitur aplikasi bekerja dengan benar. 
  
- Penguji melakukan pengecekan manual tanpa menggunakan bantuan atau tools/scripts. Tujuannya adalah untuk memastikan jika aplikasi yang diuji bebas cacat dan aplikasi perangkat lunak dapat bekerja sesuai dengan apa yang diharapkan. 
  
- Manual testing berperan penting saat pengujian visual dimana automation tools tidak dapat melakukan. Manual tester dapat mengetahui kontras antara button dan background yang lebih terang sehingga membuat user kesulitan mencari button dan memahami tindakan yang perlu diambil. User Interface (UI)feedback adalah hal yang tidak dapat ditemukan menggunakan automated testing.

### Kelebihan Manual Testing

- Mendapatkan Visual Feedback : Tools dan Scripts tidak dapat membantu dalam memberikan opini maupun input mengenai tampilan UI.

- Less expensive in the short-term projects : Jika hanya melakukan tes aplikasi sederhana yang tidak terlalu banyak updates maka manual testing tidak perlu menggunakan tools ataupun software yang mahal.

- The human element : Bisa mendapatkan feedback dari orang secara langsung sehingga mengetahui apa yang user suka dan tidak suka (Dimana automated tools tidak dapat memberikan feedback).

### Kekurangan Manual Testing

- Kurang teliti daripada automantion testing : Kadang adanya human error atau ketidaktelitian, sehingga jika menggunakan automation testing akan mengurangi bug yang akan terlewat.

- Not reusable : Jika menemukan banyaknya perubahan maka harus melakukan pengecekan secara manual kembali dari awal agar memastikan perubahan baru tidak akan merusak aplikasi yang sudah jadi.

- Kelelahan terhadap tester : Jika QA tester sudah sangat familiar dengan aplikasi yang selalu dia tes secara terus menerus sehingga membuat QA tester sangat memahami alur dari aplikasi tersebut. Sehingga hal ini akan menyebabkan kelelahan dan kesalahan maka melewatkan beberapa hal dan membuat kesalahan.

## Automation Testing

- Automation testing merupakan testing yang membutuhkan automation tools untuk menjalankan test case kita. Untuk melakukan proses automation testing quality assurance / tester perlu untuk membuat code / script testing. Script tersebut akan dijalankan dengan bantuan automation testing tools. 
  
- Automation testing bergantung pada script test yang berjalan secara otomatis. Fungsi automation testing adalah untuk membandingkan hasil yang diharapkan dengan hasil yang sebenarnya, seroang QA juga akan melihat apakah aplikasi sudah sesuai atau tidak. 

### Kelebihan Automation Testing

- Dapat menemukan bug lebih banyak dari manual tester : Script dapat mencari lebih dalam, sehinga dapat menemukan bug yang tester tidak dapat temukan.

- Kecepatan dan efisiensi : Script lebih cepat dari tester, sehingga dapat cepat selesai dalam menemukan bug.

- Test Reusable : Jika selalu mendapatkan update dan perubahan masing-masing unit/feature, maka tidak perlu menulis ulang scripsts setiap saat dan dapat digunakan kembali pada regression testing.

### Kekurangan Automation Testing

- Lebih Mahal : Karena menggunakan tools maka pengerjaan menggunakan automation testing akan mahal, namun tetap menghemat waktu serta usabilitas.

- Kurangnya human element : Manual testing memberikan human element untuk dapat melakukan interaksi user dengan aplikasi termasuk secara visual.

- Tidak adanya feedback mengenai UI : Tanpa adanya human element, maka kita tidak bisa melakukan pengecekan terhadap UI seperti warna, kontras, pemilihan font, dan button sizes.


**Kasus Uji Mana yang Harus Diotomatiskan?**

- Kasus uji yang dieksekusi berulang kali

- Uji kasus yang sangat membosankan atau sulit dilakukan secara manual

- Uji kasus yang memakan waktu untuk dilakukan secara manual

**Kasus Uji Mana yang TIDAK Diotomatiskan?**

- Uji kasus yang baru dirancang dan tidak dieksekusi secara manual setidaknya sekali

- Uji kasus yang persyaratannya adalah sering berubah


## Automate Testing Process

**1. Test Tool Selection**
Pemilihan tool selection sangat bergantung pada teknologi yang digunakan untuk membangun aplikasi yang sedang diuji. 

**2. Tentukan Lingkup Otomatisasi** : Lingkup otomatisasi adalah area aplikasi Anda yang sedang diuji yang akan diotomatisasi. Poin-poin yang membantu untuk menentukan scope yaitu fitur yang penting untuk bisnis, scenario yang memiliki banyak data, fungsionalitas umum di seluruh aplikasi, kelayakan teknis, sejauh mana komponen bisnis digunakan kembali, kompleksitas test case, kemampuan untuk menggunakan test case yang sama.

**3. Planning, Design dan Developmentn (Perencanaan, Desain dan Pengembanga)** : Selama fase ini Anda membuat strategi & rencana otomatisasi kemudian mengembangkan skrip otomatisasi.

**4. Test Execution** : Script yang telah dibuat akan dijalankan pada fase ini. Script membutuhkan input test data sebelum di set untuk dijalankan. Setelah dieksekusi kita akan mendapatkan sebuah report hasil automation testing. 

**5. Maintenance** : Skrip otomatisasi perlu ditambahkan, ditinjau. dan dipertahankan untuk setiap siklus. Fase maintenance adalah fase dimana automation testing yang dilakukan untuk menguji apakah fungsionalitas baru yang ditambahkan ke perangkat lunak atau software berfungsi dengan baik atau tidak. Maintenance dalam automation test dilakukan ketika script automation baru ditambahkan dan perlu direview untuk meningkatkan efektivitas setiap scripts di setiap siklus release yang berurutan. 

**Praktik Terbaik Otomasi**

- Lingkup otomatisasi perlu ditentukan secara rinci, ini menetapkan harapan dari otomatisasi yang tepat.

- Pilih alat otomatisasi yang tepat 

- Standar penulisan : Standar harus diikuti saat menulis skrip untuk otomatisasi.

- Mengukur metrik : Keberhasilan otomatisasi tidak dapat ditentukan dengan membandingkan manual upaya dengan upaya otomatisasi.

## Task

**Task 1**

![Task1](https://user-images.githubusercontent.com/94749506/158949146-cd943aeb-b145-4109-9192-0b22989dd046.PNG)

- Pada gambar tersebut merupakan laporan hasil pengujian dalam format HTML. Pengujian file Sample_REST_API_Testing.feature memiliki fitur sebagai melakukan operasi CRUD. Pada gambar terdapat method Create, Read, Update, Delete yang memiliki wakktu respon yang berbeda beda dalam menjalankan method tersebut. 

- Pada Method Delete keccepetan respon 880 mms, Method Get keccepetan respon 212 mms, Method Post keccepetan respon 786 mms, Method Update keccepetan respon 764 mms.
  
- Response Time Testing mengukur waktu yang dibutuhkan untuk sistem untuk menanggapi permintaan yang lain. Respon time adalah waktu yang dibutuhkan sistem untuk mencapai input tertentu sampai proses selesai. 
  
- Misalnya ketika melakukan testing API, kita ingin tahu persis berapa lama waktu yang diperlukan untuk menjalankannya dan mengembalikan data dalam JSON.

**Task 2**

![Task2](https://user-images.githubusercontent.com/94749506/158949111-6020c627-2f47-4972-8ade-0c7fe1ec5089.PNG)

- Pada Serenity memiliki daftar jenis persyaratan yang akan digunakan saat membaca persyaratan dari sistem file dan saat mengatur laporan. Struktur standar daftar jenis persyaratan menggunakan tiga level: capabilities, features and stories.

- Test Count : Halaman ringkasan dari semua statistik dan info umum, berdasarkan jumlah skenario yang digunakan. 

- Warna merah menandakan Failed = Jumlah semua skenario yang gagal. Warna biru muda menandakan Pending = Jumlah semua skenario yang ditandai sebagai tertunda. Warna hijau menandakan Passed = Jumlah semua skenario yang dilewati.

- Pada gambar dapat diketahui bahwa Petstore memiliki satu jumlah scenario yang dilakukan testing dan berhasil dilewati. sehingga presentasi keberhasilan 100%.

- Search terdapat 4 scenarios yang dilankukan testing namun 3 scenario berhasil dan 1 scenario pending, sehingga presentasi keberhasilan 75%.

- Shopping Cart teredapat 2 scenario yang dilakukan testing dengan 1 scenario berhasil dan 1 scenario gagal, sehingga presentasi keberhasilan 50%.
