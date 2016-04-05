package com.example.xox2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    private boolean playerXmoved;

    private Button button11;
    private Button button12;
    private Button button13;

    private Button button21;
    private Button button22;
    private Button button23;

    private Button button31;
    private Button button32;
    private Button button33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //the first row
        button11 = (Button) findViewById(R.id.but11);
        button11.setOnClickListener(this);

        button12 = (Button) findViewById(R.id.but12);
        button12.setOnClickListener(this);

        button13 = (Button) findViewById(R.id.but13);
        button13.setOnClickListener(this);

        //the second row
        button21 = (Button) findViewById(R.id.but21);
        button21.setOnClickListener(this);

        button22 = (Button) findViewById(R.id.but22);
        button22.setOnClickListener(this);

        button23 = (Button) findViewById(R.id.but23);
        button23.setOnClickListener(this);

        //the third row
        button31 = (Button) findViewById(R.id.but31);
        button31.setOnClickListener(this);

        button32 = (Button) findViewById(R.id.but32);
        button32.setOnClickListener(this);

        button33 = (Button) findViewById(R.id.but33);
        button33.setOnClickListener(this);

        button13 = (Button) findViewById(R.id.but13);
        button13.setOnClickListener(this);

        button13 = (Button) findViewById(R.id.but13);
        button13.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Button button_cur = (Button) v;
        if (playerXmoved) {
            button_cur.setText("O");
            playerXmoved = false;
        } else {
            button_cur.setText("X");
            playerXmoved = true;
        }
        button_cur.setClickable(false);
    }
}
