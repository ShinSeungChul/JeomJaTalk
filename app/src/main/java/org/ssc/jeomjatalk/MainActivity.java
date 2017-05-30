package org.ssc.jeomjatalk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    boolean cl = false;
    boolean timerOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public boolean on1(){
        ToggleButton tb = (ToggleButton)findViewById(R.id.button1);
        return tb.isChecked();
    }

    public boolean on2(){
        ToggleButton tb = (ToggleButton)findViewById(R.id.button2);
        return tb.isChecked();
    }

    public boolean on3(){
        ToggleButton tb = (ToggleButton)findViewById(R.id.button3);
        return tb.isChecked();
    }

    public boolean on4(){
        ToggleButton tb = (ToggleButton)findViewById(R.id.button4);
        return tb.isChecked();
    }
    public boolean on5(){
        ToggleButton tb = (ToggleButton)findViewById(R.id.button5);
        return tb.isChecked();
    }
    public boolean on6(){
        ToggleButton tb = (ToggleButton)findViewById(R.id.button6);
        return tb.isChecked();
    }

    public void enter(){

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
            if((!on1())&&(!on2())&&(!on3())&&(!on4())&&(!on5())&&(on6())){
                cl = true;
            } else if(cl){
                if((on1())&&(!on2())&&(!on3())&&(!on4())&&(!on5())&&(!on6())){
                    addText("A");
                } else if((on1())&&(!on2())&&(on3())&&(!on4())&&(!on5())&&(!on6())){
                    addText("B");
                } else if((on1())&&(on2())&&(!on3())&&(!on4())&&(!on5())&&(!on6())){
                    addText("C");
                } else if((on1())&&(on2())&&(!on3())&&(on4())&&(!on5())&&(!on6())){
                    addText("D");
                } else if((on1())&&(!on2())&&(!on3())&&(on4())&&(!on5())&&(!on6())){
                    addText("E");
                } else if((on1())&&(on2())&&(on3())&&(!on4())&&(!on5())&&(!on6())){
                    addText("F");
                } else if((on1())&&(on2())&&(on3())&&(on4())&&(!on5())&&(!on6())){
                    addText("G");
                } else if((on1())&&(!on2())&&(on3())&&(on4())&&(!on5())&&(!on6())){
                    addText("H");
                } else if((!on1())&&(on2())&&(on3())&&(!on4())&&(!on5())&&(!on6())){
                    addText("I");
                } else if((!on1())&&(on2())&&(on3())&&(on4())&&(!on5())&&(!on6())){
                    addText("J");
                } else if((on1())&&(!on2())&&(!on3())&&(!on4())&&(on5())&&(!on6())){
                    addText("K");
                } else if((on1())&&(!on2())&&(on3())&&(!on4())&&(on5())&&(!on6())){
                    addText("L");
                } else if((on1())&&(on2())&&(!on3())&&(!on4())&&(on5())&&(!on6())){
                    addText("M");
                } else if((on1())&&(on2())&&(!on3())&&(on4())&&(on5())&&(!on6())){
                    addText("N");
                } else if((on1())&&(!on2())&&(!on3())&&(on4())&&(on5())&&(!on6())){
                    addText("O");
                } else if((on1())&&(on2())&&(on3())&&(!on4())&&(on5())&&(!on6())){
                    addText("P");
                } else if((on1())&&(on2())&&(on3())&&(on4())&&(on5())&&(!on6())){
                    addText("Q");
                } else if((on1())&&(!on2())&&(on3())&&(on4())&&(on5())&&(!on6())){
                    addText("R");
                } else if((!on1())&&(on2())&&(on3())&&(!on4())&&(on5())&&(!on6())){
                    addText("S");
                } else if((!on1())&&(on2())&&(on3())&&(on4())&&(on5())&&(!on6())){
                    addText("T");
                } else if((on1())&&(!on2())&&(!on3())&&(!on4())&&(on5())&&(on6())){
                    addText("U");
                } else if((on1())&&(!on2())&&(on3())&&(!on4())&&(on5())&&(on6())){
                    addText("V");
                } else if((!on1())&&(on2())&&(on3())&&(on4())&&(!on5())&&(on6())){
                    addText("W");
                } else if((on1())&&(on2())&&(!on3())&&(!on4())&&(on5())&&(on6())){
                    addText("X");
                } else if((on1())&&(on2())&&(!on3())&&(on4())&&(on5())&&(on6())){
                    addText("Y");
                } else if((on1())&&(!on2())&&(!on3())&&(on4())&&(on5())&&(on6())){
                    addText("Z");
                } else{
                    addText("");
                }
                cl = false;
            } else{
                if((on1())&&(!on2())&&(!on3())&&(!on4())&&(!on5())&&(!on6())){
                    addText("a");
                } else if((on1())&&(!on2())&&(on3())&&(!on4())&&(!on5())&&(!on6())){
                    addText("b");
                } else if((on1())&&(on2())&&(!on3())&&(!on4())&&(!on5())&&(!on6())){
                    addText("c");
                } else if((on1())&&(on2())&&(!on3())&&(on4())&&(!on5())&&(!on6())){
                    addText("d");
                } else if((on1())&&(!on2())&&(!on3())&&(on4())&&(!on5())&&(!on6())){
                    addText("e");
                } else if((on1())&&(on2())&&(on3())&&(!on4())&&(!on5())&&(!on6())){
                    addText("f");
                } else if((on1())&&(on2())&&(on3())&&(on4())&&(!on5())&&(!on6())){
                    addText("g");
                } else if((on1())&&(!on2())&&(on3())&&(on4())&&(!on5())&&(!on6())){
                    addText("h");
                } else if((!on1())&&(on2())&&(on3())&&(!on4())&&(!on5())&&(!on6())){
                    addText("i");
                } else if((!on1())&&(on2())&&(on3())&&(on4())&&(!on5())&&(!on6())){
                    addText("j");
                } else if((on1())&&(!on2())&&(!on3())&&(!on4())&&(on5())&&(!on6())){
                    addText("k");
                } else if((on1())&&(!on2())&&(on3())&&(!on4())&&(on5())&&(!on6())){
                    addText("l");
                } else if((on1())&&(on2())&&(!on3())&&(!on4())&&(on5())&&(!on6())){
                    addText("m");
                } else if((on1())&&(on2())&&(!on3())&&(on4())&&(on5())&&(!on6())){
                    addText("n");
                } else if((on1())&&(!on2())&&(!on3())&&(on4())&&(on5())&&(!on6())){
                    addText("o");
                } else if((on1())&&(on2())&&(on3())&&(!on4())&&(on5())&&(!on6())){
                    addText("p");
                } else if((on1())&&(on2())&&(on3())&&(on4())&&(on5())&&(!on6())){
                    addText("q");
                } else if((on1())&&(!on2())&&(on3())&&(on4())&&(on5())&&(!on6())){
                    addText("r");
                } else if((!on1())&&(on2())&&(on3())&&(!on4())&&(on5())&&(!on6())){
                    addText("s");
                } else if((!on1())&&(on2())&&(on3())&&(on4())&&(on5())&&(!on6())){
                    addText("t");
                } else if((on1())&&(!on2())&&(!on3())&&(!on4())&&(on5())&&(on6())){
                    addText("u");
                } else if((on1())&&(!on2())&&(on3())&&(!on4())&&(on5())&&(on6())){
                    addText("v");
                } else if((!on1())&&(on2())&&(on3())&&(on4())&&(!on5())&&(on6())){
                    addText("w");
                } else if((on1())&&(on2())&&(!on3())&&(!on4())&&(on5())&&(on6())){
                    addText("x");
                } else if((on1())&&(on2())&&(!on3())&&(on4())&&(on5())&&(on6())){
                    addText("y");
                } else if((on1())&&(!on2())&&(!on3())&&(on4())&&(on5())&&(on6())){
                    addText("z");
                } else{
                    addText("");
                }
            }

        }else if(number.isChecked()){
            if((on1())&&(!on2())&&(!on3())&&(!on4())&&(!on5())&&(!on6())){
                addText("1");
            } else if((on1())&&(!on2())&&(on3())&&(!on4())&&(!on5())&&(!on6())){
                addText("2");
            } else if((on1())&&(on2())&&(!on3())&&(!on4())&&(!on5())&&(!on6())){
                addText("3");
            } else if((on1())&&(on2())&&(!on3())&&(on4())&&(!on5())&&(!on6())){
                addText("4");
            } else if((on1())&&(!on2())&&(!on3())&&(on4())&&(!on5())&&(!on6())){
                addText("5");
            } else if((on1())&&(on2())&&(on3())&&(!on4())&&(!on5())&&(!on6())){
                addText("6");
            } else if((on1())&&(on2())&&(on3())&&(on4())&&(!on5())&&(!on6())){
                addText("7");
            } else if((on1())&&(!on2())&&(on3())&&(on4())&&(!on5())&&(!on6())){
                addText("8");
            } else if((!on1())&&(on2())&&(on3())&&(!on4())&&(!on5())&&(!on6())){
                addText("9");
            } else if((!on1())&&(on2())&&(on3())&&(on4())&&(!on5())&&(!on6())){
                addText("0");
            } else{
                addText("");
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

        TextView tv = (TextView)findViewById(R.id.TextView);

        String str = tv.getText().toString();
        String str1 = "";

        char[] ch = str.toCharArray();

        for(int i=0; i < str.length()-1; i++){
            str1 = str1 + ch[i];
        }
        tv.setText(str1);
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

    public void addText(String c){

        TextView tv = (TextView)findViewById(R.id.TextView);

        tv.setText(tv.getText() + c);
    }
}