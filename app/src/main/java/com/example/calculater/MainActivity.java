package com.example.calculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    Button div,sub,add,mul,equal;
    Button c,ce,bs,dot;         //c: xoa toan hang hien tai, ce:xoa phep tinh, bs:xoa mot so cua toan hang hien tai
    EditText text1;
    int val1,val2,ans;
    boolean division, multi,subtract,sum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
//            Log.v("TAG","ONCREATE");
        division = multi = subtract = sum = false;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.nb_1);
        b2 = findViewById(R.id.nb_2);
        b3 = findViewById(R.id.nb_3);
        b4 = findViewById(R.id.nb_4);
        b5 = findViewById(R.id.nb_5);
        b6 = findViewById(R.id.nb_6);
        b7 = findViewById(R.id.nb_7);
        b8 = findViewById(R.id.nb_8);
        b9 = findViewById(R.id.nb_9);
        div = findViewById(R.id.div);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        add = findViewById(R.id.add);
        equal = findViewById(R.id.equal);
        c = findViewById(R.id.c);
        ce = findViewById(R.id.ce);
        bs = findViewById(R.id.bs);
        dot = findViewById(R.id.dot);
        text1 = findViewById(R.id.cal);

        b1.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               text1.setText(text1.getText()+"1");
           }
       });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText()+"0");
            }
        });
        dot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText()+".");
            }
        });
        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                division = true;
                if (text1.getText()==null) val1 = 0;
                else {val1 = Integer.parseInt(text1.getText().toString());
                    text1.setText("0");}
            }
        });
        mul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                multi = true;
                if (text1.getText()==null) val1 = 0;
                else {val1 = Integer.parseInt(text1.getText().toString());
                text1.setText("0");}
            }
        });
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                sum = true;
                if (text1.getText()==null) val1 = 0;
                else {
                val1 = Integer.parseInt(text1.getText().toString());
                text1.setText("0");}
            }
        });
        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                subtract = true;
                if (text1.getText()==null) val1 = 0;
                else { val1 = Integer.parseInt(text1.getText().toString());
                text1.setText("0");}
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val2 = Integer.parseInt(text1.getText().toString());
                if (multi) {
                    ans = val1 * val2;
                    multi = false;
                } else if (division) {
                    ans = val1 / val2;
                    division = false;
                } else if (sum) {
                    ans = val1 + val2;
                    sum = false;
                } else if (subtract) {
                    ans = val1 - val2;
                    subtract = false;
                } else ans= ans+ 0;
                text1.setText(String.valueOf(ans));
                val1 = ans;
                Log.v("TAG","ANS="+ans);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sum||subtract||division||multi){
                    val1 = 0;
                }
                text1.setText("0");

            }
        });
        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multi = subtract = division = sum = false;
            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tlength = text1.length();
                if(tlength>1) text1.setText(text1.getText().subSequence(0,tlength-1));

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("TAG","ONSTART");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("TAG","RESUME");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("TAG","PAUSE");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("TAG","DESTROY");
    }

}