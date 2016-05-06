package ru.smekalin.calcpro;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ru.smekalin.calcpro.Classes.SymbolInput;

/**
 * Created by USER on 11.04.2016.
 */
public class NormalActivity  extends Activity implements View.OnClickListener {
    Button b_1, b_2, b_3, b_4, b_5, b_6, b_7, b_8, b_9, b_0, b_backspace, b_clean, b_divide, b_equally, b_minus, b_multiply, b_percent, b_sign, b_plus, b_dot, b_brackets;
    TextView tV_display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);

        tV_display = (TextView) findViewById(R.id.tV_display);

        b_0 = (Button) findViewById(R.id.b_0);
        b_1 = (Button) findViewById(R.id.b_1);
        b_2 = (Button) findViewById(R.id.b_2);
        b_3 = (Button) findViewById(R.id.b_3);
        b_4 = (Button) findViewById(R.id.b_4);
        b_5 = (Button) findViewById(R.id.b_5);
        b_6 = (Button) findViewById(R.id.b_6);
        b_7 = (Button) findViewById(R.id.b_7);
        b_8 = (Button) findViewById(R.id.b_8);
        b_9 = (Button) findViewById(R.id.b_9);

        b_backspace = (Button) findViewById(R.id.b_backspace);
        b_clean = (Button) findViewById(R.id.b_clean);
        b_divide = (Button) findViewById(R.id.b_divide);
        b_equally = (Button) findViewById(R.id.b_equally);
        b_minus = (Button) findViewById(R.id.b_minus);
        b_multiply = (Button) findViewById(R.id.b_multiply);
        b_percent = (Button) findViewById(R.id.b_percent);
        b_sign = (Button) findViewById(R.id.b_sign);
        b_dot = (Button) findViewById(R.id.b_dot);
        b_plus = (Button) findViewById(R.id.b_plus);
        b_brackets = (Button) findViewById(R.id.b_brackets);

        b_0.setOnClickListener(this);
        b_1.setOnClickListener(this);
        b_2.setOnClickListener(this);
        b_3.setOnClickListener(this);
        b_4.setOnClickListener(this);
        b_5.setOnClickListener(this);
        b_6.setOnClickListener(this);
        b_7.setOnClickListener(this);
        b_8.setOnClickListener(this);
        b_9.setOnClickListener(this);

        b_backspace.setOnClickListener(this);
        b_clean.setOnClickListener(this);
        b_divide.setOnClickListener(this);
        b_equally.setOnClickListener(this);
        b_minus.setOnClickListener(this);
        b_multiply.setOnClickListener(this);
        b_percent.setOnClickListener(this);
        b_sign.setOnClickListener(this);
        b_dot.setOnClickListener(this);
        b_plus.setOnClickListener(this);
        b_brackets.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        SymbolInput.inpSymbol(v.getId(), tV_display);
    }
}
