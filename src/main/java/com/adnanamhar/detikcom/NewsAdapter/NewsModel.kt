package com.adnanamhar.detikcom.NewsAdapter

import com.adnanamhar.detikcom.R
import kotlinx.android.synthetic.main.lay_berita.*

data class news(var title : String,var desc: String,var photo: Int,var deskripsi : String)

object NewsModel {
    val newslist = listOf<news>(
        news("Pasar Ramai Dikunjungi Warga Meskipun Wabah Covid-19 Belum Dinyatakan Usai",
            "Detikcom | 1 Jam yang lalu",
        R.drawable.img_news1,""),

        news("Kapal Nelayan Menyalurkan Bansos Masyarakat Sulawesi",
        "Detikcom | 1 Jam yang lalu",
        R.drawable.img_news2,""),

        news("Macet Mulai Terjadi di Wilayah Jalur Pemudik Semarang",
        "Detikcom | 2 Jam yang lalu",
        R.drawable.img_news3,""),

        news("Jelang New Normal Jakarta Macet Lagi",
        "Detikcom | 2 Jam yang lalu",
        R.drawable.img_news4,""),

        news("Dukung Indonesia Perangi Covid-19,Sampoerna Donasi Ventilator dan APD Fullset",
        "Detikcom | 4 Jam yang lalu",
        R.drawable.img_news5,""),

        news("Saat Risma Jelaskan Soal Penanganan Corona  Pada Kepala BNPB dan Menkes",
        "Detikcom | 5 Jam yang lalu",
        R.drawable.img_news6,""),

        news("Banjir Kritik ke Trump yang Kerahkan Militer usai Demo George Floyd",
        "Detikcom | 6 Jam yang lalu",
        R.drawable.img_news7,""),

        news("Mengapa Aksi Demo Damai Kasus George Floyd bisa Berubah Jadi Kerusuhan",
        "Detikcom | 8 Jam yang lalu",
        R.drawable.img_news8,""),

        news("2 Opsi Bagi Calon Jama'ah Haji yang Tidak Jadi Berangkat Tahun Ini",
        "Detikcom | 9 Jam yang lalu",
        R.drawable.img_news9,"")
    )

}