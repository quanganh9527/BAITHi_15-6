package com.example.admin.baithi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bai1 extends AppCompatActivity {
    EditText e1, e2;
    Button b1, b2;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        e1 = (EditText) findViewById(R.id.w);
        e2 = (EditText) findViewById(R.id.kg);
        b1 = (Button) findViewById(R.id.oke);
        t = (TextView) findViewById(R.id.kq);
        b2 = (Button) findViewById(R.id.cancel);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double H=Double.parseDouble(e2.getText()+"");
                    double W=Double.parseDouble(e1.getText()+"");
                    double BMI=W/Math.pow(H, 2);
                    String chandoan;
                    if(BMI<18)
                    {
                        chandoan="Bạn gầy";
                    }
                    else if(BMI<=24.9)
                    {
                        chandoan="Bạn bình thường";
                    }
                    else if(BMI<=29.9)
                    {
                        chandoan="Bạn béo phì độ 1";
                    }
                    else if(BMI<=34.9)
                    {
                        chandoan="Bạn béo phì độ 2";
                    }
                    else
                    {
                        chandoan="Bạn béo phì độ 3";
                    }
                    t.setText(chandoan);
                } catch (Exception e) {

                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
                e2.setText("");
                e1.requestFocus();
                t.setText("");
            }
        });
    }
}
