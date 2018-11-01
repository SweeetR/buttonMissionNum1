package com.example.user.doggs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn =  (Button) findViewById(R.id.btn) ;


    }

    public void press(View view) {
       btn.setText("oh,i'v been pressed");
    }
}
