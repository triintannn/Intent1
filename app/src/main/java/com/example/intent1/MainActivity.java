package com.example.intent1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button halaman2;
    Button halaman3;
    Button halaman4;
    Button halaman5;
    Button halaman6;
    Button halaman1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        halaman2 = (Button)findViewById(R.id.halaman2);
        halaman2.setOnClickListener((View.OnClickListener) this);
        halaman3 = (Button)findViewById(R.id.halaman3);
        halaman3.setOnClickListener((View.OnClickListener) this);
        halaman4 = (Button)findViewById(R.id.halaman4);
        halaman4.setOnClickListener((View.OnClickListener) this);
        halaman5 = (Button)findViewById(R.id.halaman5);
        halaman5.setOnClickListener((View.OnClickListener) this);
        halaman6 = (Button)findViewById(R.id.halaman6);
        halaman6.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.halaman2:
                Intent hal2 = new Intent(MainActivity.this, intenactivity2.class);
                startActivity(hal2);
                break;

            case R.id.halaman3:
                Intent hal3 = new Intent(MainActivity.this, intenactivity3.class);
                startActivity(hal3);
                break;

            case R.id.halaman4:
                Intent hal4 = new Intent(MainActivity.this, intenactivity4.class);
                startActivity(hal4);
                break;

            case R.id.halaman5:
                Intent hal5 = new Intent(MainActivity.this, intenactivity5.class);
                startActivity(hal5);
                break;

            case R.id.halaman6:
                Intent hal6 = new Intent(MainActivity.this, intenactivity6.class);
                startActivity(hal6);
                break;

        }
    }
}