package ru.smekalin.calcpro.Classes;

import android.app.Instrumentation;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Юра on 08.05.2016.
 */
public class Display {

    String TAG = "Display";
    public String getDisplay(EditText _tV_display)
    {
        return null;
    }

    public void setDisplay(EditText _tV_display, String _str)
    {
        _tV_display.setText(_tV_display.getText()+_str);
        _tV_display.setSelection(_tV_display.length());
    }

    public void clean(EditText _tV_display)
    {
        _tV_display.setText("");
        _tV_display.setSelection(_tV_display.length());
    }

    public void setOperationDisplay(EditText _tV_display, String _str)
    {
//        if(_tV_display.getText()!="")
//            _tV_display.setText(_tV_display.getText()+_str);

        String buf_s = new String();
        buf_s = String.valueOf(_tV_display.getText());
        int poz=buf_s.length()-1;

        if (buf_s.length()!=0)
        {
            if ((buf_s.charAt(poz)!='.')&&(buf_s.charAt(poz)!='+')&&(buf_s.charAt(poz)!='-')&&(buf_s.charAt(poz)!='÷')&&(buf_s.charAt(poz)!='×')&&(buf_s.charAt(poz)!='(')) _tV_display.setText(_tV_display.getText()+_str);
                else if((buf_s.charAt(poz)=='(')&&_str=="-") _tV_display.setText(_tV_display.getText()+_str);
                    else if((buf_s.charAt(poz) == '(') && _str == "+") _tV_display.setText(_tV_display.getText()+_str);
            Log.e(TAG, "buf_s.charAt(poz)="+buf_s.charAt(poz));
        }
        _tV_display.setSelection(_tV_display.length());
    }

    public void setOperationBackspaseDisplay(EditText _tV_display)
    {

//        if(_tV_display.length()!=0)
//        {
//            String buf_s = new String();
//            buf_s = String.valueOf(_tV_display.getText());
//
//            char buf_ch[] = new char[buf_s.length() - 1];
//            buf_s.getChars(0, buf_s.length() - 1, buf_ch, 0);
//
//            _tV_display.setText(String.valueOf(buf_ch));
//        }
//        _tV_display.setSelection(_tV_display.length());
    }

    public void setOperationBracketsDisplay(EditText _tV_display)
    {
        String buf_s = new String();
        buf_s = String.valueOf(_tV_display.getText());
        int poz=buf_s.length()-1;

        int kol_open=0, kol_close=0;

        if (buf_s.length()!=0)
        {
            for(int i=0;i<buf_s.length();i++)
            {
                if (buf_s.charAt(i)=='(') kol_open++;
                if (buf_s.charAt(i)==')') kol_close++;
            }
//            Log.e(TAG,"kol_open="+kol_open+" kol_close="+kol_close);
            if ((buf_s.charAt(poz)=='+')||(buf_s.charAt(poz)=='-')||(buf_s.charAt(poz)=='÷')||(buf_s.charAt(poz)=='×')||(buf_s.charAt(poz)=='(')) _tV_display.setText(_tV_display.getText()+"(");
                else if (kol_open>kol_close) _tV_display.setText(_tV_display.getText()+")");
                        else _tV_display.setText(_tV_display.getText()+"×(");
        }else _tV_display.setText(_tV_display.getText()+"(");
        _tV_display.setSelection(_tV_display.length());
    }

    public void setOperationPercentDisplay(EditText _tV_display)
    {
        String buf_s = new String();
        buf_s = String.valueOf(_tV_display.getText());
        int poz=buf_s.length()-1;

        if (buf_s.length()!=0)
        {
            if ((buf_s.charAt(poz)!='.')&&(buf_s.charAt(poz)!='+')&&(buf_s.charAt(poz)!='-')&&(buf_s.charAt(poz)!='÷')&&(buf_s.charAt(poz)!='×')&&(buf_s.charAt(poz)!='(')&&(buf_s.charAt(poz)!='%')) _tV_display.setText(_tV_display.getText()+"%");
            Log.e(TAG, "buf_s.charAt(poz)="+buf_s.charAt(poz));
        }
        _tV_display.setSelection(_tV_display.length());
    }

    public void setOperationDotDisplay(EditText _tV_display)
    {
        String buf_s = new String();
        buf_s = String.valueOf(_tV_display.getText());
        int poz=buf_s.length()-1;

        if (buf_s.length()!=0)
        {
            if (buf_s.charAt(poz)!='.')
            {
                if ((buf_s.charAt(poz)==')')||(buf_s.charAt(poz)=='%')) _tV_display.setText(_tV_display.getText()+"×0.");
                else if ((buf_s.charAt(poz)== '+')||(buf_s.charAt(poz)== '-')||(buf_s.charAt(poz)== '÷')||(buf_s.charAt(poz)== '×')||(buf_s.charAt(poz)== '(')) _tV_display.setText(_tV_display.getText()+"0.");
                else
                {
                    Boolean flag=false;
                    if(buf_s.lastIndexOf(".")==-1) _tV_display.setText(_tV_display.getText()+".");
                        else for (int i=buf_s.lastIndexOf(".");i<buf_s.length();i++)
                             {
                                 if ((buf_s.charAt(i)== '+')||(buf_s.charAt(i)== '-')||(buf_s.charAt(i)== '÷')||(buf_s.charAt(i)== '×')||(buf_s.charAt(i)== '(')||(buf_s.charAt(i)== ')')||(buf_s.charAt(i)== '%')) flag=true;
                             }
                    if(flag) _tV_display.setText(_tV_display.getText()+".");
                }
                Log.e(TAG, "buf_s.charAt(poz)="+buf_s.charAt(poz));
            }

        }else _tV_display.setText(_tV_display.getText()+"0.");
        _tV_display.setSelection(_tV_display.length());
    }

}
