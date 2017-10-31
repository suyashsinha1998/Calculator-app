package com.example.suyesh.calculator1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button zero,one,two,three,four,five,six,seven,eight,nine,dot,clr,Equal,add,sub,mul,div,ac;
    private TextView info1,result,info2,info3,Mark;
    private Double val1 = Double.NaN , val2 = Double.NaN;
    private final char addition='+' , subtraction = '-' , multiplication = '*' , division='/' , equal='=' ;
    private char action;
    private int ctr=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignValue();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ctr==0){
                    info1.setText(info1.getText().toString()+"0");
                }
                else {
                    info2.setText(info2.getText().toString()+"0");
                }

            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ctr==0){
                    info1.setText(info1.getText().toString()+"1");
                }
                else {
                    info2.setText(info2.getText().toString()+"1");
                }
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ctr==0){
                    info1.setText(info1.getText().toString()+"2");
                }
                else {
                    info2.setText(info2.getText().toString()+"2");
                }
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ctr==0){
                    info1.setText(info1.getText().toString()+"3");
                }
                else {
                    info2.setText(info2.getText().toString()+"3");
                }
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ctr==0){
                    info1.setText(info1.getText().toString()+"4");
                }
                else {
                    info2.setText(info2.getText().toString()+"4");
                }
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ctr==0){
                    info1.setText(info1.getText().toString()+"5");
                }
                else {
                    info2.setText(info2.getText().toString()+"5");
                }
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ctr==0){
                    info1.setText(info1.getText().toString()+"6");
                }
                else {
                    info2.setText(info2.getText().toString()+"6");
                }
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ctr==0){
                    info1.setText(info1.getText().toString()+"7");
                }
                else {
                    info2.setText(info2.getText().toString()+"7");
                }
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ctr==0){
                    info1.setText(info1.getText().toString()+"8");
                }
                else {
                    info2.setText(info2.getText().toString()+"8");
                }
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ctr==0){
                    info1.setText(info1.getText().toString()+"9");
                }
                else {
                    info2.setText(info2.getText().toString()+"9");
                }
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ctr==0){
                    info1.setText(info1.getText().toString()+".");
                }
                else {
                    info2.setText(info2.getText().toString()+".");
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((info1.getText().toString().length()==0)&&(info2.getText().toString().length()==0))
                {
                    result.setText("Please enter the values");
                }
                else {
                    if ((info2.getText().toString().length()>0) || (ctr==0))
                    {
                        action = addition;
                        info3.setText("+");
                        ctr++;
                        compute();
                        info1.setText(String.valueOf(val1));
                        info2.setText(null);

                    }
                    else
                    {
                        action = addition;
                        info3.setText("+");
                    }
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((info1.getText().toString().length()==0)&&(info2.getText().toString().length()==0))
                {
                    result.setText("Please enter the values");
                }
                else {
                    if ((info2.getText().toString().length()>0) || (ctr==0))
                    {
                        action = subtraction;
                        info3.setText("-");
                        ctr++;
                        compute();
                        info1.setText(String.valueOf(val1));
                        info2.setText(null);

                    }
                    else
                    {
                        action = subtraction;
                        info3.setText("-");
                    }
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((info1.getText().toString().length()==0)&&(info2.getText().toString().length()==0))
                {
                    result.setText("Please enter the values");
                }
                else {
                    if ((info2.getText().toString().length()>0) || (ctr==0))
                    {
                        action = multiplication;
                        info3.setText("*");
                        ctr++;
                        compute();
                        info1.setText(String.valueOf(val1));
                        info2.setText(null);

                    }
                    else
                    {
                        action = multiplication;
                        info3.setText("*");
                    }
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((info1.getText().toString().length()==0)&&(info2.getText().toString().length()==0))
                {
                    result.setText("Please enter the values");
                }
                else {
                    if ((info2.getText().toString().length()>0) || (ctr==0))
                    {
                        action = division;
                        info3.setText("/");
                        ctr++;
                        compute();
                        info1.setText(String.valueOf(val1));
                        info2.setText(null);

                    }
                    else
                    {
                        action = division;
                        info3.setText("/");
                    }
                }
            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((info1.getText().toString().length()==0)&&(info2.getText().toString().length()==0))
                {
                    result.setText("Please enter the values");
                }
                else {
                    if (ctr == 0) {
                        info1.setText(info1.getText().toString().substring(0, info1.getText().toString().length() - 1));
                    } else {
                        if (info2.getText().toString().length()>0) {

                            info2.setText(info2.getText().toString().substring(0, info2.getText().toString().length() - 1));
                        }
                    }
                }
            }
        });

        Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((info1.getText().toString().length()>0) && (info2.getText().toString().length()>0))
                {
                    compute();
                    result.setText(String.valueOf(val1));
                    info1.setText(null);
                    info2.setText(null);
                    info3.setText(null);
                    val1=val2=Double.NaN;
                    ctr=0;

                }
                else{
                    if (info1.getText().toString().length()>0)
                    {
                        result.setText(info1.getText().toString());
                        info1.setText(null);
                        info2.setText(null);
                        info3.setText(null);
                        val1=val2=Double.NaN;
                        ctr=0;
                    }
                    else {
                        result.setText("Please enter the values");
                    }
                }

            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info1.setText(null);
                info2.setText(null);
                info3.setText(null);
                result.setText(null);
                val1=val2=Double.NaN;
                ctr=0;
            }
        });


    }
    private void assignValue(){
        zero = (Button)findViewById(R.id.btn0);
        one = (Button)findViewById(R.id.btn1);
        two = (Button)findViewById(R.id.btn2);
        three = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five = (Button)findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);
        seven = (Button)findViewById(R.id.btn7);
        eight = (Button)findViewById(R.id.btn8);
        nine = (Button)findViewById(R.id.btn9);
        dot = (Button)findViewById(R.id.btnDot);
        clr = (Button)findViewById(R.id.btnClear);
        Equal = (Button)findViewById(R.id.btnEqual);
        add = (Button)findViewById(R.id.btnAdd);
        sub = (Button)findViewById(R.id.btnSub);
        mul = (Button)findViewById(R.id.btnMul);
        div = (Button)findViewById(R.id.btnDiv);
        ac = (Button)findViewById(R.id.btnAc);
        info1 = (TextView)findViewById(R.id.tvInfo1);
        info2 = (TextView)findViewById(R.id.tvInfo2);
        info3 = (TextView)findViewById(R.id.tvInfo3);
        result = (TextView)findViewById(R.id.tvResult);
        Mark = (TextView)findViewById(R.id.tvMark);

    }

    private void compute(){
        try {

            if (!Double.isNaN(val1)) {
                val2 = Double.parseDouble(info2.getText().toString());
                switch (action) {
                    case addition:
                        val1 = val1 + val2;
                        break;
                    case subtraction:
                        val1 = val1 - val2;
                        break;
                    case multiplication:
                        val1 = val1 * val2;
                        break;
                    case division:
                        val1 = val1 / val2;
                        break;
                    case equal:
                        break;
                }

            } else {
                val1 = Double.parseDouble(info1.getText().toString());
            }
        }
            catch (Exception e)
    {
        result.setText("Please enter valid inputs");
    }
    }

}
