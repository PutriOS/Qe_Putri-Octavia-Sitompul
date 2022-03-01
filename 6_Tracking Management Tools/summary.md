# (6) Tracking Management Tools

## Resume

### Pengertian
- Tracking Management Tools adalah Sebuah software yang digunakan dalam mengelola suatu proyek atau development software agar bisa berjalan secara efisien dan efektif. Jira dikembangkan oleh atlassian sebagai salah satu alat bantu yang bertujuan untuk pelacakan bugs, issue dan management proyek. 

### Ada beberapa fitur unggulan yang dimiliki oleh JIRA : 

1.	Task assignment
- Adanya fitur task assignment pada jira sendiri dilengkapi dengan antarmuka mengenai workflow yang dijalankan. Hal ini membuat anggota tim bahkan tim lain dapat mengetahui sejauh mana progres dari suatu proyek tersebut.

2.	Scram dan Kanban boards
- Dalam Project management terdapat suatu metode yang dapat digunakan untuk mendapatkan hasil yang maksimal, metode ini disebut Scram dan Kanban. Salah satu keunggulan Jira yang membedakan dengan aplikasi Project management yang lainnya adalah dengan fitur Scram dan Kanban boards, dengan fitur ini suatu tim dapat lebih mudah melakukan brainstorming. Fitur ini cukup intuitive sehingga anggota tim dapat saling berkolaborasi untuk menentukan prioritas kerjanya. Tak hanya itu anggota tim juga dapat mengetahui berbagai masalah dari anggota lainnya yang diperoleh selama berproses.

3.	Roadmaps
- Membuat anggota tim nmengetahui gambaran kedepannya. Dengan adanya anggota tim akan lebih fokus terhadap apa yang dikerjakannya Bahkan dapat memiliki kontrol penuh dengan berbagai pekerjaan yang dilakukan. melalui roadmaps dapat melihat gambaran secara utuh sehingga mempermudah pengambilan keputusan.

4.	Konektivitas dengan fitur yang lain 
- Dukungan untuk berbagi aplikasi ini dapat mempermudah proses pengerjaan suatu proyek. salah satu fitur penting dalam aplikasi Project management adalah adanya Laporan atau reporting. 
- Setelah proyek selesai dikerjakan tetapi juga saat prosesnya, jira memberikan fitur pelaporan dengan visualisasi yang menarik, sehingga mempermudah pemangku kebijakan mengetahui hasilnya. hal ini juga akan mempermudah team leader membuat kebijakan ke depan terhadap pengerjaan suatu projek.


### Panel – panel yang sering digunakan : TO DO - IN PROGRESS – FINISH – DONE - NEED FIX

**TO DO**

- To Do berisi story yang akan dikerjakan dan sudah diprioritaskan saat planning. Story yang ditempatkan paling atas  menandakan bahwa story tsb merupakan story yang paling utama

**In progress**

- In progress merupakan panel yang berisi story yang sedang dikerjakan software engineer atau developer 

**Finish**

- Finish panel yang sudah siap dikerjakan oleh pihak software engineer namun belum siap untuk tahap testing

**Deliver**

- Deliver berisi stroy yang siap untuk memasuki tahap testing oleh quality engineer

**Testing**

- Testing berisi story yang ditesting oleh quality engineer

**Need fix**

- Berisi hasil proses yang tidak lulus kriteria oleh tim development

**Done**

- Berisi story yang sudah lulus kriteria testing oleh tim development 


### 8 point untuk membuat issues: 

1. Project 

- Project dipilih sesuai dengan Issues yang akan dibuat akan ditempatkan di project tersebut.

2. Issues Type

- Issue pada jira akan melacak masalah yang mendasari proyek ataupun bug. 

- Issues Type dibagi menjadi 4 bagian : 
  - Story merupakan jenis issue untuk membuat fitur baru 
  - Task merupakan jenis issue untuk melakukan perincian tugas tugas yang akan dikerjakan
  - Bug merupakan jenis issue digunakan jika terjadi penemuan bug saat software testing oleh tester 
  - Epic merupakan jenis issue untuk pengelompokkan task

3. Reporter

- Reporter merupakan orang yang membuat tugas tersebut.

4. Description

- Menuliskan description dengan jelas menggunakan format yang sama dengan dituliskan pada pivotal tracker.

5. Kondisi Description

- Acceptance Criteria, jika fitur yang dibuat sudah sesuai dengan acceptance criteria yang ditentukan oleh development team.

- Test Implementation, membuat dokumentasi setelah melakukan proses testing (Test Scenario)

6. Priority

- Menentukan priority berdasarkan dari tingkat kesulitan sebuah task atau issue tersebut

7. Assignee

- Menentukan assignee berdasarkan dari orang yang akan bertanggung jawab mengerjakan tugas tersebut.

8. Sprint 

- Menentukan sprint berdasarkan dari ruang waktu pengerjaan sebuah task atau issue. (1 minggu / 2 minggu)


## TASK TEORI

1. **Apa yang dimaksud dengan Bugs?**

- Bug merupakan suatu kesalahan pada suatu perangkat keras atau perangkat lunak komputer yang menyebabkan peralatan atau program itu tidak berfungsi semestinya.

2. **Apa yang dimaksud dengan TODO pada Jira?**

- Todo merupakan panel yang berisi story yang akan dikerjakan dan sudah diprioritaskan saat planning, story paling atas merupakan story yang paling diprioritaskan.

3. **Apa yang dimaksud dengan INPROGRESS pada Jira?**

- In progress pada jira merupakan sebuah panel yang berisi tentang fitur yang sedang dikerjakan oleh developer


4. **Apa perbedaan antara deliver dan finish pada Jira?**

- Perbedaan antara panel finsih dan deliver adalah
Finish adalah panel yang berisi story yang telah selesai dikerjakan developer namun belum siap untuk diuji sementara Deliver merupakan panel untuk story yang berisi fitur yang sudah siap untuk ditesting oleh tester.

5. **Apa yang dimaksud dengan EPIC Pada Jira?**

- Epic merupakan type issue yang digunakan untuk pengelompokan task misalnya seperti login

6.  **Apa yang harus digunakan saat menggunakan tools jira , jika kita menemukan bugs pada fitur yang sudah dilakukan testing?**

- Jika kita menemukan bugs pada fitur yang sudah dilakukan testing, maka perlu kita membuat panel need fix yang menunjukkan suatu fitur perlu untuk diperbaiki kembali oleh developer karena terdapat cacat/bug dalam fitur tersebut, sehingga akan diberikan deskripsi yang menunjukkan kecacatan pada fitur tersebut. 