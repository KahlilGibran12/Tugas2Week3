package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton ibVarsity = findViewById(R.id.ibVarsity);
        ImageButton ibSepatu = findViewById(R.id.ibSepatu);
        ImageButton ibSendal = findViewById(R.id.ibSendal);

        ibVarsity.setOnClickListener(this);
        ibSepatu.setOnClickListener(this);
        ibSendal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.ibVarsity){
            Intent intentvarsity = new Intent(this, VarsityActivity.class);
            startActivity(intentvarsity);

        } else if (v.getId() == R.id.ibSepatu) {
            Intent intentsepatu = new Intent(this, SepatuActivity.class);
            startActivity(intentsepatu);

        } else if (v.getId() == R.id.ibSendal) {
            Intent intentsendal = new Intent(this, SendalActivity.class);
            startActivity(intentsendal);
        }
    }
}