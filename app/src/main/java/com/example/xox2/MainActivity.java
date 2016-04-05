package com.example.xox2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startButton = (Button) findViewById(R.id.start_button);
        startButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent screen_second = new Intent(this, GameActivity.class);
        startActivity(screen_second);
    }
}
