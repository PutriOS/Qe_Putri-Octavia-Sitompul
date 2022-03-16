# (14) Pengenalan RESTful API

## Resume

- API adalah singkatan untuk "Application Programming Interface". API memungkinkan komunikasi dan pertukaran. sedangkan REST merupakan singkatan dari ("Representational State Transfer").

**HTTP Response Code :** 

- 200+ berarti permintaan telah berhasil.

- 300+ berarti permintaan dialihkan ke URL lain.

- 400+ berarti telah terjadi kesalahan yang berasal dari klien.

- 401 Unauthorized.

- 404 Not Found.

- 405 Method not allowed.

- 500+ berarti telah terjadi kesalahan yang berasal dari server.


**Rest API Component :**
  
1. Method 

**GET**

- Permintaan ini digunakan untuk mendapatkan sumber daya dari server. Jika  melakukan permintaan GET, server mencari data yang Anda minta dan mengirimkannya kembali kepada Anda. Permintaan GET melakukan operasi READ. Ini adalah metode permintaan default.


**POST**
  
- Permintaan ini digunakan untuk membuat sumber daya baru di server. Jika Anda melakukan permintaan POST, server membuat entri baru dalam database dan memberi tahu Anda apakah pembuatannya berhasil. Dengan kata lain, permintaan POST` melakukan operasi CREATE.


**PUT dan PATCH**

- Kedua permintaan ini digunakan untuk memperbarui sumber daya di server. Jika Anda melakukan permintaan PUT atau PATCH, server memperbarui entri dalam database dan memberi tahu Anda apakah pembaruan berhasil. Dengan kata lain, permintaan PUT atau PATCH melakukan operasi UPDATE.


**DELETE**
  
- Permintaan ini digunakan untuk menghapus sumber daya dari server. Jika Anda melakukan permintaan DELETE, server menghapus entri dalam database dan memberi tahu Anda apakah penghapusan berhasil. Dengan kata lain, permintaan DELETE melakukan operasi DELETE.

2. Header

- Header digunakan untuk memberikan informasi kepada klien dan server. Ini dapat digunakan untuk berbagai tujuan, seperti otentikasi dan memberikan informasi tentang konten isi.

- Header HTTP adalah pasangan nilai properti yang dipisahkan oleh titik dua. Contoh : **"Content-Type: application/json". Missing the opening ".** 

3. URL

- URL adalah bagaimana Anda mengidentifikasi hal-hal yang ingin Anda operasikan. Kita katakan bahwa setiap URL mengidentifikasi sumber daya. Ini adalah URL yang sama persis yang ditugaskan untuk halaman web. 

4. Body

- Data (terkadang disebut “body” atau “message”) berisi informasi yang ingin Anda kirimkan ke server. Opsi ini hanya digunakan dengan POST, PUT, PATCH atau DELETE permintaan.


**kind of API Testing**

1. Functionality : memvalidasi suatu fitur apakah sudah berfungsi atau belum.


2. Load Test : menguji kekuatan sesuatu sistem apakah mampu mengolah data dari beban yang diberikan.


3. Security : Menguji keamanan untuk suatu sistem.


## TASK

https://docs.google.com/document/d/1hoNcbv4eIuD2wXAd2QtECKKUwd5pzBwAnZiw5AUo7_A/edit?usp=sharing