# Linux Basic Command

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
- Ls –a menampilkan semua file yang namanya dimulai dengan titik atau yang tersembunyi. Kita bisa mendapatkan lebih banyak informasi dengan menambahkan option sederhana –a. Kita ingin mencoba menampilkan file dalam format panjang dari direktori saat ini, kita perlu mengetikkan path sebagai parameternya cth: ls –a /usr.

**Basic Command**

***1. Cal*** memiliki fungsi untuk menampilkan kalender

***2. Date*** menampilkan tanggal pada zona waktu yang tertera di os kita.


**File System command**

***1. Touch*** : touch adalah perintah dasar Linux yang memperbolehkan Anda membuat file baru yang kosong melalui baris perintah Linux. Sebagai contoh, ketik touch /home/username/Documents/Web.html untuk membuat file HTML berjudul Web di bawah direktori Documents.

***2. Cat*** : cat (akronim dri concatenate) adalah salah satu perintah dasar sistem operasi Linux yang sering digunakan. Perintah ini berfungsi untuk membuat daftar konten atau isi file pada standard output (sdout). Untuk menjalankan command ini, ketik cat yang kemudian diikuti dengan nama dan ekstensi file. Sebagai contoh: cat file.txt. belum ada file untuk membuatnya

***3. cp commands*** : cp untuk menyalin file dari direktori saat ini ke direktori yang berbeda. Misalnya, command cp scenery.jpg /home/username/Pictures untuk membuat salinan scenery.jpg (dari direktori saat ini) ke direktori Pictures.

***4. mv commands*** : Fungsi utama command mv adalah untuk memindahkan file meskipun sebenarnya bisa digunakan untuk mengganti atau mengubah nama file. Argumen yang ada di mv serupa dengan argumen yang ada di perintah cp. Ketik mv, nama file, dan direktori tujuan. Contoh: mv file.txt /home/username/Documents. Untuk mengganti nama file, perintah Linux-nya adalah mv oldname.ext newname.ext.

***5. rm*** : adalah perintah dasar pada Linux yang berfungsi untuk menghapus direktori beserta isinya. Jika hanya ingin menghapus direktorinya saja – alternatif command selain rmdir – gunakan rm -r. Catatan: Saat menggunakan command ini, Anda harus berhati-hati dan cek kembali direktori di mana Anda berada saat ini. Sekali command rm dijalankan, maka semuanya akan terhapus dan tidak bisa dikembalikan.

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

