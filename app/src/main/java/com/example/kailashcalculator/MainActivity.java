package com.example.kailashcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b00,bdot,badd,bsub,bmul,bdiv,bac,bequal,bclr,bprcnt;
    TextView answer,result;
    boolean add,sub,mul,div,equal,dot=true;
    String s="";
    float res1,res2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1  = findViewById(R.id.b1);
        b2  = findViewById(R.id.b2);
        b3  = findViewById(R.id.b3);
        b4  = findViewById(R.id.b4);
        b5  = findViewById(R.id.b5);
        b6  = findViewById(R.id.b6);
        b7  = findViewById(R.id.b7);
        b8  = findViewById(R.id.b8);
        b9  = findViewById(R.id.b9);
        b0  = findViewById(R.id.b0);
        b00 = findViewById(R.id.b00);
        bdot = findViewById(R.id.bdot);
        badd  = findViewById(R.id.badd);
        bsub  = findViewById(R.id.bsub);
        bmul  = findViewById(R.id.bmul);
        bac  = findViewById(R.id.bac);
        bequal  = findViewById(R.id.bequal);
        bdiv  = findViewById(R.id.bdiv);
        answer = findViewById(R.id.answer);
        result =  findViewById(R.id.result);
        bclr = findViewById(R.id.bcl);
        bprcnt = findViewById(R.id.bprcnt);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(equal)
                {
                    s="1";
                    result.setText("="+s);
                    answer.setText("1");
                    equal = false;
                }
                else if(s.equals("0"))
                {
                    s="1";
                    result.setText("="+s);
                    answer.setText("1");
                }
                else {
                    s+="1";
                    result.setText("="+s);
                    answer.setText(answer.getText()+"1");
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(equal)
                {
                    s="2";
                    result.setText("="+s);
                    answer.setText("2");
                    equal = false;
                }
                else if(s.equals("0"))
                {
                    s="2";
                    result.setText("="+s);
                    answer.setText("2");
                }
                else {
                    s+="2";
                    result.setText("="+s);
                    answer.setText(answer.getText()+"2");
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(equal)
                {
                    s="3";
                    result.setText("="+s);
                    answer.setText("3");
                    equal = false;
                }
                else if(s.equals("0"))
                {
                    s="3";
                    result.setText("="+s);
                    answer.setText("3");
                }
                else {
                    s+="3";
                    result.setText("="+s);
                    answer.setText(answer.getText()+"3");
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(equal)
                {
                    s="4";
                    result.setText("="+s);
                    answer.setText("4");
                    equal = false;
                }
                else if(s.equals("0"))
                {
                    s="4";
                    result.setText("="+s);
                    answer.setText("4");
                }
                else {
                    s+="4";
                    result.setText("="+s);
                    answer.setText(answer.getText()+"4");
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(equal)
                {
                    s="5";
                    result.setText("="+s);
                    answer.setText("5");
                    equal = false;
                }
                else if(s.equals("0"))
                {
                    s="5";
                    result.setText("="+s);
                    answer.setText("5");
                }
                else {
                    s+="5";
                    result.setText("="+s);
                    answer.setText(answer.getText()+"5");
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(equal)
                {
                    s="6";
                    result.setText("="+s);
                    answer.setText("6");
                    equal = false;
                }
                else if(s.equals("0"))
                {
                    s="6";
                    result.setText("="+s);
                    answer.setText("6");
                }
                else {
                    s+="6";
                    result.setText("="+s);
                    answer.setText(answer.getText()+"6");
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(equal)
                {
                    s="7";
                    result.setText("="+s);
                    answer.setText("7");
                    equal = false;
                }
                else if(s.equals("0"))
                {
                    s="7";
                    result.setText("="+s);
                    answer.setText("7");
                }
                else {
                    s+="7";
                    result.setText("="+s);
                    answer.setText(answer.getText()+"7");
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(equal)
                {
                    s="8";
                    result.setText("="+s);
                    answer.setText("8");
                    equal = false;
                }
                else if(s.equals("0"))
                {
                    s="8";
                    result.setText("="+s);
                    answer.setText("8");
                }
                else {
                    s+="8";
                    result.setText("="+s);
                    answer.setText(answer.getText()+"8");
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(equal)
                {
                    s="9";
                    result.setText("="+s);
                    answer.setText("9");
                    equal = false;
                }
                else if(s.equals("0"))
                {
                    s="9";
                    result.setText("="+s);
                    answer.setText("9");
                }
                else {
                    s+="9";
                    result.setText("="+s);
                    answer.setText(answer.getText()+"9");
                }
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(equal)
                {
                    s="0";
                    result.setText("="+s);
                    answer.setText("0");
                    equal = false;
                }
                else if(s.equals("0"))
                {
                    s="0";
                    result.setText("="+s);
                    answer.setText("0");
                }
                else {
                    s+="0";
                    result.setText("="+s);
                    answer.setText(answer.getText()+"0");
                }
            }
        });
        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(equal)
                {
                    s="00";
                    result.setText("="+s);
                    answer.setText("00");
                    equal = false;
                }
                else if(s.equals("0"))
                {
                    s="00";
                    result.setText("="+s);
                    answer.setText("00");
                }
                else {
                    s+="00";
                    result.setText("="+s);
                    answer.setText(answer.getText()+"00");
                }
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dot)
                {
                    if(equal)
                    {
                        s = ".";
                        result.setText(s);
                        answer.setText(".");
                        dot = false;
                        equal = false;
                    }
                    else {
                        s+=".";
                        result.setText(s);
                        answer.setText(answer.getText()+".");
                        dot = false;
                    }
                }
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.equals("")){
                    if(res1!=0) result.setText("="+res1);
                    else result.setText(s);
                    answer.setText(answer.getText().toString());
                }
                else if(add)
                {
                    res1 = res1+Float.parseFloat(s);
                    s = "";
                    add = true;
                    dot = true;
                    result.setText("="+res1);
                    answer.setText(answer.getText()+"+");
                }
                else if(sub)
                {
                    res1 = res1-Float.parseFloat(s);
                    s = "";
                    add = true;
                    dot = true;
                    result.setText("="+res1);
                    answer.setText(answer.getText()+"+");
                }
                else if(mul)
                {
                    res1 = res1*Float.parseFloat(s);
                    s = "";
                    add = true;
                    dot = true;
                    result.setText(null);
                    answer.setText(answer.getText()+"+");
                }
                else if(div)
                {
                    res1 = res1/Float.parseFloat(s);
                    s = "";
                    add = true;
                    dot = true;
                    result.setText("="+res1);
                    answer.setText(answer.getText()+"+");
                }
                else {
                    res1 = Float.parseFloat(s);
                    s = "";
                    dot = true;
                    add = true;
                    result.setText("="+res1);
                    answer.setText(answer.getText()+"+");
                }
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.equals("")){
                    if(res1!=0) result.setText("="+res1);
                    else result.setText(s);
                    answer.setText(answer.getText().toString());
                }
                else if(add)
                {
                    res1 = res1+Float.parseFloat(s);
                    s = "";
                    dot = true;
                    sub = true;
                    result.setText("="+res1);
                    answer.setText(answer.getText()+"-");
                }
                else if(sub)
                {
                    res1 = res1-Float.parseFloat(s);
                    s="";
                    dot = true;
                    sub = true;
                    result.setText("="+res1);
                    answer.setText(answer.getText()+"-");
                }
                else if(mul)
                {
                    res1 = res1*Float.parseFloat(s);
                    s = "";
                    dot = true;
                    sub = true;
                    result.setText("="+res1);
                    answer.setText(answer.getText()+"-");
                }
                else if(div)
                {
                    res1 = res1/Float.parseFloat(s);
                    s="";
                    dot = true;
                    sub = true;
                    result.setText("="+res1);
                    answer.setText(answer.getText()+"-");
                }
                else {
                    res1 = Float.parseFloat(s);
                    s = "";
                    sub = true;
                    dot=true;
                    result.setText("="+res1);
                    answer.setText(answer.getText()+"-");
                }
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.equals("")){
                    if(res1!=0) result.setText("="+res1);
                    else result.setText(s);
                    answer.setText(answer.getText().toString());
                }
                else if(add)
                {
                    res1 = res1+Float.parseFloat(s);
                    s = "";
                    dot = true;
                    mul = true;
                    result.setText("="+res1);
                    answer.setText(answer.getText()+"X");
                }
                else if(sub)
                {
                    res1 = res1-Float.parseFloat(s);
                    s="";
                    dot = true;
                    mul = true;
                    result.setText("="+res1);
                    answer.setText(answer.getText()+"X");
                }
                else if(mul)
                {
                    res1 = res1*Float.parseFloat(s);
                    s = "";
                    dot = true;
                    mul = true;
                    result.setText("="+res1);
                    answer.setText(answer.getText()+"X");
                }
                else if(div)
                {
                    res1 = res1/Float.parseFloat(s);
                    s="";
                    dot = true;
                    mul = true;
                    result.setText("="+res1);
                    answer.setText(answer.getText()+"X");
                }
                else {
                    res1 = Float.parseFloat(s);
                    s = "";
                    mul = true;
                    dot=true;
                    result.setText("="+res1);
                    answer.setText(answer.getText()+"X");
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.equals("")){
                    if(res1!=0) result.setText("="+res1);
                    else result.setText(s);
                    answer.setText(answer.getText().toString());
                }
                else if(add)
                {
                    res1 = res1+Float.parseFloat(s);
                    s = "";
                    dot = true;
                    div = true;
                    result.setText("="+res1);
                    answer.setText(answer.getText()+"/");
                }
                else if(sub)
                {
                    res1 = res1-Float.parseFloat(s);
                    s="";
                    dot = true;
                    div = true;
                    result.setText("="+res1);
                    answer.setText(answer.getText()+"/");
                }
                else if(mul)
                {
                    res1 = res1*Float.parseFloat(s);
                    s = "";
                    dot = true;
                    div = true;
                    result.setText("="+res1);
                    answer.setText(answer.getText()+"/");
                }
                else if(div)
                {
                    res1 = res1/Float.parseFloat(s);
                    s="";
                    dot = true;
                    div = true;
                    result.setText("="+res1);
                    answer.setText(answer.getText()+"/");
                }
                else {
                    res1 = Float.parseFloat(s);
                    s = "";
                    div = true;
                    dot=true;
                    result.setText("="+res1);
                    answer.setText(answer.getText()+"/");
                }
            }
        });
        bprcnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.equals("")){
                    if(res1!=0) result.setText("="+res1);
                    else result.setText(s);
                    answer.setText(answer.getText().toString());
                }
                else {
                    res1 = (float) (Float.parseFloat(s)/100);
                    s = res1+"";
                    dot = false;
                    result.setText("="+s);
                    answer.setText(answer.getText()+s);
                }
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res2 = Float.parseFloat(s);
                equal = true;
                if(add)
                {
                    result.setText(res1+res2+"");
                    answer.setText(res1+res2+"");
                    res1 =0;
                    res2 =0;
                    add = false;
                    dot = true;
                } else if (sub) {
                    result.setText(res1-res2+"");
                    answer.setText(res1-res2+"");
                    res1 =0;
                    res2 =0;
                    sub = false;
                    dot = true;
                }else if (mul) {
                    result.setText(res1*res2+"");
                    answer.setText(res1*res2+"");
                    res1 =0;
                    res2 =0;
                    mul = false;
                    dot = true;
                }
                else if (div) {
                    result.setText(res1/res2+"");
                    answer.setText(res1/res2+"");
                    res1 =0;
                    res2 =0;
                    div = false;
                    dot = true;
                }
            }
        });
        bclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String suba = answer.getText().toString();
                String subr = result.getText().toString();
                answer.setText(suba.substring(0,suba.length()-1));
                result.setText(subr.substring(0,suba.length()-1));
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("0");
                answer.setText("0");
                dot = true;
                res1 =0;
                res2 =0;
            }
        });
    }
}