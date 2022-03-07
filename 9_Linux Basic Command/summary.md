# Linux

## Resume
- Linux command adalah Ultililtas dari system operasi linux, semua tugas dasar dan lanjutan dapat dijalankan dengan command
Antarmuka baris perintah untuk berinteraksi dengan system. Command di linux sensitive terhadap huruf besar maupun huruf kecil command line di linux sepenuhnya text based dan lebih cepat menggunakan gui 
Fully text based .


**Kelebihan command line**

1. Less resources 

- Command line ringan untuk digunakan sehingga tidak mengharuskan computer memiliki spesifikasi tinggi bila ingin menggunakan command line

2. Repetitive task friendly
- Dapat menyimpan script untuk mengotomatiskan tugas yang sama berulang kali

3. Powerful
- Karena menggunakan teks antarmuka system operasi ini terlihat lebih stabil dibandingkan menggunakan gui. Hal ini Tidak akan mempengaruhi aktivitas krn tidak memakan resource memori yang telalu banyak. Command line terkenal dengan tingkat stabilnya misalnya debian sever

**LINUX**

**Macam macam koment linux**
Ls –a menampilkan semua file yang namanya dimulai dengan titik atau yang tersembunyi. Kita bisa mendapatkan lebih banyak informasi dengan menambahkan option sederhana –a. Kita ingin mencoba menampilkan file dalam format panjang dari direktori saat ini, kita perlu mengetikkan path sebagai parameternya cth: ls –a /usr.

**Basic Command**

***1. Cal*** memiliki fungsi untuk menampilkan kalender

***2. Date*** menampilkan tanggal pada zona waktu yang tertera di os kita.


**File System command**

***1. Touch*** : touch adalah perintah dasar Linux yang memperbolehkan Anda membuat file baru yang kosong melalui baris perintah Linux. Sebagai contoh, ketik touch /home/username/Documents/Web.html untuk membuat file HTML berjudul Web di bawah direktori Documents.

***2. Cat*** : cat (akronim dri concatenate) adalah salah satu perintah dasar sistem operasi Linux yang sering digunakan. Perintah ini berfungsi untuk membuat daftar konten atau isi file pada standard output (sdout). Untuk menjalankan command ini, ketik cat yang kemudian diikuti dengan nama dan ekstensi file. Sebagai contoh: cat file.txt. belum ada file untuk membuatnya

***3. cp commands*** : cp untuk menyalin file dari direktori saat ini ke direktori yang berbeda. Misalnya, command cp scenery.jpg /home/username/Pictures untuk membuat salinan scenery.jpg (dari direktori saat ini) ke direktori Pictures.

***4. mv commands*** : Fungsi utama command mv adalah untuk memindahkan file meskipun sebenarnya bisa digunakan untuk mengganti atau mengubah nama file. Argumen yang ada di mv serupa dengan argumen yang ada di perintah cp. Ketik mv, nama file, dan direktori tujuan. Contoh: mv file.txt /home/username/Documents. Untuk mengganti nama file, perintah Linux-nya adalah mv oldname.ext newname.ext.

***5. rm*** : adalah perintah dasar pada Linux yang berfungsi untuk menghapus direktori beserta isinya. Jika hanya ingin menghapus direktorinya saja – alternatif command selain rmdir – gunakan rm -r.
Catatan: Saat menggunakan command ini, Anda harus berhati-hati dan cek kembali direktori di mana Anda berada saat ini. Sekali command rm dijalankan, maka semuanya akan terhapus dan tidak bisa dikembalikan.

***6. mkdir*** : Untuk membuat direktori baru, Anda bisa menggunakan perintah dasar Linux mkdir. Sebagai contoh, jika Anda mengetik mkdir Music, direktori baru yang muncul disebut Music.

***7. rmdir*** : Jika ingin menghapus direktori, gunakan perintah rmdir. Namun, rmdir hanya boleh digunakan untuk menghapus direktori kosong.

***8. cd Command*** : Untuk menjelajahi file dan direktori Linux, gunakan perintah cd. Perintah Linux ini memerlukan path penuh atau nama direktori, tergantung pada direktori yang Anda gunakan saat ini.
Misalkan saat ini Anda sedang berada di /home/username/Documents dan ingin membuka Photos, subdirektori dari Documents. Untuk melakukannya, Anda hanya perlu mengetikkan command ini: cd Photos.

***9. pwd Command*** : Perintah dasar Linux pwd berfungsi untuk mencari path dari direktori (folder) yang Anda gunakan saat ini. Perintah ini akan mengembalikan path yang absolut (penuh), yang pada dasarnya merupakan path semua direktori yang diawali dengan garis miring depan (/). Contoh dari path absolut adalah /home/username.


***Process Control Commands***

***1. Top*** : command top akan menampilkan daftar proses yang sedang berlangsung dan seberapa banyak ruang CPU yang digunakan oleh tiap proses tersebut. Melakukan pengawasan terhadap penggunaan resource sistem sangatlah disarankan, terutama ketika Anda harus mencari tahu mana proses yang perlu dimatikan karena terlalu banyak menggunakan resource.

***2. Clear*** : command clear untuk membersihkan terminal jika di dalamnya sudah terdapat banyak sekali command.

***3. History*** : Kalau sudah lihai menggunakan Linux, Anda bisa menjalankan ratusan command atau perintah setiap hari. Misalnya, penggunaan command history untuk mengecek kembali (review) command yang sudah ditambahkan sebelumnya.


**UTILITIES Program Commands**

***1. Ls*** : Memiliki fungsi menampilkan semua file di direktori kerja kita.

***2. Which command*** : Mencari file yang dapat dieksekusi terkait command yang diberikan

