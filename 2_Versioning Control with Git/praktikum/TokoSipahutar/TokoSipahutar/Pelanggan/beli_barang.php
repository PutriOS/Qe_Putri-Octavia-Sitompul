<?php

include 'koneksi.php';

$response = array();

if($_SERVER['REQUEST_METHOD'] == 'POST'){

	$id_barang = (int)$_POST["id_barang"];
	$id_pembeli = (int)$_POST["id_pembeli"];
	$stok = (int)$_POST["stok"];
	$jumlah = (int)$_POST["jumlah"];
	$harga = (int)$_POST["harga"];

	$total_harga = $jumlah * $harga;
	$stok_barang = $stok - $jumlah;


	if($jumlah > 0 && $jumlah < $stok){
		$perintah = "INSERT INTO pesanan (id_barang,id_pembeli,jumlah,total_harga,status) VALUES ($id_barang,$id_pembeli,$jumlah,$total_harga,'Belum Diterima')";

		$perintah2 = "UPDATE barang SET stok = $stok_barang WHERE id_barang = '$id_barang'";

		$eksekusi = mysqli_query($konek,$perintah);
		$cek = mysqli_affected_rows($konek);

		$eksekusi2 = mysqli_query($konek,$perintah2);
		$cek2 = mysqli_affected_rows($konek);

		if($cek>0 && $cek2>0){
			$response["kode"] = 1;
			$response["pesan"] = "Barang Berhasil Dibeli";
		}else{
			$response["kode"] = 0;
			$response["pesan"] = "Gagal Membeli Barang";
		}
	}else if($jumlah < 0){
		$response["kode"] = 2;
		$response["pesan"] = "Minimal Pembelian adalah 1";	
	}else if($stok < $jumlah){
		$response["kode"] = 3;
		$response["pesan"] = "Stok kurang memenuhi";	
	}
}else{
	$response["kode"] = 0;
	$response["pesan"] = "Tidak ada POST data";	
}

echo json_encode($response);

mysqli_close($konek)

?>