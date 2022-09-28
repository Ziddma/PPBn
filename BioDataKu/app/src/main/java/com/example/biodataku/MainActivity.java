package com.example.biodataku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnTelefon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTelefon = findViewById(R.id.btn_telefon);

        btnTelefon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor="081225161191";
                Intent memanggil = new Intent(Intent.ACTION_DIAL);
                memanggil.setData(Uri.fromParts("tel", nomor, null ));
                startActivity(memanggil);
            }
        });
    }
    public void lokasi1(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/c22Xy5na3Juapuky7"));
        startActivity(browserIntent);
    }













}