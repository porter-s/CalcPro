package ru.smekalin.calcpro.Classes;

import android.app.Activity;
import android.util.Log;
import android.widget.EditText;

/**
 * Created by USER on 12.05.2016.
 */
public class DisplayCalibration {
    static String TAG = "DisplayCalibration";

    public static void Calibration(EditText _tV_display, Activity _act)
    {
        Float dens = _act.getResources().getDisplayMetrics().density;

        float a=0,b=0,c=0,f=0;
        a=(_tV_display.getTextSize()/dens);
        b=_tV_display.length()-1;
        c=a*b*2/3;
        f=_tV_display.getWidth()/dens;

        if (c>f)
        {
            float e=c;
            while((e>f)&&(a>34))
            {
                Log.e(TAG, "e=" + e + " a=" + a);
                _tV_display.setTextSize(a-2);
                e=(a-2)*b*2/3;
                a=a-2;
                b=_tV_display.length()-1;

            }
        }

        if ((c<f)&&(_tV_display.getLineCount()<2))
        {
            float e=c;
            while((e<f)&&(a<60))
            {
                Log.e(TAG, "e=" + e + " a=" + a);
                _tV_display.setTextSize(a+2);
                e=(a+2)*b*2/3;
                a=a+2;
                b=_tV_display.length()-1;
            }
        }
    }
}
