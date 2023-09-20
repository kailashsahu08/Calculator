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
    String s="",temp="";
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
                    temp=s;
                    result.setText(temp);
                    answer.setText("1");
                    equal = false;
                }
                else if(s.equals("0") || s.equals("00"))
                {
                    s="1";
                    temp = "="+s;
                    result.setText(temp);
                    answer.setText("1");
                }
                else if(add)
                {
                    s +="1";
                    res2 = Float.parseFloat(s);
                    float sum = res1 + res2;
                    temp = ""+((sum%1==0)?String.valueOf((int)sum):String.valueOf(sum));
                    result.setText(temp);
                    temp = answer.getText()+"1";
                    answer.setText(temp);
                }
                else if(sub)
                {
                    s +="1";
                    res2 = Float.parseFloat(s);
                    float sub = res1 - res2;
                    temp = ((sub%1==0)?String.valueOf((int)sub):String.valueOf(sub));
                    result.setText(temp);
                    temp = answer.getText()+"1";
                    answer.setText(temp);
                }
                else if(mul)
                {
                    s +="1";
                    res2 = Float.parseFloat(s);
                    float mult = res1 * res2;
                    temp = ((mult%1==0)?String.valueOf((int)mult):String.valueOf(mult));
                    result.setText(temp);
                    temp = answer.getText()+"1";
                    answer.setText(temp);
                }
                else if(div)
                {
                    s +="1";
                    res2 = Float.parseFloat(s);
                    float divs = res1 / res2;
                    temp = ((divs%1==0)?String.valueOf((int)divs):String.valueOf(divs));
                    result.setText(temp);
                    temp = answer.getText()+"1";
                    answer.setText(temp);
                }
                else {
                    s+="1";
                    temp = "="+s;
                    result.setText(temp);
                    temp = answer.getText()+"1";
                    answer.setText(temp);
                }
            }
        });
        b2.setOnClickListener(view -> {
            if(equal)
            {
                s="2";
                temp = s;
                result.setText(temp);
                answer.setText("2");
                equal = false;
            }
            else if(s.equals("0"))
            {
                s="2";
                temp = s;
                result.setText(temp);
                answer.setText("2");
            }
            else if(add)
            {
                s +="2";
                res2 = Float.parseFloat(s);
                float sum = res1 + res2;
                temp =((sum%1==0)?String.valueOf((int)sum):String.valueOf(sum));
                result.setText(temp);
                temp = answer.getText()+"2";
                answer.setText(temp);
            }
            else if(sub)
            {
                s +="2";
                res2 = Float.parseFloat(s);
                float sub = res1 - res2;
                temp = ((sub%1==0)?String.valueOf((int)sub):String.valueOf(sub));
                result.setText(temp);
                temp = answer.getText()+"2";
                answer.setText(temp);
            }
            else if(mul)
            {
                s +="2";
                res2 = Float.parseFloat(s);
                float mult = res1 * res2;
                temp = ((mult%1==0)?String.valueOf((int)mult):String.valueOf(mult));
                result.setText(temp);
                temp = answer.getText()+"2";
                answer.setText(temp);
            }
            else if(div)
            {
                s +="2";
                res2 = Float.parseFloat(s);
                float divs = res1 / res2;
                temp = ((divs%1==0)?String.valueOf((int)divs):String.valueOf(divs)) ;
                result.setText(temp);
                temp = answer.getText()+"2";
                answer.setText(temp);
            }
            else {
                s+="2";
                temp = s;
                result.setText(temp);
                temp = answer.getText()+"2";
                answer.setText(temp);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(equal)
                {
                    s="3";
                    result.setText(s);
                    answer.setText("3");
                    equal = false;
                }
                else if(s.equals("0"))
                {
                    s="3";
                    result.setText(s);
                    answer.setText("3");
                }
                else if(add)
                {
                    s +="3";
                    res2 = Float.parseFloat(s);
                    float sum = res1 + res2;
                    temp = (sum%1==0)?String.valueOf((int)sum):String.valueOf(sum);
                    result.setText(temp);
                    answer.setText(answer.getText()+"3");
                }
                else if(sub)
                {
                    s +="3";
                    res2 = Float.parseFloat(s);
                    float sub = res1 - res2;
                    temp = ((sub%1==0)?String.valueOf((int)sub):String.valueOf(sub));
                    result.setText(temp);
                    answer.setText(answer.getText()+"3");
                }
                else if(mul)
                {
                    s +="3";
                    res2 = Float.parseFloat(s);
                    float mult = res1 * res2;
                    temp = ((mult%1==0)?String.valueOf((int)mult):String.valueOf(mult));
                    result.setText(temp);
                    answer.setText(answer.getText()+"3");
                }
                else if(div)
                {
                    s +="3";
                    res2 = Float.parseFloat(s);
                    float divs = res1 / res2;
                    temp = ((divs%1==0)?String.valueOf((int)divs):String.valueOf(divs));
                    result.setText(temp);
                    answer.setText(answer.getText()+"3");
                }
                else {
                    s+="3";
                    result.setText(s);
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
                    result.setText(s);
                    answer.setText("4");
                    equal = false;
                }
                else if(s.equals("0"))
                {
                    s="4";
                    result.setText(s);
                    answer.setText("4");
                }
                else if(add)
                {
                    s +="4";
                    res2 = Float.parseFloat(s);
                    float sum = res1 + res2;
                    temp = (sum%1==0)?String.valueOf((int)sum):String.valueOf(sum);
                    result.setText(temp);
                    answer.setText(answer.getText()+"4");
                }
                else if(sub)
                {
                    s +="4";
                    res2 = Float.parseFloat(s);
                    float sub = res1 - res2;
                    temp = ((sub%1==0)?String.valueOf((int)sub):String.valueOf(sub));
                    result.setText(temp);
                    answer.setText(answer.getText()+"4");
                }
                else if(mul)
                {
                    s +="4";
                    res2 = Float.parseFloat(s);
                    float mult = res1 * res2;
                    temp = ((mult%1==0)?String.valueOf((int)mult):String.valueOf(mult));
                    result.setText(temp);
                    answer.setText(answer.getText()+"4");
                }
                else if(div)
                {
                    s +="4";
                    res2 = Float.parseFloat(s);
                    float divs = res1 / res2;
                    temp = ((divs%1==0)?String.valueOf((int)divs):String.valueOf(divs));
                    result.setText(temp);
                    answer.setText(answer.getText()+"4");
                }
                else {
                    s+="4";
                    result.setText(s);
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
                    result.setText(s);
                    answer.setText("5");
                    equal = false;
                }
                else if(s.equals("0"))
                {
                    s="5";
                    result.setText(s);
                    answer.setText("5");
                }
                else if(add)
                {
                    s +="5";
                    res2 = Float.parseFloat(s);
                    float sum = res1 + res2;
                    temp = (sum%1==0)?String.valueOf((int)sum):String.valueOf(sum);
                    result.setText(temp);
                    answer.setText(answer.getText()+"5");
                }
                else if(sub)
                {
                    s +="5";
                    res2 = Float.parseFloat(s);
                    float sub = res1 - res2;
                    temp = ((sub%1==0)?String.valueOf((int)sub):String.valueOf(sub));
                    result.setText(temp);
                    answer.setText(answer.getText()+"5");
                }
                else if(mul)
                {
                    s +="5";
                    res2 = Float.parseFloat(s);
                    float mult = res1 * res2;
                    temp = ((mult%1==0)?String.valueOf((int)mult):String.valueOf(mult));
                    result.setText(temp);
                    answer.setText(answer.getText()+"5");
                }
                else if(div)
                {
                    s +="5";
                    res2 = Float.parseFloat(s);
                    float divs = res1 / res2;
                    temp = ((divs%1==0)?String.valueOf((int)divs):String.valueOf(divs));
                    result.setText(temp);
                    answer.setText(answer.getText()+"5");
                }
                else {
                    s+="5";
                    result.setText(s);
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
                    result.setText(s);
                    answer.setText("6");
                    equal = false;
                }
                else if(s.equals("0"))
                {
                    s="6";
                    result.setText(s);
                    answer.setText("6");
                }
                else if(add)
                {
                    s +="6";
                    res2 = Float.parseFloat(s);
                    float sum = res1 + res2;
                    temp = (sum%1==0)?String.valueOf((int)sum):String.valueOf(sum);
                    result.setText(temp);
                    answer.setText(answer.getText()+"6");
                }
                else if(sub)
                {
                    s +="6";
                    res2 = Float.parseFloat(s);
                    float sub = res1 - res2;
                    temp = ((sub%1==0)?String.valueOf((int)sub):String.valueOf(sub));
                    result.setText(temp);
                    answer.setText(answer.getText()+"6");
                }
                else if(mul)
                {
                    s +="6";
                    res2 = Float.parseFloat(s);
                    float mult = res1 * res2;
                    temp = ((mult%1==0)?String.valueOf((int)mult):String.valueOf(mult));
                    result.setText(temp);
                    answer.setText(answer.getText()+"6");
                }
                else if(div)
                {
                    s +="6";
                    res2 = Float.parseFloat(s);
                    float divs = res1 / res2;
                    temp = ((divs%1==0)?String.valueOf((int)divs):String.valueOf(divs));
                    result.setText("="+divs);
                    answer.setText(answer.getText()+"6");
                }
                else {
                    s+="6";
                    result.setText(s);
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
                    result.setText(s);
                    answer.setText("7");
                    equal = false;
                }
                else if(s.equals("0"))
                {
                    s="7";
                    result.setText(s);
                    answer.setText("7");
                }
                else if(add)
                {
                    s +="7";
                    res2 = Float.parseFloat(s);
                    float sum = res1 + res2;
                    temp = (sum%1==0)?String.valueOf((int)sum):String.valueOf(sum);
                    result.setText(temp);
                    answer.setText(answer.getText()+"7");
                }
                else if(sub)
                {
                    s +="7";
                    res2 = Float.parseFloat(s);
                    float sub = res1 - res2;
                    temp = ((sub%1==0)?String.valueOf((int)sub):String.valueOf(sub));
                    result.setText(temp);
                    answer.setText(answer.getText()+"7");
                }
                else if(mul)
                {
                    s +="7";
                    res2 = Float.parseFloat(s);
                    float mult = res1 * res2;
                    temp = ((mult%1==0)?String.valueOf((int)mult):String.valueOf(mult));
                    result.setText(temp);
                    answer.setText(answer.getText()+"7");
                }
                else if(div)
                {
                    s +="7";
                    res2 = Float.parseFloat(s);
                    float divs = res1 / res2;
                    temp = ((divs%1==0)?String.valueOf((int)divs):String.valueOf(divs));
                    result.setText(temp);
                    answer.setText(answer.getText()+"7");
                }
                else {
                    s+="7";
                    result.setText(s);
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
                    result.setText(s);
                    answer.setText("8");
                    equal = false;
                }
                else if(s.equals("0"))
                {
                    s="8";
                    result.setText(s);
                    answer.setText("8");
                }
                else if(add)
                {
                    s +="8";
                    res2 = Float.parseFloat(s);
                    float sum = res1 + res2;
                    temp = (sum%1==0)?String.valueOf((int)sum):String.valueOf(sum);
                    result.setText(temp);
                    answer.setText(answer.getText()+"8");
                }
                else if(sub)
                {
                    s +="8";
                    res2 = Float.parseFloat(s);
                    float sub = res1 - res2;
                    temp = ((sub%1==0)?String.valueOf((int)sub):String.valueOf(sub));
                    result.setText(temp);
                    answer.setText(answer.getText()+"8");
                }
                else if(mul)
                {
                    s +="8";
                    res2 = Float.parseFloat(s);
                    float mult = res1 * res2;
                    temp = ((mult%1==0)?String.valueOf((int)mult):String.valueOf(mult));
                    result.setText(temp);
                    answer.setText(answer.getText()+"8");
                }
                else if(div)
                {
                    s +="8";
                    res2 = Float.parseFloat(s);
                    float divs = res1 / res2;
                    temp = ((divs%1==0)?String.valueOf((int)divs):String.valueOf(divs));
                    result.setText(temp);
                    answer.setText(answer.getText()+"8");
                }
                else {
                    s+="8";
                    result.setText(s);
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
                    result.setText(s);
                    answer.setText("9");
                    equal = false;
                }
                else if(s.equals("0"))
                {
                    s="9";
                    result.setText(s);
                    answer.setText("9");
                }
                else if(add)
                {
                    s +="9";
                    res2 = Float.parseFloat(s);
                    float sum = res1 + res2;
                    temp = (sum%1==0)?String.valueOf((int)sum):String.valueOf(sum);
                    result.setText(temp);
                    answer.setText(answer.getText()+"9");
                }
                else if(sub)
                {
                    s +="9";
                    res2 = Float.parseFloat(s);
                    float sub = res1 - res2;
                    temp = ((sub%1==0)?String.valueOf((int)sub):String.valueOf(sub));
                    result.setText(temp);
                    answer.setText(answer.getText()+"9");
                }
                else if(mul)
                {
                    s +="9";
                    res2 = Float.parseFloat(s);
                    float mult = res1 * res2;
                    temp = ((mult%1==0)?String.valueOf((int)mult):String.valueOf(mult));
                    result.setText(temp);
                    answer.setText(answer.getText()+"9");
                }
                else if(div)
                {
                    s +="9";
                    res2 = Float.parseFloat(s);
                    float divs = res1 / res2;
                    temp = ((divs%1==0)?String.valueOf((int)divs):String.valueOf(divs));
                    result.setText(temp);
                    answer.setText(answer.getText()+"9");
                }
                else {
                    s+="9";
                    result.setText(s);
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
                    result.setText(s);
                    answer.setText("0");
                    equal = false;
                }
                else if(s.equals("0"))
                {
                    s="0";
                    result.setText(s);
                    answer.setText("0");
                }
                else if(add)
                {
                    s +="0";
                    res2 = Float.parseFloat(s);
                    float sum = res1 + res2;
                    temp = (sum%1==0)?String.valueOf((int)sum):String.valueOf(sum);
                    result.setText(temp);
                    answer.setText(answer.getText()+"0");
                }
                else if(sub)
                {
                    s +="0";
                    res2 = Float.parseFloat(s);
                    float sub = res1 - res2;
                    temp = ((sub%1==0)?String.valueOf((int)sub):String.valueOf(sub));
                    result.setText(temp);
                    answer.setText(answer.getText()+"0");
                }
                else if(mul)
                {
                    s +="0";
                    res2 = Float.parseFloat(s);
                    float mult = res1 * res2;
                    temp = ((mult%1==0)?String.valueOf((int)mult):String.valueOf(mult));
                    result.setText(temp);
                    answer.setText(answer.getText()+"0");
                }
                else if(div)
                {
                    s +="0";
                    res2 = Float.parseFloat(s);
                    float divs = res1 / res2;
                    temp = ((divs%1==0)?String.valueOf((int)divs):String.valueOf(divs));
                    result.setText(temp);
                    answer.setText(answer.getText()+"0");
                }
                else {
                    s+="0";
                    result.setText(s);
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
                else if(add)
                {
                    s +="00";
                    res2 = Float.parseFloat(s);
                    float sum = res1 + res2;
                    temp = (sum%1==0)?String.valueOf((int)sum):String.valueOf(sum);
                    result.setText(temp);
                    answer.setText(answer.getText()+"00");
                }
                else if(sub)
                {
                    s +="00";
                    res2 = Float.parseFloat(s);
                    float sub = res1 - res2;
                    temp = ((sub%1==0)?String.valueOf((int)sub):String.valueOf(sub));
                    result.setText(temp);
                    answer.setText(answer.getText()+"00");
                }
                else if(mul)
                {
                    s +="00";
                    res2 = Float.parseFloat(s);
                    float mult = res1 * res2;
                    temp = ((mult%1==0)?String.valueOf((int)mult):String.valueOf(mult));
                    result.setText(temp);
                    answer.setText(answer.getText()+"00");
                }
                else if(div)
                {
                    s +="00";
                    res2 = Float.parseFloat(s);
                    float divs = res1 / res2;
                    temp = ((divs%1==0)?String.valueOf((int)divs):String.valueOf(divs));
                    result.setText(temp);
                    answer.setText(answer.getText()+"00");
                }
                else {
                    s+="00";
                    result.setText(s);
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
        badd.setOnClickListener(view -> {
            if(s.equals("")){
                if(res1!=0) result.setText((res1%1==0)?String.valueOf((int)res1):String.valueOf(res1));
                else result.setText(s);
                answer.setText(answer.getText().toString());
            }
            else if(add)
            {
                res1 = res1+Float.parseFloat(s);
                s = "";
                add = true;
                dot = true;
                result.setText((res1%1==0)?String.valueOf((int)res1):String.valueOf(res1));
                answer.setText(answer.getText()+"+");
            }
            else if(sub)
            {
                res1 = res1-Float.parseFloat(s);
                s = "";
                add = true;
                sub = false;
                dot = true;
                result.setText((res1%1==0)?String.valueOf((int)res1):String.valueOf(res1));
                answer.setText(answer.getText()+"+");
            }
            else if(mul)
            {
                res1 = res1*Float.parseFloat(s);
                s = "";
                add = true;
                mul = false;
                dot = true;
                result.setText((res1%1==0)?String.valueOf((int)res1):String.valueOf(res1));
                answer.setText(answer.getText()+"+");
            }
            else if(div)
            {
                res1 = res1/Float.parseFloat(s);
                s = "";
                add = true;
                div = false;
                dot = true;
                result.setText((res1%1==0)?String.valueOf((int)res1):String.valueOf(res1));
                answer.setText(answer.getText()+"+");
            }
            else {
                res1 = Float.parseFloat(s);
                s = "";
                dot = true;
                add = true;
                result.setText((res1%1==0)?String.valueOf((int)res1):String.valueOf(res1));
                answer.setText(answer.getText()+"+");
            }
        });
        bsub.setOnClickListener(view -> {
            if(s.equals("")){
                if(res1!=0) result.setText((res1%1==0)?String.valueOf((int)res1):String.valueOf(res1));
                else result.setText(s);
                answer.setText(answer.getText().toString());
            }
            else if(add)
            {
                res1 = res1+Float.parseFloat(s);
                s = "";
                dot = true;
                add = false;
                sub = true;
                result.setText((res1%1==0)?String.valueOf((int)res1):String.valueOf(res1));
                answer.setText(answer.getText()+"-");
            }
            else if(sub)
            {
                res1 = res1-Float.parseFloat(s);
                s="";
                dot = true;
                sub = true;
                result.setText((res1%1==0)?String.valueOf((int)res1):String.valueOf(res1));
                answer.setText(answer.getText()+"-");
            }
            else if(mul)
            {
                res1 = res1*Float.parseFloat(s);
                s = "";
                dot = true;
                mul = false;
                sub = true;
                result.setText((res1%1==0)?String.valueOf((int)res1):String.valueOf(res1));
                answer.setText(answer.getText()+"-");
            }
            else if(div)
            {
                res1 = res1/Float.parseFloat(s);
                s="";
                dot = true;
                div =false;
                sub = true;
                result.setText((res1%1==0)?String.valueOf((int)res1):String.valueOf(res1));
                answer.setText(answer.getText()+"-");
            }
            else {
                res1 = Float.parseFloat(s);
                s = "";
                sub = true;
                dot=true;
                result.setText((res1%1==0)?String.valueOf((int)res1):String.valueOf(res1));
                answer.setText(answer.getText()+"-");
            }
        });
        bmul.setOnClickListener(view -> {
            if(s.equals("")){
                if(res1!=0) result.setText((res1%1==0)?String.valueOf((int)res1):String.valueOf(res1));
                else result.setText(s);
                answer.setText(answer.getText().toString());
            }
            else if(add)
            {
                res1 = res1+Float.parseFloat(s);
                s = "";
                dot = true;
                add = false;
                mul = true;
                result.setText((res1%1==0)?String.valueOf((int)res1):String.valueOf(res1));
                answer.setText(answer.getText()+"X");
            }
            else if(sub)
            {
                res1 = res1-Float.parseFloat(s);
                s="";
                dot = true;
                sub = false;
                mul = true;
                result.setText((res1%1==0)?String.valueOf((int)res1):String.valueOf(res1));
                answer.setText(answer.getText()+"X");
            }
            else if(mul)
            {
                res1 = res1*Float.parseFloat(s);
                s = "";
                dot = true;
                mul = true;
                result.setText((res1%1==0)?String.valueOf((int)res1):String.valueOf(res1));
                answer.setText(answer.getText()+"X");
            }
            else if(div)
            {
                res1 = res1/Float.parseFloat(s);
                s="";
                div = false;
                dot = true;
                mul = true;
                result.setText((res1%1==0)?String.valueOf((int)res1):String.valueOf(res1));
                answer.setText(answer.getText()+"X");
            }
            else {
                res1 = Float.parseFloat(s);
                s = "";
                mul = true;
                dot=true;
                result.setText((res1%1==0)?String.valueOf((int)res1):String.valueOf(res1));
                answer.setText(answer.getText()+"X");
            }
        });
        bdiv.setOnClickListener(view -> {
            if(s.equals("")){
                if(res1!=0) result.setText((res1%1==0)?String.valueOf((int)res1):String.valueOf(res1));
                else result.setText(s);
                answer.setText(answer.getText().toString());
            }
            else if(add)
            {
                res1 = res1+Float.parseFloat(s);
                s = "";
                dot = true;
                add = false;
                div = true;
                result.setText((res1%1==0)?String.valueOf((int)res1):String.valueOf(res1));
                answer.setText(answer.getText()+"/");
            }
            else if(sub)
            {
                res1 = res1-Float.parseFloat(s);
                s="";
                sub = false;
                dot = true;
                div = true;
                result.setText((res1%1==0)?String.valueOf((int)res1):String.valueOf(res1));
                answer.setText(answer.getText()+"/");
            }
            else if(mul)
            {
                res1 = res1*Float.parseFloat(s);
                s = "";
                mul = false;
                dot = true;
                div = true;
                result.setText((res1%1==0)?String.valueOf((int)res1):String.valueOf(res1));
                answer.setText(answer.getText()+"/");
            }
            else if(div)
            {
                res1 = res1/Float.parseFloat(s);
                s="";
                dot = true;
                div = true;
                result.setText((res1%1==0)?String.valueOf((int)res1):String.valueOf(res1));
                answer.setText(answer.getText()+"/");
            }
            else {
                res1 = Float.parseFloat(s);
                s = "";
                div = true;
                dot=true;
                result.setText((res1%1==0)?String.valueOf((int)res1):String.valueOf(res1));
                answer.setText(answer.getText()+"/");
            }
        });
        bprcnt.setOnClickListener(view -> {
            if(s.equals("")){
                if(res1!=0) result.setText("="+res1);
                else result.setText(s);
                answer.setText(answer.getText().toString());
            }
            else {
                res1 = (float) (Float.parseFloat(s)/100);
                s = res1+"";
                dot = false;
                result.setText(s);
                answer.setText(answer.getText()+s);
            }
        });
        bequal.setOnClickListener(view -> {
            result.setText(result.getText().toString());
            answer.setText(answer.getText()+"=");
            dot = true;
            add = false;
            sub = false;
            mul = false;
            div = false;
            equal = true;
        });
        bclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String suba = answer.getText().toString();
                String lastCharacter = suba.charAt(suba.length()-1)+"";
                suba = suba.substring(0,suba.length()-1);
                if(equal)
                {
                    s = "";
                    result.setText(s);
                    answer.setText(s);
                    dot = true;
                    add= false;
                    sub = false;
                    mul=false;
                    div = false;
                    equal = false;
                    res1 =0;
                    res2 =0;
                }
                else if(lastCharacter.equals("+") || lastCharacter.equals("-") ||lastCharacter.equals("X")||lastCharacter.equals("/"))
                {
                    add= false;
                    sub = false;
                    mul=false;
                    div = false;
                    StringBuilder lastString = new StringBuilder();
                    for(int i=suba.length()-1;i>=0;i--)
                    {
                        if(suba.charAt(i)=='+')
                        {
                            add = true;
                            break;
                        } else if (suba.charAt(i)=='-') {
                            sub = true;
                            break;
                        }
                        else if (suba.charAt(i)=='X') {
                            mul = true;
                            break;
                        }
                        else if (suba.charAt(i)=='/') {
                            div = true;
                            break;
                        }
                        lastString.append(suba.charAt(i));
                    }
                    answer.setText(suba);
                    result.setText(result.getText().toString());
                    lastString.reverse();
                    s = lastString.toString();
                    if(add)
                    {
                        res1 = res1 - (Float.parseFloat(s));
                    }
                    else if(sub)
                    {
                        res1 = res1 + (Float.parseFloat(s));
                    }
                    else if(mul)
                    {
                        res1 = res1 / (Float.parseFloat(s));
                    }
                    else if(div)
                    {
                        res1 = res1 * (Float.parseFloat(s));
                    }
                }
                else if(lastCharacter.equals("."))
                {
                    s = s.substring(0,s.length()-1);
                    dot = true;
                    answer.setText(suba);
                    result.setText(result.getText().toString());
                }
                else {
                    if(s.length()==1)
                    {
                        s = "0";
                    }
                    else {
                        s = s.substring(0, s.length() - 1);
                    }
                    res2 = Float.parseFloat(s);
                    if(add)
                    {
                        res2 = Float.parseFloat(s);
                        float sum = res1 + res2;
                        temp = (sum%1==0)?String.valueOf((int)sum):String.valueOf(sum);
                        result.setText(temp);
                    }
                    else if(sub)
                    {
                        res2 = Float.parseFloat(s);
                        float sub = res1 - res2;
                        temp = ((sub%1==0)?String.valueOf((int)sub):String.valueOf(sub));
                        result.setText(temp);
                    }
                    else if(mul)
                    {
                        res2 = Float.parseFloat(s);
                        float mult = res1 * res2;
                        temp = ((mult%1==0)?String.valueOf((int)mult):String.valueOf(mult));
                        result.setText(temp);
                    }
                    else if(div)
                    {
                        res2 = Float.parseFloat(s);
                        float divs = res1 / res2;
                        temp = ((divs%1==0)?String.valueOf((int)divs):String.valueOf(divs));
                        result.setText(temp);
                    }
                    else {
                        result.setText(s);
                    }
                    answer.setText(suba);
                }
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = "";
                result.setText(s);
                answer.setText(s);
                dot = true;
                add= false;
                sub = false;
                mul=false;
                div = false;
                equal = false;
                res1 =0;
                res2 =0;
            }
        });
    }
}