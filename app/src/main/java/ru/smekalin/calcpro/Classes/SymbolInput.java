package ru.smekalin.calcpro.Classes;

import android.util.Log;
import android.widget.TextView;

import ru.smekalin.calcpro.R;

/**
 * Created by USER on 05.05.2016.
 */
public class SymbolInput {

    static String TAG = "SymbolInput";
    static Display display = new Display();

    public static void inpSymbol(int _id, TextView _tV_display)
    {
        //Log.e(TAG,"key press");

        switch (_id)
        {
           /*кнопки цыфры*/
            case R.id.b_0:
                Log.e(TAG,"0");
                display.setDisplay(_tV_display,"0");
                break;

            case R.id.b_1:
                Log.e(TAG,"1");
                display.setDisplay(_tV_display, "1");
                break;

            case R.id.b_2:
                Log.e(TAG,"2");
                display.setDisplay(_tV_display, "2");
                break;

            case R.id.b_3:
                Log.e(TAG,"3");
                display.setDisplay(_tV_display, "3");
                break;

            case R.id.b_4:
                Log.e(TAG,"4");
                display.setDisplay(_tV_display, "4");
                break;

            case R.id.b_5:
                Log.e(TAG,"5");
                display.setDisplay(_tV_display, "5");
                break;

            case R.id.b_6:
                Log.e(TAG,"6");
                display.setDisplay(_tV_display, "6");
                break;

            case R.id.b_7:
                Log.e(TAG,"7");
                display.setDisplay(_tV_display, "7");
                break;

            case R.id.b_8:
                Log.e(TAG,"8");
                display.setDisplay(_tV_display, "8");
                break;

            case R.id.b_9:
                Log.e(TAG,"9");
                display.setDisplay(_tV_display, "9");
                break;

            /*кнопки управления*/

            case R.id.b_backspace:
                Log.e(TAG,"b_backspace");
                display.setOperationBackspaseDisplay(_tV_display);
                break;

            case R.id.b_clean:
                Log.e(TAG,"b_clean");
                display.clean(_tV_display);
                break;

            case R.id.b_divide:
                Log.e(TAG,"b_divide");
                display.setOperationDisplay(_tV_display, "÷");
                break;

            case R.id.b_equally:
                Log.e(TAG,"b_equally");
                break;

            case R.id.b_minus:
                Log.e(TAG,"b_minus");
                display.setOperationDisplay(_tV_display,"-");
                break;

            case R.id.b_multiply:
                Log.e(TAG,"b_multiply");
                display.setOperationDisplay(_tV_display, "×");
                break;

            case R.id.b_percent:
                Log.e(TAG,"b_percent");
                display.setOperationDisplay(_tV_display, "%");
                break;

            case R.id.b_sign:
                Log.e(TAG, "b_sign");
                break;

            case R.id.b_dot:
                Log.e(TAG,"b_dot");
                display.setOperationDisplay(_tV_display, ".");
                break;

            case R.id.b_plus:
                Log.e(TAG,"b_plus");
                display.setOperationDisplay(_tV_display, "+");
                break;

            case R.id.b_brackets:
                Log.e(TAG,"b_plus");
                break;
        }
    }

}
