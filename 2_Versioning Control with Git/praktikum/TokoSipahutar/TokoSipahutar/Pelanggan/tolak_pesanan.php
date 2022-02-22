<?php

include 'koneksi.php';

$response = array();

if($_SERVER['REQUEST_METHOD'] == 'POST'){

	$id_pesan = (int)$_POST["id_pesanan"];
	$id_barang = (int)$_POST["id_barang"];
	$stok = (int)$_POST["stok"];
	$jumlah = (int)$_POST["jumlah"];
	
	$tmbhStok = (int)($stok+$jumlah);

	
		$perintah = "DELETE FROM pesanan where id_pesan = $id_pesan";

		$perintah2 = "UPDATE barang SET stok = $tmbhStok WHERE id_barang = $id_barang";

		$eksekusi = mysqli_query($konek,$perintah);
		$cek = mysqli_affected_rows($konek);

		$eksekusi2 = mysqli_query($konek,$perintah2);
		$cek2 = mysqli_affected_rows($konek);

		if($cek>0 && $cek2>0){
			$response["kode"] = 1;
			$response["pesan"] = "Terimakasih sudah berbelanja di Toko Sipahutar";
		}else{
			$response["kode"] = 0;
			$response["pesan"] = "Gagal Menolak Pesanan";
		}
	
}else{
	$response["kode"] = 0;
	$response["pesan"] = "Tidak ada POST Laporan";	
}

echo json_encode($response);

mysqli_close($konek)

?>