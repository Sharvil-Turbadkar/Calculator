package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {
    public  static  int i=1;
    private static EditText tv;
    private static Button cl0,cl1, cl2, cl3,cl4,cl5,cl6,cl7,cl8,cl9,clpoint;
    private static Button sum, diff, equal,mul,div,clear,square,squarert;
    public static boolean sw = false;
    public static String num1, num2;
    public static int choice = 0;
    public static double num3;
    public static String regex = "-?\\d+(\\.\\d+)?";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        calculator();
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void calculator() {
        tv = (EditText) findViewById(R.id.textView7);
        clpoint=(Button)findViewById(R.id.point);
        cl0=(Button)findViewById(R.id.zero);
        cl1 = (Button) findViewById(R.id.one);
        cl2 = (Button) findViewById(R.id.two);
        cl3 = (Button) findViewById(R.id.three);
        cl4=(Button)findViewById(R.id.four);
        cl5=(Button)findViewById(R.id.five);
        cl6=(Button)findViewById(R.id.six);
        cl7=(Button)findViewById(R.id.seven);
        cl8=(Button)findViewById(R.id.eight);
        cl9=(Button)findViewById(R.id.nine);
        sum = (Button) findViewById(R.id.sum);
        diff = (Button) findViewById(R.id.difference);
        mul=(Button)findViewById(R.id.multiply);
        div=(Button)findViewById(R.id.divide);
        clear=(Button)findViewById(R.id.AC);
        square=(Button)findViewById(R.id.square);
        square.setText("xⁿ" );
        squarert=(Button)findViewById(R.id.squareroot);
        squarert.setText("√x");
        clpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sw == false && choice == 0) {
                    num1 = clpoint.getText().toString();
                    tv.setText(num1);
                    sw = true;
                } else if (sw == true && choice == 0) {
                    num1 = num1 + clpoint.getText().toString();
                    tv.setText(num1);
                } else if (!sw && (choice == 1 || choice == 2)) {
                    num2 = clpoint.getText().toString();
                    sw = true;
                    tv.setText(num2);
                } else
                {
                    num2 = num2 + clpoint.getText().toString();

                    tv.setText(num2);
                }
            }
        });

        cl0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sw == false && choice == 0) {
                    num1 = cl0.getText().toString();
                    tv.setText(num1);
                    sw = true;
                } else if (sw == true && choice == 0) {
                    num1 = num1 + cl0.getText().toString();
                    tv.setText(num1);
                } else if (!sw && (choice == 1 || choice == 2)) {
                    num2 = cl0.getText().toString();
                    sw = true;
                    tv.setText(num2);
                } else
                {
                    num2 = num2 + cl0.getText().toString();

                    tv.setText(num2);
                }
            }
        });
        cl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sw == false && choice == 0) {
                    num1 = cl1.getText().toString();
                    tv.setText(num1);
                    sw = true;
                } else if (sw == true && choice == 0) {
                    num1 = num1 + cl1.getText().toString();
                    tv.setText(num1);
                } else if (!sw && (choice == 1 || choice == 2)) {
                    num2 = cl1.getText().toString();
                    sw = true;
                    tv.setText(num2);
                } else
                    {
                    num2 = num2 + cl1.getText().toString();

                    tv.setText(num2);
                }
            }
        });
        cl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sw == false && choice == 0) {
                    num1 = cl2.getText().toString();
                    tv.setText(num1);
                    sw = true;
                } else if (sw == true && choice == 0) {
                    num1 = num1 + cl2.getText().toString();
                    tv.setText(num1);
                } else if (!sw && (choice == 1 || choice == 2)) {
                    num2 = cl2.getText().toString();
                    sw = true;
                    tv.setText(num2);
                } else {
                    num2 = num2 + cl2.getText().toString();
                    tv.setText(num2);
                }
            }

        });
        cl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sw == false && choice == 0) {
                    num1 = cl3.getText().toString();
                    tv.setText(num1);
                    sw = true;
                } else if (sw == true && choice == 0) {
                    num1 = num1 + cl3.getText().toString();
                    tv.setText(num1);
                } else if (!sw && (choice == 1 || choice == 2)) {
                    num2 = cl3.getText().toString();
                    sw = true;
                    tv.setText(num2);
                } else {
                    num2 = num2 + cl3.getText().toString();
                    tv.setText(num2);
                }
            }
        });
        cl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sw == false && choice == 0) {
                    num1 = cl4.getText().toString();
                    tv.setText(num1);
                    sw = true;
                } else if (sw == true && choice == 0) {
                    num1 = num1 + cl4.getText().toString();
                    tv.setText(num1);
                } else if (!sw && (choice == 1 || choice == 2)) {
                    num2 = cl4.getText().toString();
                    sw = true;
                    tv.setText(num2);
                } else {
                    num2 = num2 + cl4.getText().toString();
                    tv.setText(num2);
                }
            }
        });
        cl5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sw == false && choice == 0) {
                    num1 = cl5.getText().toString();
                    tv.setText(num1);
                    sw = true;
                } else if (sw == true && choice == 0) {
                    num1 = num1 + cl5.getText().toString();
                    tv.setText(num1);
                } else if (!sw && (choice == 1 || choice == 2)) {
                    num2 = cl5.getText().toString();
                    sw = true;
                    tv.setText(num2);
                } else {
                    num2 = num2 + cl5.getText().toString();
                    tv.setText(num2);
                }
            }
        });
        cl6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sw == false && choice == 0) {
                    num1 = cl6.getText().toString();
                    tv.setText(num1);
                    sw = true;
                } else if (sw == true && choice == 0) {
                    num1 = num1 + cl6.getText().toString();
                    tv.setText(num1);
                } else if (!sw && (choice == 1 || choice == 2)) {
                    num2 = cl6.getText().toString();
                    sw = true;
                    tv.setText(num2);
                } else {
                    num2 = num2 + cl6.getText().toString();
                    tv.setText(num2);
                }
            }
        });
        cl7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sw == false && choice == 0) {
                    num1 = cl7.getText().toString();
                    tv.setText(num1);
                    sw = true;
                } else if (sw == true && choice == 0) {
                    num1 = num1 + cl7.getText().toString();
                    tv.setText(num1);
                } else if (!sw && (choice == 1 || choice == 2)) {
                    num2 = cl7.getText().toString();
                    sw = true;
                    tv.setText(num2);
                } else {
                    num2 = num2 + cl7.getText().toString();
                    tv.setText(num2);
                }
            }
        });
        cl8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sw == false && choice == 0) {
                    num1 = cl8.getText().toString();
                    tv.setText(num1);
                    sw = true;
                } else if (sw == true && choice == 0) {
                    num1 = num1 + cl8.getText().toString();
                    tv.setText(num1);
                } else if (!sw && (choice == 1 || choice == 2)) {
                    num2 = cl8.getText().toString();
                    sw = true;
                    tv.setText(num2);
                } else {
                    num2 = num2 + cl8.getText().toString();
                    tv.setText(num2);
                }
            }
        });
        cl9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sw == false && choice == 0) {
                    num1 = cl9.getText().toString();
                    tv.setText(num1);
                    sw = true;
                } else if (sw == true && choice == 0) {
                    num1 = num1 + cl9.getText().toString();
                    tv.setText(num1);
                } else if (!sw && (choice == 1 || choice == 2)) {
                    num2 = cl9.getText().toString();
                    sw = true;
                    tv.setText(num2);
                } else {
                    num2 = num2 + cl9.getText().toString();
                    tv.setText(num2);
                }
            }
        });
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
                choice = 1;
                sw = false;
            }
        });
        diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
                choice = 2;
                sw = false;
            }
        });
       mul.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               tv.setText("");
               choice = 3;
               sw = false;
           }
       });
       div.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               tv.setText("");
               choice = 4;
               sw = false;
           }
       });
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
                choice = 5;
                sw = false;
            }
        });
        squarert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                num3= Math.sqrt(Double.parseDouble(num1));
                tv.setText(Double.toString(num3));
            }
        });

        equal = (Button)findViewById(R.id.equals);
        {
            equal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    if (choice == 1) {
                        num3 = Double.parseDouble(num1) + Double.parseDouble(num2);
                        tv.setText(Double.toString(num3));
                    }
                    else if (choice == 2) {
                        num3 = Double.parseDouble(num1) - Double.parseDouble(num2);
                        tv.setText(Double.toString(num3));
                    }
                    else if (choice == 3) {
                        num3 = Double.parseDouble(num1) * Double.parseDouble(num2);
                        tv.setText(Double.toString(num3));
                    }
                    else if (choice == 4) {
                        num3 = Double.parseDouble(num1) / Double.parseDouble(num2);
                        tv.setText(Double.toString(num3));
                    }
                    else if (choice == 5)
                    {
                        num3= Math.pow(Double.parseDouble(num1),Double.parseDouble(num2));
                        tv.setText(Double.toString(num3));
                     }

                    else
                    {
                        Toast.makeText(Calculator.this,"Error",Toast.LENGTH_LONG).show();
                    }

                }
            });
        }
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
                num1="";
                num2="";
                choice=0;
                num3=0;
            }
        });
    }
}
