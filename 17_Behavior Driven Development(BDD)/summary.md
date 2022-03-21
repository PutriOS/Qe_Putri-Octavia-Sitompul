# (17) Behavior Driven Development (BDD)

## Resume

**Behaviour Driven Development** adalah sebuah metode pengembangan yang fokus pada perilaku sistem dimana hal-hal yang Stakeholder/Customer harapkan dapat dilakukan oleh suatu sistem.

- Metode BDD menjembatani gap antara business people and technical people.

- Jika sebuah tim menerapkan metode BDD maka terdapat 3 hal:
 - Context (starting state)
 - Event (apa yang user lakukan)
 - Outcome (apa yang diharapkan)

- Contoh kasus penerapan 3 hal di atas adalah membuat aplikasi PPDB (Penerimaan Peserta Didik Baru) online untuk sebuah SMA X:

**Context (starting state)**

- Terdapat URL web

- Form registrasi

- Kuota registrasi

**Event (apa yang user lakukan)**

- Peserta didik SMP melakukan pendaftaran.

**Outcome (apa yang diharapkan)**

- URL web dapat diakses

- Peserta didik dapat mengisi form registrasi

- Konfirmasi peserta didik SMP sudah terdaftar

- Sistem akan dipastikan mengurangi kuota sebanyak yang mendaftar

- Setelah menerima semacam kriteria sistem seperti di atas, maka tim mulai membuat aplikasi PPDB online sesuai kondisi-kondisi di atas. Karena itu, tim akan melakukan serangkaian behaviour test untuk memastikan aplikasi yang dibangun bekerja seperti yang diharapkan.

**Cucumber**

- Untuk melakukan serangkaian behaviour test, ada sebuah tool yang disebut Cucumber. Cucumber adalah sebuah tool yang mendukung BDD.

- Cucumber membaca semacam ketentuan yang dapat dieksekusi, dimana ditulis menggunakan teks biasa dan ketentuan tersebut memvalidasi bahwa sistem atau aplikasi melakukan apa yang dituliskan dalam ketentuan tersebut. Ketentuan tersebut terdiri dari beberapa skenario.

**Gherkin**

- Skenario-skenario itu ditulis dalam sebuah tata bahasa yang disebut Gherkin. Jadi Gherkin adalah aturan tata bahasa yang membuat teks dengan struktur tertentu dapat dipahami oleh Cucumber.

- Contoh skenario menggunakan Gherkin:

**Scenario**: User want to access PPDB online registration form

**Given** User access the PPDB online website

**When** The PPDB online website is displayed

**Then** User fill all registration form

**Then** User submit the registration data

- Dokumen skenario yang ditulis menggunakan tata bahasa Gherkin tersebut di atas disimpan dengan file berekstensi .feature.

**Kelebihan dari BDD**

- Tingkatkan komunikasi dan kolaborasi

- Memungkinkan semua pemangku kepentingan untuk terlibat dan memiliki pemahaman yang sama dalam pengembangan produk

- Implementasi sistem yang mengutamakan pengguna dan sesuai dengan kebutuhan bisnis

- Dapat beradaptasi dengan cepat terhadap perubahan

- Testing lebih mudah di pahami

**kekurangan dari BDD**

- Dalam proses pengetesan membutuhkan waktu yang lama 

- Jika terjadi permasalah sulit untuk mengetahui akar dari permasalahan 

**Test-driven development (TDD)** adalah proses pengembangan perangkat lunak yang bergantung pada pengulangan siklus pengembangan yang sangat singkat. Persyaratan untuk melakukan sebuah perubahan menjadi kasus uji yang sangat spesifik, maka software yang sedang dikembangkan diharuskan memenuhi test baru. 

- Hal ini bertentangan dengan pengembangan perangkat lunak yang memungkinkan perangkat lunak untuk ditambahkan belum tentu memenuhi persyaratan. Pada proses software development ada beberapa proses yang pasti dilakukan, sehingga terbentuklah iterasi suatu langkah — langkah yang mungkin sudah lazim dilakukan.


# TASK

## TASK SS

![Success login](https://user-images.githubusercontent.com/94749506/159234641-4090f0a9-044c-46d7-87a3-fc8ee00c582d.PNG)

![failed login with wrong password](https://user-images.githubusercontent.com/94749506/159234649-995c7b51-a8d7-49a1-9cab-c74c4a37fdec.PNG)

![Post a Document](https://user-images.githubusercontent.com/94749506/159234652-cf8d8076-e660-4daf-93f8-e25e48d7a8e8.PNG)

![Post a Photo](https://user-images.githubusercontent.com/94749506/159234655-2fc06631-b79f-4a56-88f5-af63464f3f8d.PNG)

![Post a vidio](https://user-images.githubusercontent.com/94749506/159234660-ecbea0f2-c6ef-40c1-9201-6d5fe7f26d6f.PNG)

![search jobs](https://user-images.githubusercontent.com/94749506/159234663-d700fd40-7212-4529-bcc5-7dd60f67e4b5.PNG)

![Search person](https://user-images.githubusercontent.com/94749506/159234669-6c3efaa6-e9fa-45f9-873c-e6994e6bd3aa.PNG)


