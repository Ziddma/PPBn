package com.example.listviewbuah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainBuah extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_buah);

        String nama_buah[]={"Mangga","Pisang","Semangka","salak","Jeruk","Apel","Anggur","Durian"};
        int gambar_buah[]={R.drawable.mangga,R.drawable.pisang,R.drawable.semangka,R.drawable.salak,R.drawable.jeruk,R.drawable.apel,R.drawable.anggur,R.drawable.durian};
        String keterangan[]={"Buah yang mengandung banyak vitamin c, apalagi kalau gratis",
                "Buah yang melengkung mengandung banyak vitamin c, apalagi kalau gratis",
                "Buah semangka merupakan tanaman semusim yang tumbuh merambat hingga mencapai panjang 3-5 meter. Batangnya lunak, bersegi, berambut dan panjangnya mencapai 1,5-5 meter. Daun semangka berseling, bertangkai, helai daunnya lebar dan berbulu, menjari, dengan ujungnya runcing",
                "Salak adalah sejenis palma dengan buah yang biasa dimakan. Ia dikenal juga sebagai sala. Dalam bahasa Inggris disebut salak atau snake fruit, sementara nama ilmiahnya adalah Salacca zalacca. Buah ini disebut snake fruit karena kulitnya mirip dengan sisik ular.",
                "Jeruk adalah salah satu buah paling populer sedunia. Buah ini tumbuh dari pohon jeruk (Citrus x sinensis) dan tergolong ke dalam kelompok buah-buahan sitrus. Asal jeruk masih menjadi misteri hingga kini, tetapi buah tersebut sudah mulai dibudidayakan di Asia bagian selatan sejak ribuan tahun lalu.",
                "Apel merupakan jenis buah-buahan, atau buah yang dihasilkan dari pohon buah apel. Buah apel biasanya berwarna merah kulitnya jika masak dan (siap dimakan), namun bisa juga kulitnya berwarna hijau atau kuning. Kulit buahnya agak lembek dan daging buahnya keras.",
                "Buah bulat atau agak lonjong berukuran +/- 2 cm, berkulit halus, warna beragam, daging buah manis asam, mengandung 2-4 biji.",
                "Durian merupakan tanaman buah berupa pohon. Sebutan durian diduga berasal dari istilah Melayu yaitu dari kata duri yang diberi akhiran -an sehingga menjadi durian."};

        listView=findViewById(R.id.Listdatabuah);
        AdapterBuah adapterBuah=new AdapterBuah(this,nama_buah,gambar_buah,keterangan);
        listView.setAdapter(adapterBuah);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nm_buah=nama_buah[position].toString();
                int gbr_buah = gambar_buah[position];
                String ket= keterangan[position].toString();

                //Toast.makeText(MainBuah.this,""+gbr_buah, Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(MainBuah.this, DetailBuah.class);
                intent.putExtra("namabuah", nm_buah);
                intent.putExtra("gambarbuah", gbr_buah);
                intent.putExtra("keter", ket);
                startActivity(intent);
            }
        });

    }
}