![calender](https://user-images.githubusercontent.com/94749506/156987186-29f90f1b-b9f5-4137-a428-f471da6a2c6c.PNG)

***2. Date*** 

- perintah Date digunakan untuk menampilkan tanggal dan waktu sistem.

![date](https://user-images.githubusercontent.com/94749506/156987204-098106d5-1d6d-45b7-a969-87c32b375b77.png)

**File System command**

***1. Touch*** 

- touch membuat file kosong. 
- nano nama_file untuk membuat file
- tanda > menuliskan konten
- tanda >> menambahkan konten lagi (baris saja)
- 
![touch](https://user-images.githubusercontent.com/94749506/156987220-52c5c67b-6e01-40b7-a5e6-1aae3f1d1a4e.PNG)

***2. Cat*** 

- cat namafile melihat isi file

![cat](https://user-images.githubusercontent.com/94749506/156987254-dfa5dace-3e0b-4d91-9899-cee9fee97ee3.PNG)

***3. cp commands*** 

- cp sumber_file_tujuan : mencopy folder

![cp](https://user-images.githubusercontent.com/94749506/156987285-b35a3c52-5b7b-418a-89ff-1c2f6e852fb5.PNG)

***4. mv commands*** 

- mv memindahkan file ke direktori tujuan

![mv](https://user-images.githubusercontent.com/94749506/156987315-ae42994e-23c4-437c-8feb-0e2697c1b010.PNG)

***5. rm*** 

- rm -f namafile menghapus file

![rm](https://user-images.githubusercontent.com/94749506/156987335-ad847640-a32e-4018-b69f-a03be3ca5af7.PNG)

***6. mkdir*** 

- mkdir untuk membuat folder baru. rmdir untuk menhapus folder.

![mkdir](https://user-images.githubusercontent.com/94749506/156987614-7a7c4a68-4747-4fc9-84db-e82e9a39acc9.PNG)

***8. cd Command*** 

- Cd untuk masuk kedalam direktori. cd .. untuk balik ke direktori sebelumnya.

![cd](https://user-images.githubusercontent.com/94749506/156987644-05161b44-9f98-43ee-9d45-7220baba9294.PNG)

***9. pwd Command*** 

- pwd kita berada di direktori apa sekarang.

![pwd](https://user-images.githubusercontent.com/94749506/156987687-c2a24229-b3e4-44ce-86db-6895620fef40.PNG)

***Process Control Commands***

***1. Top*** 

- TOP akan menampilkan layar penuh informasi tentang proses yang berjalan pada sistem, serta beberapa informasi keseluruhan tentang sistem. Ini termasuk rata-rata beban, jumlah proses, status CPU, informasi memori bebas, dan detail tentang proses termasuk PID, pengguna, prioritas, informasi penggunaan CPU dan memori, waktu berjalan, dan nama program.
top itu akan menampilkan proses aktif lengkap, cpu dan memori informasi.

![top](https://user-images.githubusercontent.com/94749506/156987423-45ab66ea-517c-49a3-b3f5-07a8fd4fa39e.PNG)

***2. Clear*** 

- Perintah clear di Linux fungsinya untuk membersihkan layar terminal.

![clear](https://user-images.githubusercontent.com/94749506/156987469-fd0ea456-730c-4098-856d-7cec688eb013.PNG)

- hasilnya :

![clear2](https://user-images.githubusercontent.com/94749506/156987501-7e89491f-bad7-4754-84d8-efca30e61c0d.PNG)

***3. History*** 

- Perintah history memungkinkan Anda untuk menghapus daftar riwayat lengkap atau menghapus bagian-bagian tertentu.

![History](https://user-images.githubusercontent.com/94749506/156987530-fa983f66-6352-440f-9761-a7529636bf8f.PNG)

**UTILITIES Program Commands**

***1. Ls*** 
- ls atau list menampilkan isi idealis isi dari sebuah
direktori. dimana ada ls -l untuk menampilkan lebih detail isi direktori seperti permission, jam dan tanggal berapa dibuat. file dengan awalan . merupakan file tersembunyi ssehingga tidak dapat dilihat dengan ls -l namun dapat dilihat dengan ls -al yang artinya semua.

![ls](https://user-images.githubusercontent.com/94749506/156987737-51966bb4-96fb-4143-b705-0183f1052fb8.PNG)

***2. Which command*** 

- which untuk menemukan path lengkap

![which](https://user-images.githubusercontent.com/94749506/156987749-4309faef-0185-4916-a92d-538bba286efd.PNG)

***3. Sudo command*** 

- sudo su command-line interface pada Linux yang fungsinya untuk perizinan perintah untuk masuk ke Superuser sudo. 

- r = 4 w = 2 x = 1, tanda # artinya sudah root (superuser) $ sesi user biasa

- Biasanya kalau user biasa aksesnya terbatas, misalkan untuk menjalankan service atau untuk mengedit karena haknya user biasa tapi kalau root memang full access ya Nah Oleh karena itu kita misalnya mengkonfigurasi file, menjalankan perintah.

![sudo](https://user-images.githubusercontent.com/94749506/156987796-bc70bf5c-c292-4bf1-b7f9-7d5bbbece7c3.PNG)

***5. Find command*** 

- Cari semua file yang mengandung nama file1.txt didalam direktori saat ini.

- Mencari semua file dibawah direktori /home dengan nama file1.txt.

- Mencari semua direktori berdasarkan nama folder3 di direktori “/”.

![find1](https://user-images.githubusercontent.com/94749506/156987819-6af4d95e-497d-4482-a4c6-0bd7b1c50913.PNG)

***File Access Permission***

***1. Chmod*** 

- chmod mengubah akses permission suatu folder ataupun file

![chmod2](https://user-images.githubusercontent.com/94749506/156987852-a83a7c97-8d5a-4851-b563-777d1a0552c6.PNG)

***2. Chown***

- chown jika pengen web server yang bisa akses www-data.www-data
- tidak ada user, grup tidak ada nobody.nogroup agar semua orang bisa mengakses.

![Chown](https://user-images.githubusercontent.com/94749506/156987926-18c2fc7c-2818-4a29-9605-e2da4bc726b6.PNG)


**TASK 2**

*Shell Script*

*Program 1*

- Membuat file dengan nano namafile dan mengeksekusi file dengan **./nama_file** atau dengan permission **chmod +x namaa_file** untuk mengeksekusi file.

![program1](https://user-images.githubusercontent.com/94749506/156987963-948961a0-962d-4cb7-bcd5-7011d41b1843.PNG)

- Hasilnya : 

![program11](https://user-images.githubusercontent.com/94749506/156987974-6face353-c3b9-4b62-8876-fcd29fb4d07a.PNG)

*Program 2*

- Menggunakan fungsi **read** untuk membaca inputan dari keyboard.

![program2](https://user-images.githubusercontent.com/94749506/156988042-be327ae4-cab8-4460-ad5b-a7cbeb98ac97.PNG)

- Hasilnya : 

![program22](https://user-images.githubusercontent.com/94749506/156988055-b654e2c4-ce2c-456f-af8e-843c99cb93bc.PNG)

*Program 3*

- Menggunakan fungsi **parameter $**

![program3](https://user-images.githubusercontent.com/94749506/156988202-c678663d-9a72-437b-a428-74b354f93907.PNG)

- Hasilnya : 

![program33](https://user-images.githubusercontent.com/94749506/156988231-a3811b27-5168-41f2-85c6-c09595118b03.PNG)

*Program 4*

- Membuat program perhitungan 
- Adanya fungsi **let** untuk melakukan aritmatika pada variabel shell

![program4](https://user-images.githubusercontent.com/94749506/156988284-85e76283-01bb-4936-87a1-2cb6f3556cc1.PNG)

- Hasilnya :

![program44](https://user-images.githubusercontent.com/94749506/156988300-c2c05023-21f0-4aee-bd6f-f8686f317625.PNG)

*Program 5*

- Membuat program perbandingan dengan menggunakan **if** dan **-ge** artinya Lebih besar dari atau sama dengan.

![program5](https://user-images.githubusercontent.com/94749506/156988324-48b4fbd8-0153-4425-aa83-a11e41d1b8d4.PNG)

- Hasilnya : 

![program55](https://user-images.githubusercontent.com/94749506/156988340-e633e042-ca7c-42cf-85ce-97203e9752c5.PNG)

*Program 6*

- Membuat program perulangan menggunakan **for**.

![program66](https://user-images.githubusercontent.com/94749506/156989247-b99764c1-2f16-4a90-801a-1c24e7d460cd.PNG)

- Hasilnya : 

![program6](https://user-images.githubusercontent.com/94749506/156989263-3f0adae3-d498-4c35-be08-8bd430dadd35.PNG)

*Variabel*

![variabel](https://user-images.githubusercontent.com/94749506/156988792-20c90bfb-737c-4630-9ed0-277282eef930.PNG)


