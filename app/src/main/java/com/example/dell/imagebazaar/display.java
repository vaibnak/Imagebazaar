package com.example.dell.imagebazaar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Scanner;

public class display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();
     String extra = intent.getStringExtra("name");

        ImageView img = (ImageView)findViewById(R.id.image);
        int id = getResources().getIdentifier(extra, "drawable", getPackageName());
        img.setImageResource(id);

        TextView tx = (TextView)findViewById(R.id.name);
        tx.setText(extra);

        Scanner scan = new Scanner(getResources().openRawResource(R.raw.extra));

        String text = " ";
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            text += line;
        }
   scan.close();
        TextView des = (TextView)findViewById(R.id.description);
        tx.setText(text);
    }
}
