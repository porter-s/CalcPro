package ru.smekalin.calcpro;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import ru.smekalin.calcpro.Classes.SymbolInput;

/**
 * Created by USER on 11.04.2016.
 */
public class NormalActivity  extends Activity implements View.OnClickListener {
    Button b_1, b_2, b_3, b_4, b_5, b_6, b_7, b_8, b_9, b_0, b_backspace, b_clean, b_divide, b_equally, b_minus, b_multiply, b_percent, b_sign, b_plus, b_dot, b_brackets;
    EditText tV_display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);

        tV_display = (EditText) findViewById(R.id.tV_display);
        tV_display.setSelection(tV_display.length());

        tV_display.setTextIsSelectable(true);
        //tV_display.setInputType(InputType.TYPE_NULL);

        tV_display.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.onTouchEvent(event);
                InputMethodManager imm = (InputMethodManager) v.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                if (imm != null) {
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }
                return true;
            }
        });
//        tV_display.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                tV_display.setFocusable(true);
////                switch (event.getAction()) {
////                    case MotionEvent.ACTION_DOWN:
////                        Layout layout = ((EditText) v).getLayout();
////                        float x = event.getX() + tV_display.getScrollX();
////                        int offset = layout.getOffsetForHorizontal(0, x);
////                        if(offset>0)
////                            if(x>layout.getLineMax(0))
////                                tV_display.setSelection(offset);
////                            else
////                                tV_display.setSelection(offset - 1);
////                        break;
////                }
//                return true;
//            }
//        });



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


        //      обработка вывода на дисплей уменьшение
//        Float dens = getResources().getDisplayMetrics().density;
//
//        if (tV_display.getTextSize() > tV_display.getHeight())
//        {
//            tV_display.setTextSize((tV_display.getHeight()/dens)-25);
//        }
//
//        if (tV_display.getTextSize()*2/3*(tV_display.length()-1) > tV_display.getWidth())
//        {
//            tV_display.setTextSize(((tV_display.getWidth()-10)*3/2/(tV_display.length()-1)/dens));
//        }

        //      обработка вывода на дисплей увеличение

    }
}
