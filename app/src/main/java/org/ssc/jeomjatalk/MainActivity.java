package org.ssc.jeomjatalk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setText(){


    }

    public void buttonClicked1(View v){


    }

    public void buttonClicked2(View v){


    }

    public void buttonClicked3(View v){


    }

    public void buttonClicked4(View v){


    }

    public void buttonClicked5(View v){


    }


    public void buttonClicked6(View v){


    }

    public void enter(View v){

        ToggleButton tb1, tb2, tb3, tb4, tb5, tb6;
        ToggleButton korean, english, number;

        tb1 = (ToggleButton)findViewById(R.id.button1);
        tb2 = (ToggleButton)findViewById(R.id.button2);
        tb3 = (ToggleButton)findViewById(R.id.button3);
        tb4 = (ToggleButton)findViewById(R.id.button4);
        tb5 = (ToggleButton)findViewById(R.id.button5);
        tb6 = (ToggleButton)findViewById(R.id.button6);

        korean = (ToggleButton)findViewById(R.id.Korean);
        english = (ToggleButton)findViewById(R.id.English);
        number = (ToggleButton)findViewById(R.id.Number);

        if(korean.isChecked()){

        }else if(english.isChecked()) {

        }else if(number.isChecked()){
           if(tb1.isChecked()){
               addText('1');
           }
        }

        tb1.setChecked(false);
        tb2.setChecked(false);
        tb3.setChecked(false);
        tb4.setChecked(false);
        tb5.setChecked(false);
        tb6.setChecked(false);

    }

    public void delete(View v){


    }

    public void korean(View v){

        ToggleButton tb;

        tb = (ToggleButton)findViewById(R.id.English);
        tb.setChecked(false);

        tb = (ToggleButton)findViewById(R.id.Number);
        tb.setChecked(false);
    }

    public void english(View v){

        ToggleButton tb;

        tb = (ToggleButton)findViewById(R.id.Korean);
        tb.setChecked(false);

        tb = (ToggleButton)findViewById(R.id.Number);
        tb.setChecked(false);
    }

    public void number(View v){

        ToggleButton tb;

        tb = (ToggleButton)findViewById(R.id.Korean);
        tb.setChecked(false);

        tb = (ToggleButton)findViewById(R.id.English);
        tb.setChecked(false);
    }

    public void addText(char c){

        TextView tv = (TextView)findViewById(R.id.TextView);

        CharSequence str = tv.getText();

        tv.setText(c);
    }
}
