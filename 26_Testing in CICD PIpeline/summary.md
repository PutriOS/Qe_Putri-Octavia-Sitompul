# (26) Testing in CI/CD Pipeline

## Resume

**Continuous Integration**

• Continuous Integration adalah praktik mengintegrasikan kode ke dalam repositori bersama dan membangun/menguji setiap perubahan secara otomatis, sedini mungkin - biasanya beberapa kali sehari.

• Paling baik dicapai melalui integrasi dengan kontrol versi

**Continuous Delivery/Deployment**

• Continuous Delivery menambahkan bahwa perangkat lunak dapat dirilis ke produksi kapan saja, seringkali dengan secara otomatis mendorong perubahan ke sistem staging.

• Continuous Deployment melangkah lebih jauh dan mendorong perubahan ke produksi secara otomatis

**Delivery vs Deployment**

**Continuous Delivery**

• Secara otomatis menyiapkan dan melacak rilis ke produksi

• Hasil yang diinginkan adalah siapa pun dengan hak istimewa yang memadai untuk menerapkan rilis baru dapat melakukannya kapan saja dalam satu atau beberapa klik. Dengan menghilangkan hampir semua tugas manual, pengembang menjadi lebih produktif

**Continuous Deployment**

• Setiap perubahan dalam kode sumber disebarkan ke produksi secara otomatis, tanpa persetujuan eksplisit dari pengembang

• Asalkan lolos quality control

**Apa yang membuat CI bagus ?**

• Tahap Terpisah : Setiap langkah dalam CI harus melakukan tugas tunggal yang terfokus

• Dapat diulang : 

    - Otomatis dengan cara yang dapat diulang secara konsisten
  
    - Alat harus bekerja untuk pengembang lokal juga

• Cepat Gagal : Gagal pada tanda pertama masalah

**Apa yang membuat CD Bagus ?**

• Desain dengan mempertimbangkan sistem 

    - Mencakup sebanyak mungkin bagian penerapan, seperti: Aplikasi, Infrastruktur, Konfigurasi, Data

• Pipelines

    - Terus tingkatkan kepercayaan diri saat Anda bergerak menuju produksi

• Versi Unik Secara Global

    - Ketahui status sistem kapan saja

    - Mampu menunjukkan perbedaan antara keadaan saat ini dan masa depan


**CI / CD Process :**

1. Commit
2. Build
3. Test
4. Deploy

**Manfaat menerapkan CI :**

1. MENDETEKSI BUG DI TAHAP AWAL

2. MENGURANGI JUMLAH BUG

3. PROSES PENGEMBANGAN LEBIH TRANSPARAN

4. EFISIEN

**Manfaat menerapkan CD**

1. MENGURANGI RISIKO

2. MENGURANGI BIAYA

3. PAINLESS DEPLOYMENT

4. PROSES OTOMATIS DAN TRANSPARAN

5. RELEASE LEBIH SERING


**Continuous Integration Costs**

1. SERVER UNTUK UJI OTOMATIS

2. GABUNGKAN KODE SECEPAT MUNGKIN

3. TES MENULIS OTOMATIS


**CI/CD TOOLS :**

**1. JENKINS**

- Jenkins adalah alat otomatisasi sumber terbuka yang ditulis dalam Java dengan plugin yang dibuat untuk integrasi berkelanjutan.

**2. GITLAB CI**

- GitLab CI (Continuous Integration) adalah bagian dari GitLab yang mengelola proyek dan antarmuka pengguna dan memungkinkan pengujian unit pada setiap komit dan menunjukkan dengan pesan peringatan ketika ada kegagalan pembangunan.

**3. ATLASSIAN BAMBOO**

- Atlassian Bamboo adalah server build integrasi berkelanjutan yang melakukan build, pengujian, dan rilis otomatis di satu tempat.

**4. Circle CI**

- Circle CI adalah alat CI fleksibel yang berjalan di lingkungan apa pun seperti aplikasi seluler lintas platform, server API Python, atau cluster Docker. Alat ini mengurangi bug dan meningkatkan kualitas aplikasi.

**5. AWS CODEBUILD**

- AWS Codebuild adalah alat CI/CD yang memungkinkan pengembang membangun dan menguji kode dalam skala berkelanjutan.

**6. AZURE DEVOPS**

- Azure Devops adalah alat CI/CD yang dapat diandalkan untuk perencanaan, pengujian, penerapan, atau pendistribusian. Alat ini dibuat oleh Microsoft.

**7. TRAVIS CI**

- Travis CI adalah Cl pertama sebagai alat Layanan. Ini memperkenalkan pendekatan baru untuk membangun kode di cloud. Alat CI ini memungkinkan pengguna untuk mendaftar, menautkan repositori mereka, membangun, serta menguji aplikasi mereka.

**8. GITHUB ACTIONS**

- GitHub Actions adalah platform continuous integration dan continuous delivery (CI/CD) yang memungkinkan Anda untuk mengotomatiskan build, pengujian, dan pipeline penerapan Anda.


**Components Of Github Actions :**

**1. WORKFLOWS**

- Workflows adalah proses otomatis yang dapat dikonfigurasi yang akan menjalankan satu atau lebih pekerjaan. Alur kerja ditentukan oleh file YAML yang diperiksa di repositori Anda dan akan berjalan saat dipicu oleh suatu peristiwa di repositori Anda, atau bisa dipicu secara manual, atau pada jadwal yang ditentukan.

**2. EVENTS**

- Events adalah aktivitas spesifik dalam repositori yang memicu alur kerja berjalan. Misalnya, aktivitas dapat berasal dari GitHub saat seseorang membuat permintaan tarik, membuka masalah, atau mendorong komit ke repositori.

**3. RUNNER**

- Runner adalah server yang menjalankan alur kerja Anda saat dipicu. Setiap pelari dapat menjalankan satu pekerjaan pada satu waktu. GitHub menyediakan Ubuntu Linux, Microsoft Windows, dan runner macOS untuk menjalankan alur kerja Anda.

**4. JOBS**

- Jobs adalah serangkaian langkah dalam alur kerja yang dijalankan pada runner yang sama. Setiap langkah adalah skrip shell yang akan dieksekusi, atau tindakan yang akan dijalankan. Langkah-langkah dijalankan secara berurutan dan saling bergantung satu sama lain. Karena setiap langkah dijalankan pada pelari yang sama, Anda dapat berbagi data dari satu langkah ke langkah lainnya

**5. ACTIONS**

- Action adalah aplikasi kustom untuk platform GitHub Actions yang melakukan tugas yang kompleks namun sering diulang. Gunakan tindakan untuk membantu mengurangi jumlah kode berulang yang Anda tulis di file alur kerja Anda.