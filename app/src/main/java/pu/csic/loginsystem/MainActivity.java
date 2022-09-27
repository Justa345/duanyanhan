package pu.csic.loginsystem;

import androidx.activity.result.contract.ActivityResultContracts;
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
                    Bundle data = new Bundle();
                    data.putString("account", name.getText().toString());
                    data.putInt("age",24);

                    Intent it = new Intent(getApplicationContext(),userActivity.class);
                    it.putExtras(data);
                    startActivityForResult(it,1000);
                    Toast.makeText(getApplicationContext(),"成功",Toast.LENGTH_LONG).show();
                }

                else{
                    Toast.makeText(getApplicationContext(),"登入失敗",Toast.LENGTH_LONG).show();//
                }//

            }

        });
    }

}