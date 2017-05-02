package com.roberto.projecthappybirthday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView image;
   /* EditText et1, et2;
    TextView tvJawaban;
    Button btnHitung;*/

    TextView tvScore1, tvScore2;
    Button btn3A, btn2A, btn1A, btn3B, btn2B, btn1B, btnReset;
    int scoreA = 0;
    int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle("Basket Ball Score Board");
        setContentView(R.layout.court_counter);
        tvScore1 = (TextView) findViewById(R.id.scoreA);
        tvScore2 = (TextView) findViewById(R.id.scoreB);
        btn1A = (Button) findViewById(R.id.btn1A);
        btn1B = (Button) findViewById(R.id.btn1B);
        btn2A = (Button) findViewById(R.id.btn2A);
        btn2B = (Button) findViewById(R.id.btn2B);
        btn3A = (Button) findViewById(R.id.btn3A);
        btn3B = (Button) findViewById(R.id.btn3B);
        btnReset = (Button) findViewById(R.id.btnReset);



        btn1A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA++;
                tvScore1.setText(Integer.toString(scoreA));
            }
        });

        btn2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA = scoreA+2;
                tvScore1.setText(Integer.toString(scoreA));
            }
        });
        btn3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA = scoreA+3;
                tvScore1.setText(Integer.toString(scoreA));
            }
        });
        btn1B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreB++;
                tvScore2.setText(Integer.toString(scoreB));
            }
        });
        btn2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreB = scoreB+2;
                tvScore2.setText(Integer.toString(scoreB));
            }
        });
        btn3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreB = scoreB+3;
                tvScore2.setText(Integer.toString(scoreB));
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScore1.setText("0");
                tvScore2.setText("0");
                scoreA = 0;
                scoreB = 0;
            }
        });

        /*setContentView(R.layout.birthday2);

        et1 = (EditText) findViewById(R.id.angka1);
        et2 = (EditText) findViewById(R.id.angka2);
        tvJawaban = (TextView) findViewById(R.id.tvJawaban);
        btnHitung = (Button) findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!et1.getText().toString().equals("") && !et2.getText().toString().equals("")){
                    int a1 = Integer.parseInt(et1.getText().toString());
                    int a2 = Integer.parseInt(et2.getText().toString());
                    int jawaban = a1 + a2;
                    tvJawaban.setText(Integer.toString(jawaban));
                }else{
                    tvJawaban.setText("anda belum mengisi angka");
                }


            }
        });*/
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        setContentView(R.layout.activity_main);
    }
}
