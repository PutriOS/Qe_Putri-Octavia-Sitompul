<?php

include 'koneksi.php';

// $perintah = "SELECT pesanan.*,tb.nama_barang,tp.alamat FROM pesanan JOIN barang tb ON pesanan.id_barang = tb.id_barang join pembeli tp on pesanan.id_pembeli = tp.id_pembeli";

$perintah = "SELECT * FROM pesanan";

$eksekusi = mysqli_query($konek,$perintah);
$cek = mysqli_affected_rows($konek);


if($cek>0){
	$response["kode"] = 1;
	$response["pesan"] = "Data Pesanan Tersedia";
	$response["data"] = array();

	while($ambil = mysqli_fetch_object($eksekusi)){
		$F["id_pembeli"] = $ambil->id_pembeli;
		$F["id_pesan"] = $ambil->id_pesan;
		$F["id_barang"] = $ambil->id_barang;
		$F["jumlah"] = $ambil->jumlah;
		$F["total_harga"] = $ambil->total_harga;
		$F["status"] = $ambil->status;

		array_push($response["data"],$F);
	}
}else{
	$response["kode"] = 0;
	$response["pesan"] = "Data Pesanan Tidak Tersedia";
}

echo json_encode($response);
mysqli_close($konek);

?>