***3. Sudo command*** : Sudo (Super user do) berfungsi untuk menjalankan task yang memerlukan hak akses (permission) administrative atau root. Namun, kami tidak menyarankan penggunaan command sudo untuk task harian karena bisa terjadi error kapan saja bila Anda melakukan kesalahan.

***5. Find command*** : Mencari file dan direktori lebih ditujukan untuk mencari file yang berlokasi didalam direktori yang diberikan.
Contoh, perintah find /home/ -name notes.txt akan mencari file bernama notes.txt di dalam direktori home dan subdirektorinya.


***File Access Permission***

***1. Chmod*** adalah perintah dasar Linux lainnya yang digunakan untuk membaca, menulis, dan menjalankan permission (hak akses) file dan direktori. 

***2. Chown*** : Pada sistem operasi Linux, semua file dimiliki oleh user khusus. Sebagai perintah dasar pada Linux, chown memungkinkan Anda untuk mengubah atau mentransfer kepemilikan file ke username khusus atau yang spesifik. Misalnya, chown linuxuser2 file.ext akan menentukan linuxuser2 sebagai pemilik file.ext.

Permission dari sebuah direktori
Jumlah file yang ada didalam direktori tersebut
User dari direktori
Dimiliki oleh grup wheel
64 kapsitas dari sebuah direktori
Tanggal dibuat direktori ini
Nama direktori

*Maksud dri drwx :*
- tanda d merupakan tipe file yang berkategori direktori
- tanda - berkategori file
- Rwx pertama menunjukkan permissions pemilik file
- Rwx kedua menunjukkan permissions Grup owner
- Rwx ketiga menunjukkan permissions User lain
- Rwx read write and execute memiliki bilangan biner 111 dengan bilangan decimal 7

**Shell Scripts**

- Shell Scripts merupakan sebuah bahasa pemograman yang disusun berdasarkan command command shall yang berfungsi sebagai jembatan antar user dan kernel. 
- Keuntungan menggunakan shell script : Ketika harus mengeksekusi beberapa command secara berturut turut, hal itu membuat kita harus menunggu command pertama baru command berikutnya, dengan adanya shell script kita tidak perlu menunggu lagi dan hanya menuliskan apa saja yang dilakukan sesuai urutan dan kemudian dieksekusi.

## TASK

**TASK 1**

**Basic Command**

***1. Cal*** 

- Dalam format dasarnya, perintah cal mencetak bulan saat ini dan menyoroti hari ini.

***2. Date*** 

- perintah Date digunakan untuk menampilkan tanggal dan waktu sistem.

**File System command**

***1. Touch*** 

- touch membuat file kosong. 
- nano nama_file untuk membuat file
- tanda > menuliskan konten
- tanda >> menambahkan konten lagi (baris saja)

***2. Cat*** 

- cat namafile melihat isi file

***3. cp commands*** 

- cp sumber_file_tujuan : mencopy folder

***4. mv commands*** 

- mv memindahkan folder

***5. rm*** 

- rm -f namafile menghapus file

***6. mkdir*** 

- mkdir untuk membuat folder baru. rmdir untuk menhapus folder.

***8. cd Command*** 

- Cd untuk masuk kedalam direktori. cd .. untuk balik ke direktori sebelumnya.

***9. pwd Command*** 

- pwd kita berada di direktori apa sekarang.



***Process Control Commands***

***1. Top*** 

TOP akan menampilkan layar penuh informasi tentang proses yang berjalan pada sistem, serta beberapa informasi keseluruhan tentang sistem. Ini termasuk rata-rata beban, jumlah proses, status CPU, informasi memori bebas, dan detail tentang proses termasuk PID, pengguna, prioritas, informasi penggunaan CPU dan memori, waktu berjalan, dan nama program.
top itu akan menampilkan proses aktif lengkap, cpu dan memori informasi.

***2. Clear*** 

- Perintah clear di Linux fungsinya untuk membersihkan layar terminal.

***3. History*** 

- Perintah history memungkinkan Anda untuk menghapus daftar riwayat lengkap atau menghapus bagian-bagian tertentu.

**UTILITIES Program Commands**

***1. Ls*** 
ls atau list menampilkan isi idealis isi dari sebuah
direktori. dimana ada ls -l untuk menampilkan lebih detail isi direktori seperti permission, jam dan tanggal berapa dibuat. 

file dengan awalan . merupakan file tersembunyi ssehingga tidak dapat dilihat dengan ls -l namun dapat dilihat dengan ls -al yang artinya semua.

***2. Which command*** 

- which untuk menemukan path lengkap

***3. Sudo command*** 

- sudo su command-line interface pada Linux yang fungsinya untuk perizinan perintah untuk masuk ke Superuser sudo. 


- r = 4 w = 2 x = 1, tanda # artinya sudah root (superuser) $ sesi user biasa

- Biasanya kalau user biasa aksesnya terbatas, misalkan untuk menjalankan service atau untuk mengedit karena haknya user biasa tapi kalau root memang full access ya Nah Oleh karena itu kita misalnya mengkonfigurasi file, menjalankan perintah.

***5. Find command*** 

- Cari semua file yang mengandung nama file1.txt didalam direktori saat ini.

- Mencari semua file dibawah direktori /home dengan nama file1.txt.

- Mencari semua direktori berdasarkan nama folder3 di direktori “/”.


***File Access Permission***

***1. Chmod*** 

chmod mengubah akses permission suatu folder ataupun file

***2. Chown***

chown jika pengen web server yang bisa akses www-data.www-data
tidak ada user, grup tidak ada nobody.nogroup agar semua orang bisa mengakses.