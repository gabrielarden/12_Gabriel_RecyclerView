package com.example.a12_gabriel_recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion  object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Gotei13List = listOf<Gotei13>(
            Gotei13(
                R.drawable.divisisatulogo,
                "Divisi 1",
                "Divisi 1 (一番隊, ichiban-tai) adalah salah satu bagian dari Gotei 13, dipimpin oleh Kapten Genryūsai Shigekuni Yamamoto. Divisi 1 adalah Divisi tertinggi di Gotei 13 karena terdapat jendral sekaligus kapten."
            ),
            Gotei13(
                R.drawable.divisidualogo,
                "Divisi 2",
                "Divisi 2 (二番隊, nibantai) adalah salah satu bagian dari Gotei 13, dipimpin oleh Kapten Suì-Fēng. Karena Kapten Divisi 2 juga merangkap memimpin Onmitsukidō(pasukan khusus), tugas Divisi 2 langsung terikat dengan Onmitsukidō, yang masing-masing 5 pemilik kursi teratas bertanggung jawab untuk satu divisi tertentu dari Unit Khusus. Saat ini, dikethui bahwa kapten bertanggung jawab atas Militer Eksekutif, letnannya bertanggung jawab atas Unit Patroli, serta Kursi ke3 bertanggung jawab atas Unit Penahanan."
            ),
            Gotei13(
                R.drawable.divisitigalogo,
                "Divisi 3",
                "Divisi 3 (三番隊, sanbantai) adalah salah satu bagian dari Gotei 13. Divisi 3 dipimpin oleh Kapten Rōjūrō Ōtoribashi. Divisi 3 mengikuti organisasi tradisional dari Divisi Gotei 13. Setelah kematian Gin Ichimaru, Divisi ini berjalan dengan wewenang tertinggi kedua didalam Divisi 3, Letnan Izuru Kira. Kemudian saat kekalahan Sōsuke Aizen, Rōjūrō Ōtoribashi menerima kembali jabatan kapten Divisi 3. Tidak ada tugas khusus yang disebutkan untuk Divisi 3."
            ),
            Gotei13(
                R.drawable.divisiempatlogo,
                "Divisi 4",
                "Divisi 4 (四番隊, yonbantai) adalah salah satu bagian dari Gotei 13, dipimpin oleh Kapten Retsu Unohana. Divisi 4 merupakan satu satunya divisi yang bertugas sebagai Unit Pertolongan Pertama untuk penyembuhan, pengobatan, membersihkan."
            ),
            Gotei13(
                R.drawable.divisilimalogo,
                "Divisi 5",
                "Divisi 5 (五番隊, gobantai) adalah salah satu bagian dari Gotei 13. Divisi 5 dipimpin oleh Kapten Shinji Hirako. Divisi 5 mengikuti organisasi tradisional dari Divisi Gotei 13. Setelah kekalahan Sōsuke Aizen, divisi ini berjalan dengan wewenang tertinggi kedua dalam Divisi 5, yaitu Letnan Momo Hinamori. Kemudian saat setelah kekalahan Aizen, Shinji Hirako sekali lagi menjabat sebagai kapten Divisi 5. Tidak ada tugas khusus yang disebutkan untuk Divisi 5. Anggota divisi ini semuanya berkemampauan tinggi, telah dilatih oleh seorang kapten yang unggul dalam segalanya, termasuk kesiapan untuk bertarung."
            ),
            Gotei13(
                R.drawable.divisienamlogo,
                "Divisi 6",
                "Divisi 6 (六番隊, rokubantai) adalah salah satu bagian dari Gotei 13, dipimpin oleh Kapten Byakuya Kuchiki. Organisasi Divisi enam mengikuti organisasi tradisional dari Gotei 13. Tugas Khusus Tidak ada tugas khusus yang disebutkan untuk Divisi 6. Divisi 6 terlihat seperti sebuah bentuk divisi dari setiap Shinigami dan dikenal karena kepatuhannya terhadap hukum atau aturan. Barak Seperti semua barak yang lain, Barak Divisi 6 adalah kantor dan tempat tinggal dari Shinigami Divisi 6. Kantor Byakuya terkenal karena memiliki rak-rak buku dilapisan dindingnya."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_arya)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = Gotei13Adapter(this, Gotei13List){
            val intent = Intent (this, DetailGotei13Activity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}