package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SendalActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sendal);

        CardView crdSendal1 = findViewById(R.id.crdSendal1);
        crdSendal1.setOnClickListener(this);
        CardView crdSendal2 = findViewById(R.id.crdSendal2);
        crdSendal2.setOnClickListener(this);
        CardView crdSendal3 = findViewById(R.id.crdSendal3);
        crdSendal3.setOnClickListener(this);
        CardView crdSendal4 = findViewById(R.id.crdSendal4);
        crdSendal4.setOnClickListener(this);
        CardView crdSendal5 = findViewById(R.id.crdSendal5);
        crdSendal5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(SendalActivity.this, DetailActivity.class);
        // Mengidentifikasi CardView yang diklik
        if (v.getId() == R.id.crdSendal1) {
            intent.putExtra("cardId", 1);
            intent.putExtra("imageId", R.drawable.sendal1); // Ganti dengan ID gambar yang sesuai
            intent.putExtra("cardInfo", "Sandal Gunung Pria Light Slippers Sendal Outdoor\n \n • Kualitas : SUPER PREMIUM •\n  • Grade original / 1:1 original Quality •\n  • Import : Made in Indonesia •\n  • Material : Webbing Fabric •\n Harga : Rp. 500.000 ");
        } else if (v.getId() == R.id.crdSendal2) {
            intent.putExtra("cardId", 2);
            intent.putExtra("imageId", R.drawable.sendal2); // Ganti dengan ID gambar yang sesuai
            intent.putExtra("cardInfo", "Sandal jepit pria dewasa distro\n \n • Kualitas : SUPER PREMIUM •\n  • Grade original / 1:1 original Quality •\n  • Import : Made in Indonesia •\n  • Material : Karet •\n Harga : Rp. 250.000 ");
        } else if (v.getId() == R.id.crdSendal3) {
            intent.putExtra("cardId", 3);
            intent.putExtra("imageId", R.drawable.sendal3); // Ganti dengan ID gambar yang sesuai
            intent.putExtra("cardInfo", "Sandal Kamar Mandi Tebal Empuk Anti Slip\n \n • Kualitas : SUPER PREMIUM •\n  • Grade original / 1:1 original Quality •\n  • Import : Made in Indonesia •\n  • Material : Rubber •\n Harga : Rp. 75.000 ");
        } else if (v.getId() == R.id.crdSendal4) {
            intent.putExtra("cardId", 4);
            intent.putExtra("imageId", R.drawable.sendal4); // Ganti dengan ID gambar yang sesuai
            intent.putExtra("cardInfo", "Sandal casual New Era MB-E1253\n \n • Kualitas : SUPER PREMIUM •\n  • Grade original / 1:1 original Quality •\n  • Import : Made in Indonesia •\n  • Material : Ethylene Vinyl Acetate •\n Harga : Rp. 50.000 ");
        } else if (v.getId() == R.id.crdSendal5) {
            intent.putExtra("cardId", 5);
            intent.putExtra("imageId", R.drawable.sendal5); // Ganti dengan ID gambar yang sesuai
            intent.putExtra("cardInfo", "Antarestar – Sendal Gunung Struggle\n \n • Kualitas : SUPER PREMIUM •\n  • Grade original / 1:1 original Quality •\n  • Import : Made in Indonesia •\n  • Material : Polivinil Clorida •\n Harga : Rp. 100.000 ");
        }

        startActivity(intent);
    }
}