<?php

include 'koneksi.php';

$response = array();

if($_SERVER['REQUEST_METHOD'] == 'POST'){

	$id_pesan = (int)$_POST["id_pesanan"];
	$total_penjualan = (int)$_POST["total_harga"];
	$tanggal = date('Y-m-d');

	
		$perintah = "INSERT INTO laporan_keuangan (id_pesan,total_penjualan,tanggal) VALUES (	$id_pesan,$total_penjualan,'$tanggal')";

		$perintah2 = "UPDATE pesanan SET status = 'Sudah Diterima' WHERE id_pesan = '$id_pesan'";

		$eksekusi = mysqli_query($konek,$perintah);
		$cek = mysqli_affected_rows($konek);

		$eksekusi2 = mysqli_query($konek,$perintah2);
		$cek2 = mysqli_affected_rows($konek);

		if($cek>0 && $cek2>0){
			$response["kode"] = 1;
			$response["pesan"] = "Terimakasih sudah berbelanja di Toko Sipahutar";
		}else{
			$response["kode"] = 0;
			$response["pesan"] = "Gagal Menerima Pesanan";
		}
	
}else{
	$response["kode"] = 0;
	$response["pesan"] = "Tidak ada POST Laporan";	
}

echo json_encode($response);

mysqli_close($konek)

?>