package pu.csic.loginsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class userActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        Button dialbtn = findViewById(R.id.dialbtn);
        Button webbtn = findViewById(R.id.webbtn);
        Button exitbtn = findViewById(R.id.exitbtn);
        dialbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri phone = Uri.parse("tel://123456");
                Intent it = new Intent(Intent.ACTION_DIAL,phone);
                startActivity(it);
            }
        });
        webbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri web = Uri.parse("https://www.google.com");
                Intent it2 = new Intent(Intent.ACTION_VIEW,web);
                startActivity(it2);
            }
        });
        exitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}