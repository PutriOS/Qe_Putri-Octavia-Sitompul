<?php

include 'koneksi.php';

$response = array();

if($_SERVER['REQUEST_METHOD'] == 'POST'){

	$id_pesanan = (int)$_POST["id_pesanan"];

	$perintah = "SELECT pesanan.*,tb.nama_barang,tp.alamat,tp.nama FROM pesanan JOIN barang tb ON pesanan.id_barang = tb.id_barang join pembeli tp on pesanan.id_pembeli = tp.id_pembeli WHERE pesanan.id_pesan=$id_pesanan";
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
		$F["nama"] = $ambil->nama;
		$F["jumlah"] = $ambil->jumlah;
		$F["total_harga"] = $ambil->total_harga;
		$F["status"] = $ambil->status;
		$F["nama_barang"] = $ambil->nama_barang;
		$F["alamat"] = $ambil->alamat;

		array_push($response["data"],$F);
	}
	}else{
		$response["kode"] = 0;
		$response["pesan"] = "Data Tidak Tersedia 😭";
	}

}else{
	$response["kode"] = 0;
	$response["pesan"] = "Tidak ada POST data 😭😭";	
}

echo json_encode($response);

mysqli_close($konek)

?>