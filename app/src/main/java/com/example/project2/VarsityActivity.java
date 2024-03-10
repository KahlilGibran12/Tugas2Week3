package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VarsityActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varsity);

        CardView crdVarsity1 = findViewById(R.id.crdVarsity1);
        crdVarsity1.setOnClickListener(this);
        CardView crdVarsity2= findViewById(R.id.crdVarsity2);
        crdVarsity2.setOnClickListener(this);
        CardView crdVarsity3 = findViewById(R.id.crdVarsity3);
        crdVarsity3.setOnClickListener(this);
        CardView crdVarsity4 = findViewById(R.id.crdVarsity4);
        crdVarsity4.setOnClickListener(this);
        CardView crdVarsity5= findViewById(R.id.crdVarsity5);
        crdVarsity5.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(VarsityActivity.this, DetailActivity.class);
        // Mengidentifikasi CardView yang diklik
        if (v.getId() == R.id.crdVarsity1) {
            intent.putExtra("cardId", 1);
            intent.putExtra("imageId", R.drawable.varsity1); // Ganti dengan ID gambar yang sesuai
            intent.putExtra("cardInfo", "Varsity Ap Bren\n \n • Kualitas : SUPER PREMIUM •\n  • Grade original / 1:1 original Quality •\n  • Import : Made in philippines •\n  • Material : Kain Baby Terry •\n Harga : 1.500.000 ");
        } else if (v.getId() == R.id.crdVarsity2) {
            intent.putExtra("cardId", 2);
            intent.putExtra("imageId", R.drawable.varsity2); // Ganti dengan ID gambar yang sesuai
            intent.putExtra("cardInfo", "Varsity Echo\n \n • Kualitas : SUPER PREMIUM •\n  • Grade original / 1:1 original Quality •\n  • Import : Made in philippines •\n  • Material : Kain Baby Terry •\n Harga : 1.500.000 ");
        } else if (v.getId() == R.id.crdVarsity3) {
            intent.putExtra("cardId", 3);
            intent.putExtra("imageId", R.drawable.varsity3); // Ganti dengan ID gambar yang sesuai
            intent.putExtra("cardInfo", "Varsity RRQ\n \n • Kualitas : SUPER PREMIUM •\n  • Grade original / 1:1 original Quality •\n  • Import : Made in Indonesia •\n  • Material : Kain Baby Terry •\n Harga : 1.500.000 ");
        } else if (v.getId() == R.id.crdVarsity4) {
            intent.putExtra("cardId", 4);
            intent.putExtra("imageId", R.drawable.varsity4); // Ganti dengan ID gambar yang sesuai
            intent.putExtra("cardInfo", "Varsity RRQ x 3Second\n \n • Kualitas : SUPER PREMIUM •\n  • Grade original / 1:1 original Quality •\n  • Import : Made in Indonesia •\n  • Material : Kain Baby Terry •\n Harga : 1.500.000 ");
        } else if (v.getId() == R.id.crdVarsity5) {
            intent.putExtra("cardId", 5);
            intent.putExtra("imageId", R.drawable.varsity5); // Ganti dengan ID gambar yang sesuai
            intent.putExtra("cardInfo", "Varsity Onic\n \n • Kualitas : SUPER PREMIUM •\n  • Grade original / 1:1 original Quality •\n  • Import : Made in Indonesia •\n  • Material : Kain Baby Terry •\n Harga : 1.500.000 ");
        }

        startActivity(intent);
    }

}