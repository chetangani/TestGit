package com.transvision.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt_test1, bt_test3,bt_test4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_test1 = findViewById(R.id.button);
        bt_test3 = findViewById(R.id.button3);
        bt_test4 = findViewById(R.id.button4);
        bt_test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Test1", Toast.LENGTH_SHORT).show();
            }
        });
        bt_test3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Test3", Toast.LENGTH_SHORT).show();
            }
        });
        bt_test4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Test4", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
