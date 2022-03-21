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

![Test Result All Test](https://user-images.githubusercontent.com/94749506/159284687-b2ffde93-1bd0-44df-a48b-65366b910b5e.PNG)

![Functional Covergae Details](https://user-images.githubusercontent.com/94749506/159284604-3512346a-d96c-419f-8d83-f1a10f95c2cc.PNG)


## FEED PAGE

**Post a Document**

![Post a Document](https://user-images.githubusercontent.com/94749506/159284754-e05cf8d7-bbf9-4b30-98de-fe81b53419fd.PNG)

**Post a Photo**

![Post a Photo](https://user-images.githubusercontent.com/94749506/159284762-d509c043-3d09-440c-bafc-dfc005ea9511.PNG)

**Post a vidio**

![Post a vidio](https://user-images.githubusercontent.com/94749506/159284749-4af5dcd6-9a8d-464c-bc0b-5e588d994b32.PNG)

**Search Person**

![Search person](https://user-images.githubusercontent.com/94749506/159285260-5ca16fb2-4324-427b-b9bc-7284e21417e2.PNG)


## JOBS PAGE

**Search Jobs**

![search jobs](https://user-images.githubusercontent.com/94749506/159285177-1ece943c-556c-4e55-a92b-94040affb62a.PNG)

## LOGIN PAGE

**Success Login**

![Success login](https://user-images.githubusercontent.com/94749506/159285333-495624af-a13a-4e2b-b00e-af592094df43.PNG)

**Failed Login with Wrong Password**

![failed login with wrong password](https://user-images.githubusercontent.com/94749506/159285489-accbed4e-0f64-432a-99f4-e4be3b5ce9b0.PNG)


