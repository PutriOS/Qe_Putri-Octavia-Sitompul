# (11) Iterable Data Structure

## resume

**Iterable**

- "Iterable" diperkenalkan untuk dapat digunakan dalam loop "foreach". Kelas yang mengimplementasikan antarmuka Iterable dapat diulangi.

- Antarmuka Iterable memiliki satu metode iterator(). 
  
**Iterator**

- Iterator adalah kelas yang mengelola iterasi di atas Iterable. Itu mempertahankan keadaan di mana kita berada dalam iterasi saat ini, dan tahu apa elemen berikutnya dan bagaimana mendapatkannya.

**Collections**

- Setiap kelompok objek individu yang direpresentasikan sebagai satu unit dikenal sebagai kumpulan objek.

**List**

- Antarmuka Daftar menyediakan cara untuk menyimpan koleksi yang dipesan. Ini adalah antarmuka anak Collection.

- Ini adalah kumpulan objek yang dipesan di mana nilai duplikat dapat disimpan. Karena Daftar mempertahankan urutan penyisipan, ini memungkinkan akses posisional dan penyisipan elemen.

**Abstrak List**

- Ini digunakan untuk mengimplementasikan koleksi yang tidak dapat dimodifikasi, di mana seseorang hanya perlu memperluas Kelas Koleksi Abstrak ini dan hanya mengimplementasikan iterator dan metode ukuran.

- Kelas ini menyediakan implementasi kerangka antarmuka Daftar untuk meminimalkan upaya yang diperlukan untuk mengimplementasikan antarmuka ini yang didukung oleh penyimpanan data Akses Acak (seperti larik). Untuk data akses sekuensial (seperti daftar tertaut), AbstractSequentialList harus digunakan dalam preferensi untuk kelas ini.

**Array List**

- Ini memberi kita array dinamis di Jawa. Padahal, ini mungkin lebih lambat dari array standar tetapi dapat membantu dalam program di mana banyak manipulasi dalam array diperlukan.

**Abstrak sequantialist**

- Ini digunakan untuk mengimplementasikan daftar yang tidak dapat dimodifikasi, di mana seseorang hanya perlu memperluas Kelas AbstractList ini dan hanya mengimplementasikan metode get() dan size()

- Kelas ini menyediakan implementasi kerangka antarmuka Daftar untuk meminimalkan upaya yang diperlukan untuk mengimplementasikan antarmuka ini yang didukung oleh penyimpanan data "akses berurutan" (seperti daftar tertaut).

**Linked List**

- linked list terdiri dari node di mana setiap node berisi data dan dan referensi ke node berikutnya dalam daftar.

- Tidak seperti array, data tidak disimpan dalam satu blok memori yang berdekatan dan tidak memiliki ukuran yang tetap.

- Sebaliknya, ini terdiri dari beberapa blok memori di alamat yang berbeda.

**Stack**

- Kelas Stack mewakili tumpukan objek terakhir masuk pertama keluar (LIFO). Ini memperluas kelas Vektor dengan lima operasi yang memungkinkan vektor diperlakukan sebagai tumpukan.

- Operasi push dan pop yang biasa disediakan, serta metode untuk mengintip item teratas pada tumpukan, metode untuk menguji apakah tumpukan kosong, dan metode untuk mencari tumpukan item dan menemukan seberapa jauh adalah dari atas.

- Serangkaian operasi tumpukan LIFO yang lebih lengkap dan konsisten disediakan oleh antarmuka Deque dan implementasinya, yang harus digunakan dalam preferensi untuk kelas ini.

**Hash Set**

- HashSet menyimpan elemen dengan menggunakan mekanisme yang disebut hashing

- HashSet hanya berisi elemen unik. HashSet memungkinkan nilai nol. Kelas HashSet tidak disinkronkan.

- HashSet tidak mempertahankan urutan penyisipan. Di sini, elemen dimasukkan berdasarkan kode hashnya.

- HashSet adalah pendekatan terbaik untuk operasi pencarian. Kapasitas default awal HashSet adalah 16, dan faktor bebannya adalah 0,75.

**LinkedHashSet**

- Kelas Java LinkedHashSet berisi elemen unik hanya seperti HashSet.

- Kelas Java LinkedHashSet menyediakan semua opsional

- Mengatur operasi dan mengizinkan elemen nol.

- Kelas Java LinkedHashSet tidak disinkronkan. Kelas Java LinkedHashSet mempertahankan urutan penyisipan.

**EnumSet**

- EnumSet dapat berisi nilai enum dan semua nilai harus dimiliki oleh enum yang sama

- Itu tidak memungkinkan untuk menambahkan nilai nol, melemparkan, NullPointerException dalam upaya untuk melakukannya Itu tidak aman untuk thread, jadi kami perlu menyinkronkannya secara eksternal jika diperlukan

- Elemen disimpan mengikuti urutan di mana mereka dideklarasikan di enum

- Ini menggunakan iterator gagal-aman yang berfungsi pada salinan, sehingga tidak akan mengeluarkan Pengecualian ConcurrentModification jika koleksi dimodifikasi saat mengulanginya.

**Sorted Set**

- Sebuah Set yang selanjutnya memberikan pemesanan total pada elemen-elemennya.

- Elemen-elemen diurutkan baik dengan menggunakan pengurutan alami atau dengan menggunakan Pembanding. Semua elemen yang dimasukkan ke dalam set yang diurutkan harus mengimplementasikan antarmuka Sebanding.

**Queue**

1. Antrian dapat didefinisikan sebagai daftar terurut yang memungkinkan operasi penyisipan dilakukan di satu ujung yang disebut REAR dan operasi hapus dilakukan di ujung lain yang disebut FRONT.

2. Antrian disebut sebagai daftar First In First Out.

3. Misalnya, orang yang mengantri untuk mendapatkan tiket kereta api membentuk antrian.

**Deque**

- Deque adalah koleksi linier yang mendukung penyisipan dan penghapusan elemen dari kedua ujungnya. Nama 'deque' adalah singkatan dari double-ended queue.