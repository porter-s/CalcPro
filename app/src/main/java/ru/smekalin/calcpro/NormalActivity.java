package ru.smekalin.calcpro;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by USER on 11.04.2016.
 */
public class NormalActivity  extends Activity {
    Button b_1, b_2, b_3, b_4, b_5, b_6, b_7, b_8, b_9, b_0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);

        b_0 = (Button) findViewById(R.id.b0);
        b_1 = (Button) findViewById(R.id.b1);
        b_2 = (Button) findViewById(R.id.b2);
        b_3 = (Button) findViewById(R.id.b3);
        b_4 = (Button) findViewById(R.id.b4);
        b_5 = (Button) findViewById(R.id.b5);
        b_6 = (Button) findViewById(R.id.b6);
        b_7 = (Button) findViewById(R.id.b7);
        b_8 = (Button) findViewById(R.id.b8);
        b_9 = (Button) findViewById(R.id.b9);

        b_0.setOnClickListener(onClick(this));
    }

    private View.OnClickListener onClick(NormalActivity normalActivity) {

        return null;
    }

}
