<?php

include 'koneksi.php';

$perintah = "SELECT lp.*,bg.nama_barang,pb.nama,pb.no_tlp
from  laporan_keuangan lp
join pesanan pn on pn.id_pesan = lp.id_pesan
join barang bg on bg.id_barang = pn.id_barang
join pembeli pb on pb.id_pembeli = pn.id_pembeli
order by bg.nama_barang";
$eksekusi = mysqli_query($konek,$perintah);
$cek = mysqli_affected_rows($konek);

$datee=date('d-m-y h:i:s');

if($cek>0){
	$response["kode"] = 1;
	$response["pesan"] = "Data Laporan Tersedia";
	// $response["date"] = $datee; 
	$response["data"] = array();

	while($ambil = mysqli_fetch_object($eksekusi)){
		$F["id_laporan"] = $ambil->id_laporan;
		$F["id_pesan"] = $ambil->id_pesan;
		$F["nama"] = $ambil->nama;
		$F["nama_barang"] = $ambil->nama_barang;
		$F["no_tlp"] = $ambil->no_tlp;
		$F["total_penjualan"] = $ambil->total_penjualan;
		$F["tanggal"] = $ambil->tanggal;

		array_push($response["data"],$F);
	}
}else{
	$response["kode"] = 0;
	$response["pesan"] = "Data Tidak Tersedia!!";
}


echo json_encode($response);
mysqli_close($konek);

?>