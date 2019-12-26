package com.example.cookie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView cookie_img;
    private TextView state_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cookie_img=(ImageView)findViewById(R.id.cookie_img);
        state_tv=(TextView)findViewById(R.id.state_tv);
    }

    public void eat_btn_click(View view){
        cookie_img.setImageResource(R.drawable.after_cookie);
        state_tv.setText("I'm so full!");
    }
}
