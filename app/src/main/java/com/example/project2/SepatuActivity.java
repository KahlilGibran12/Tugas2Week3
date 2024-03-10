package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SepatuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sepatu);

        CardView crdSepatu1 = findViewById(R.id.crdSepatu1);
        crdSepatu1.setOnClickListener(this);
        CardView crdSepatu2 = findViewById(R.id.crdSepatu2);
        crdSepatu2.setOnClickListener(this);
        CardView crdSepatu3 = findViewById(R.id.crdSepatu3);
        crdSepatu3.setOnClickListener(this);
        CardView crdSepatu4 = findViewById(R.id.crdSepatu4);
        crdSepatu4.setOnClickListener(this);
        CardView crdSepatu5 = findViewById(R.id.crdSepatu5);
        crdSepatu5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(SepatuActivity.this, DetailActivity.class);
        // Mengidentifikasi CardView yang diklik
        if (v.getId() == R.id.crdSepatu1) {
            intent.putExtra("cardId", 1);
            intent.putExtra("imageId", R.drawable.sepatu1); // Ganti dengan ID gambar yang sesuai
            intent.putExtra("cardInfo", "Sepatu High\n \n • Kualitas : SUPER PREMIUM •\n  • Grade original / 1:1 original Quality •\n  • Import : Made in Indonesia •\n  • Material : Lak •\n Harga : Rp. 750.000 ");
        } else if (v.getId() == R.id.crdSepatu2) {
            intent.putExtra("cardId", 2);
            intent.putExtra("imageId", R.drawable.sepatu2); // Ganti dengan ID gambar yang sesuai
            intent.putExtra("cardInfo", "Sepatu High\n \n • Kualitas : SUPER PREMIUM •\n  • Grade original / 1:1 original Quality •\n  • Import : Made in Indonesia •\n  • Material : Canvas •\n Harga : Rp. 500.000 ");
        } else if (v.getId() == R.id.crdSepatu3) {
            intent.putExtra("cardId", 3);
            intent.putExtra("imageId", R.drawable.sepatu3); // Ganti dengan ID gambar yang sesuai
            intent.putExtra("cardInfo", "Sepatu High\n \n • Kualitas : SUPER PREMIUM •\n  • Grade original / 1:1 original Quality •\n  • Import : Made in Indonesia •\n  • Material : Kulit Suede •\n Harga : Rp. 1.500.000 ");
        } else if (v.getId() == R.id.crdSepatu4) {
            intent.putExtra("cardId", 4);
            intent.putExtra("imageId", R.drawable.sepatu4); // Ganti dengan ID gambar yang sesuai
            intent.putExtra("cardInfo", "Sepatu High\n \n • Kualitas : SUPER PREMIUM •\n  • Grade original / 1:1 original Quality •\n  • Import : Made in Indonesia •\n  • Material : Canvas •\n Harga : Rp. 1.500.000 ");
        } else if (v.getId() == R.id.crdSepatu5) {
            intent.putExtra("cardId", 5);
            intent.putExtra("imageId", R.drawable.sepatu5); // Ganti dengan ID gambar yang sesuai
            intent.putExtra("cardInfo", "Sepatu High\n \n • Kualitas : SUPER PREMIUM •\n  • Grade original / 1:1 original Quality •\n  • Import : Made in Indonesia •\n  • Material : Kulit Suede •\n Harga : Rp. 1.500.000 ");
        }

        startActivity(intent);
    }
}