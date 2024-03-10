package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView etText;
    private ImageView ivFoto;
    private Button btnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        etText = findViewById(R.id.etText);
        btnShare = findViewById(R.id.btnShare);
        ivFoto = findViewById(R.id.ivFoto);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("cardId")) {
            int cardId = intent.getIntExtra("cardId", -1);
            if (cardId != -1) {
                String cardInfo = intent.getStringExtra("cardInfo");
                etText.setText(cardInfo);
            }
        }

        if (intent != null && intent.hasExtra("imageId")) {
            int imageId = intent.getIntExtra("imageId", -1);
            if (imageId != -1) {
                ivFoto.setImageResource(imageId);
            }
        }

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareText();
            }
        });
    }
    private void shareText() {
        String textToShare = etText.getText().toString();

        // Mendapatkan gambar dari ImageView
        BitmapDrawable bitmapDrawable = (BitmapDrawable) ivFoto.getDrawable();
        Bitmap bitmap = bitmapDrawable.getBitmap();

        // Simpan gambar ke penyimpanan internal sementara
        String imagePath = MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, "Image", null);
        Uri imageUri = Uri.parse(imagePath);

        // Membuat intent untuk berbagi teks dan gambar
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("image/*");
        shareIntent.putExtra(Intent.EXTRA_TEXT, textToShare);
        shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
        shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);

        // Memulai intent untuk berbagi
        startActivity(Intent.createChooser(shareIntent, "Share via"));
    }

}
