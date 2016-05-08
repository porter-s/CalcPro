package ru.smekalin.calcpro.Classes;

import android.util.Log;
import android.widget.TextView;

/**
 * Created by Юра on 08.05.2016.
 */
public class Display {

    public String getDisplay(TextView _tV_display)
    {
        return null;
    }

    public void setDisplay(TextView _tV_display, String _str)
    {
        _tV_display.setText(_tV_display.getText()+_str);
    }

    public void clean(TextView _tV_display)
    {
        _tV_display.setText("");
    }

    public void setOperationDisplay(TextView _tV_display, String _str)
    {
        if(_tV_display.getText()!="")
            _tV_display.setText(_tV_display.getText()+_str);
    }

    public void setOperationBackspaseDisplay(TextView _tV_display)
    {
        if(_tV_display.length()!=0)
        {
            String buf_s = new String();
            buf_s = (String) _tV_display.getText();

            char buf_ch[] = new char[buf_s.length() - 1];
            buf_s.getChars(0, buf_s.length() - 1, buf_ch, 0);

            _tV_display.setText(String.valueOf(buf_ch));
        }
    }

    public void setOperationBracketsDisplay(TextView _tV_display)
    {
        String buf_s = new String();
        buf_s = (String) _tV_display.getText();

        int pos_o=buf_s.lastIndexOf('(');
        int pos_c=buf_s.lastIndexOf(')');

        Log.e("b_brackets", "pos_o="+pos_o+" pos_c="+pos_c);
        if( (pos_o<0)&&(pos_c<0))
        {
            _tV_display.setText(_tV_display.getText()+"(");
        }else
            if(pos_o<pos_c) _tV_display.setText(_tV_display.getText() + "(");
                else  _tV_display.setText(_tV_display.getText() + ")");
    }
}
