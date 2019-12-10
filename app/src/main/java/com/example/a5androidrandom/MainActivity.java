package com.example.a5androidrandom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    Button butTon1, butTon2;
    TextView textView1;
    EditText editText1, editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butTon1 = findViewById(R.id.butTon1);
        textView1 = findViewById(R.id.textView1);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        butTon2 = findViewById(R.id.butTon2);
        butTon1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String a = editText1.getText().toString();
                String b = editText2.getText().toString();
                // a.length() == 0
                // a.isEmpty() == true
                if(a.length() == 0 || b.length() == 0)
                {
                    Toast.makeText(MainActivity.this, "Vui Lòng Nhập Giá Trị", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int aa = Integer.parseInt(a);
                    int bb = Integer.parseInt(b);
                    Random random = new Random();
                    int aaa = random.nextInt(bb - aa + 1) + aa;
             //       textView1.setText(aaa + ""); ép int về string lại ms hiện ra textview được
                    textView1.setText(String.valueOf(aaa));
                }
            }
        });
    }
}
