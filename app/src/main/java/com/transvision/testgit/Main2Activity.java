package com.transvision.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button bt_btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        
        bt_btn1 = findViewById(R.id.main2_button);
        
        bt_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this, "Main2 Btn1", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
