# (23) Understanding Jmeter Results

**Quick Analyze**

**Case 1**

- Response Time : Rendah (LOW)

- Throughput : Rendah (LOW)

- Conclude : Kasus ini tidak pernah terjadi.

**Case 2**

- Response Time : Rendah (LOW)

- Throughput : Tinggi (HIGH)

- Conclude : Ketika laporan menunjukkan bahwa waktu Respons rendah dan Throughput sangat tinggi. Itu berarti Server bekerja dengan sangat baik. Tes kinerja lulus atau Anda dapat mempertimbangkan untuk menambah beban dan terus mencari tahu batasan Server

**Case 3**

- Response Time : Tinggi (HIGH)

- Throughput : Rendah (LOW)

- Conclude : Ketika kami menemukan skenario di mana waktu Respons untuk permintaan tinggi tetapi Throughput jauh lebih rendah Ini menandakan bahwa Server tidak cukup mampu untuk mempertahankan/mengeksekusi permintaan. Yang meminta penyetelan di sisi server


**Case 4**

- Response Time : Tinggi (HIGH)

- Throughput : Tinggi (HIGH)

- Conclude : Ketika waktu Respon tinggi tetapi Throughput dibandingkan dengan Waktu respons jauh lebih tinggi Ini menyiratkan bahwa permintaan memakan waktu lebih lama karena kesalahan dalam aplikasi, mungkin skripnya tidak cukup baik. 
Kita tidak boleh menyalahkan waktu pemrosesan server untuk ini. 
Sekarang saatnya untuk mempertimbangkan faktor-faktor lain dan menyesuaikannya untuk membuat kinerja aplikasi lebih baik.