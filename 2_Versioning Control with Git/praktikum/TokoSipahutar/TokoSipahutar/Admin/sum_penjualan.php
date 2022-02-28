<?php

include 'koneksi.php';

$perintah = "SELECT SUM(lp.total_penjualan) 'total_laporan' FROM laporan_keuangan lp";
$eksekusi = mysqli_query($konek,$perintah);
$cek = mysqli_affected_rows($konek);

$datee=date('d-m-y h:i:s');

if($cek>0){
	$response["kode"] = 1;
	$response["pesan"] = "Data Tersedia dong ❤️";
	// $response["date"] = $datee; 
	$response["data"] = array();

	while($ambil = mysqli_fetch_object($eksekusi)){
		$F["total_laporan"] = $ambil->total_laporan;

		array_push($response["data"],$F);
	}
	}else{
	$response["kode"] = 0;
	$response["pesan"] = "Data Tidak Tersedia 😭";
}


echo json_encode($response);
mysqli_close($konek);

?>