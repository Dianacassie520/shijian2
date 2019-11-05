package com.example.lx2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.test);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this,AnotherActivity.class);
                intent.putExtra("name","Zhangxuan");
                intent.putExtra("age",20);
                startActivityForResult(intent,0);
            }
        });
    }


}
