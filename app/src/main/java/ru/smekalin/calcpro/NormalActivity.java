package ru.smekalin.calcpro;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.text.Layout;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import ru.smekalin.calcpro.Classes.SymbolInput;

/**
 * Created by USER on 11.04.2016.
 */
public class NormalActivity  extends Activity implements View.OnClickListener {
    Button b_1, b_2, b_3, b_4, b_5, b_6, b_7, b_8, b_9, b_0, b_backspace, b_clean, b_divide, b_equally, b_minus, b_multiply, b_percent, b_sign, b_plus, b_dot, b_brackets;
    EditText tV_display;
    String TAG = "NormalActivity";
    Float[] mass= new Float[50];
    int kol=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);

        tV_display = (EditText) findViewById(R.id.tV_display);

        tV_display.setTextIsSelectable(true);
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
        tV_display.setSelection(tV_display.length());

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
        Float dens = getResources().getDisplayMetrics().density;

//        if (tV_display.getTextSize() > tV_display.getHeight())
//        {
//            tV_display.setTextSize((tV_display.getHeight()/dens)-25);
//            Log.e(TAG,"tV_display.setTextSize((tV_display.getHeight()/dens)-25)="+tV_display.getTextSize());
//        }
        if(tV_display.length()==100)
        {
            Toast toast = Toast.makeText(getApplicationContext(),"Максимальное колличество символов!(100)", Toast.LENGTH_SHORT);
            toast.show();
        }

//        if (tV_display.getTextSize() > tV_display.getHeight())
//        {
//            tV_display.setTextSize((tV_display.getHeight() / dens) - 25);
//        }

        float a=0,b=0,c=0;
        a=(tV_display.getTextSize()/dens);
        b=tV_display.length()-1;
        c=a*b;
        Log.e(TAG," a="+ a+" b="+ b+" c="+ c);
        Log.e(TAG,"StringSize="+((tV_display.getTextSize()/dens)*tV_display.length()-1)+"\n Width="+tV_display.getWidth()/dens);
        Log.e(TAG,"length="+(tV_display.length()-1)+"\n Size="+(tV_display.getTextSize()/dens));
        if (((tV_display.getTextSize()/dens)*tV_display.length()-1)>tV_display.getWidth()/dens)
        {

            while(((tV_display.getTextSize()/dens)*tV_display.length()-1)>tV_display.getWidth()/dens)
            {
                Log.e(TAG,"TextSize="+tV_display.getTextSize()/dens);
                tV_display.setTextSize((tV_display.getTextSize()/dens)-2);
                Log.e(TAG,"setTextSize="+tV_display.getTextSize()/dens);
            }
        }

////        Log.e(TAG,"getLineCount="+tV_display.getLineCount()+"\n getTextSize="+tV_display.getTextSize());
////        tV_display.setTextSize(60);
//
////        Log.e(TAG,"↓ "+(tV_display.getTextSize()*2/3*(tV_display.length()-1))+">"+tV_display.getWidth());
////        if(tV_display.length()>1)
//
//        if ((tV_display.getTextSize()*2/3*(tV_display.length()-1) > tV_display.getWidth())&&(tV_display.getTextSize()>100))
//        {
//            tV_display.setTextSize(((tV_display.getWidth() - 10) * 3 / 2 / (tV_display.length() - 1) / dens));
//            Log.e(TAG, "↓ " +" tV_display.getTextSize="+ tV_display.getTextSize() + "tV_display.getWidth()-10=" + (tV_display.getWidth() - 10) + "\n" + "(tV_display.length()-1)/dens=" + (tV_display.length() - 1) / dens + "\n");
//            mass[kol]=tV_display.getTextSize()/4;
//            kol++;
//        }
////
//        Log.e(TAG,"dens = "+dens);
//        if((tV_display.getLineCount()<=1)&&(kol>0)&&(v.getId()==R.id.b_backspace))
//        {
//
//            kol--;
//            tV_display.setTextSize(mass[kol]);
//            Log.e(TAG, "qwerty="+ mass[kol]);
//        }

    }
}
