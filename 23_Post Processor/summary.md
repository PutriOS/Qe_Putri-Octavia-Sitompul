# (23) Post Processor

## Summary

**Apa itu Post Processor?**

- Elemen rencana pengujian yang digunakan untuk melakukan tindakan tertentu setelah pemrosesan permintaan sampler. Pemroses pos ini biasanya digunakan untuk mengekstrak nilai tertentu dari respons permintaan sampler.

-  misalnya  kita dapat mengekstrak nilai variabel sesi dari permintaan HTTP dan meneruskan nilai variabel sesi ke permintaan berikutnya.

**Json Path**

- Digunakan untuk ekstrak isi dari json response 

- Beberapa ekspresi yang umum digunakan :

- **$** =elemen akar

- **.=** operator anak (objek)

- **[]** = operator anak (array)

- **..** = recursive descent (langsung ke objek)

- * = wildcard (semua hal)

- **[start:end]** = operator irisan array dipinjam