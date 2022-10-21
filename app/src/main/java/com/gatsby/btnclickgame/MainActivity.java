package com.gatsby.btnclickgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnClick;
    private TextView tvCount;
    private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCount = findViewById(R.id.tvCount);
        tvCount.setText(count+"");
        btnClick = findViewById(R.id.btnClick);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                tvCount.setText(count+"");
            }
        });
    }
}