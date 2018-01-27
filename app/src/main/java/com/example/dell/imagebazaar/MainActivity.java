package com.example.dell.imagebazaar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicked(View view) {
        int id = view.getId();
      String yclicked = getResources().getResourceEntryName(id);
        //Toast.makeText(this, "you clicked"+ yclicked, Toast.LENGTH_SHORT).show();
        Intent intent  = new Intent(this, display.class);
        intent.putExtra("name", yclicked);
        startActivity(intent);
    }
}
