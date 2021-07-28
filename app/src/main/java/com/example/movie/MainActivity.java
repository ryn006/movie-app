package com.example.movie;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = getApplicationContext();
        CharSequence text = "Click to view trailers";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        ObjectAnimator animation = ObjectAnimator.ofFloat(findViewById(R.id.tv), "translationX", 450f);
        animation.setDuration(5000);
        animation.start();}
    public void old(View view) {
        String url = "https://www.youtube.com/watch?v=A4U2pMRV9_k";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void blackwidow(View view) {
        String url = "https://www.youtube.com/watch?v=ybji16u608U";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void escaperoom2(View view) {
        String url = "https://www.youtube.com/watch?v=01FpO0UuULY";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void thefather(View view) {
        String url = "https://www.youtube.com/watch?v=4TZb7YfK-JI";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void snowden(View view) {
        String url = "https://www.youtube.com/watch?v=QlSAiI3xMh4";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void shershaah(View view) {
        String url = "https://www.youtube.com/watch?v=Q0FTXnefVBA";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void jhund(View view) {
        String url = "https://www.youtube.com/watch?v=45lj-bGVOHE";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void et(View view) {
        String url = "https://www.youtube.com/watch?v=ThKNjV723yI";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void dial(View view) {
        String url = "https://www.youtube.com/watch?v=VFIYNUWw5j0";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void anek(View view) {
        String url = "https://www.youtube.com/watch?v=fo1nkasN1Ao";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }











}
