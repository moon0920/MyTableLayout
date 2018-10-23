package com.mmj.www.mytablelayout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
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

        final EditText editText1 = (EditText)findViewById(R.id.editText1);
        final Button button1 = (Button)findViewById(R.id.button1);
        button1.setBackgroundColor(Color.BLUE);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "배고파요", Toast.LENGTH_SHORT).show();
                editText1.setText("배고파");
                v.setBackgroundColor(Color.DKGRAY);
            }

        });
    }
}
