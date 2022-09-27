package pu.csic.loginsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.login);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText name = findViewById(R.id.post);
                EditText pw = findViewById(R.id.pw);
                if((name.getText().toString().equals("james"))&&
                        (pw.getText().toString().equals("pw"))){
                    Toast.makeText(getApplicationContext(),"成功了",Toast.LENGTH_LONG).show();
                    Intent it = new Intent(getApplicationContext(),userActivity.class);
                    startActivity(it);
                }
                else{
                    Toast.makeText(getApplicationContext(),"登入失敗",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}