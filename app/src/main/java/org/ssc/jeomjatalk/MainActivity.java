package org.ssc.jeomjatalk;

import android.graphics.Color;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

import static org.ssc.jeomjatalk.middle.ㅜ;

enum first {ㄱ, ㄲ, ㄴ, ㄷ, ㄸ, ㄹ, ㅁ, ㅂ, ㅃ, ㅅ, ㅆ, ㅇ, ㅈ, ㅉ, ㅊ, ㅋ, ㅌ, ㅍ, ㅎ}
enum middle {ㅏ, ㅐ, ㅑ, ㅒ, ㅓ, ㅔ, ㅕ, ㅖ, ㅗ, ㅘ, ㅙ, ㅚ, ㅛ, ㅜ, ㅝ, ㅞ, ㅟ, ㅠ, ㅡ, ㅢ, ㅣ}
enum last {공백, ㄱ, ㄲ, ㄳ, ㄴ, ㄵ, ㄶ, ㄷ, ㄹ, ㄺ, ㄻ, ㄼ, ㄽ, ㄾ, ㄿ, ㅀ, ㅁ, ㅂ, ㅄ, ㅅ,
    ㅆ, ㅇ, ㅈ, ㅊ, ㅋ, ㅌ, ㅍ, ㅎ}

public class MainActivity extends AppCompatActivity {

    int num = 0xac00;
    String str = "\\u";
    int firstNum = 0x24c;
    int middleNum = 0x1c;
    boolean cl = false;
    boolean fortis = false;
    boolean firstOn = false;
    boolean lastOn = false;
    boolean O = false;
    boolean ho = false;
    boolean np = false;
    boolean nl = false;
    boolean r = false;
    boolean s = false;
    boolean f = false;
    boolean q = false;
    int value=0;
    SoundPool sound;
    int soundId;
    int enterSound;
    int deleteSound;
    int changeSound;
    int soundNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sound = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        soundId = sound.load(this, R.raw.click, 1);
        enterSound = sound.load(this, R.raw.enter_click, 1);
        deleteSound = sound.load(this, R.raw.delete_click, 1);
        changeSound = sound.load(this, R.raw.change_click, 1);
    }

    Handler handler = new Handler(){
        public void handleMessage(Message msg){
            value++;
            handler.sendEmptyMessageDelayed(0,1);
            if(value==300){
                enter();
                value=0;
                handler.removeMessages(0);
            }
        }
    };

    Handler soundHandler = new Handler(){
        public void handleMessage(Message msg){
            switch(soundNum) {
                case 1:
                    sound.play(soundId, 1, 1, 0, 0, 2.0F);
                    break;
                case 2:
                    sound.play(soundId, 1, 1, 0, 0, 2.5F);
                    break;
                case 3:
                    sound.play(soundId, 1, 1, 0, 0, 3.0F);
                    break;
                case 4:
                    sound.play(soundId, 1, 1, 0, 0, 3.5F);
                    break;
                case 5:
                    sound.play(soundId, 1, 1, 0, 0, 4.0F);
                    break;
                case 6:
                    sound.play(soundId, 1, 1, 0, 0, 4.5F);
                    break;
                case 7:
                    sound.play(enterSound, 1, 1, 0, 0, 2.0F);
                    break;
                case 8:
                    sound.play(deleteSound, 1, 1, 0, 0, 2.0F);
                    break;
                case 9:
                    sound.play(changeSound, 1, 1, 0, 0, 2.0F);
                    break;
            }
        }
    };

    public void buttonClicked1(View v){
        if(value != 0)
            value=0;
        else
            handler.sendEmptyMessage(0);
        soundNum=1;
        soundHandler.sendEmptyMessage(0);
    }

    public void buttonClicked2(View v){
        if(value != 0)
            value=0;
        else
            handler.sendEmptyMessage(0);
        soundNum=2;
        soundHandler.sendEmptyMessage(0);
    }

    public void buttonClicked3(View v){
        if(value != 0)
            value=0;
        else
            handler.sendEmptyMessage(0);
        soundNum=3;
        soundHandler.sendEmptyMessage(0);
    }

    public void buttonClicked4(View v){
        if(value != 0)
            value=0;
        else
            handler.sendEmptyMessage(0);
        soundNum=4;
        soundHandler.sendEmptyMessage(0);
    }

    public void buttonClicked5(View v){
        if(value != 0)
            value=0;
        else
            handler.sendEmptyMessage(0);
        soundNum=5;
        soundHandler.sendEmptyMessage(0);
    }

    public void buttonClicked6(View v){
        if(value != 0)
            value=0;
        else
            handler.sendEmptyMessage(0);
        soundNum=6;
        soundHandler.sendEmptyMessage(0);
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


    public void enter() {

        String unicode;
        str = "\\u";

        ToggleButton tb1, tb2, tb3, tb4, tb5, tb6;
        ToggleButton korean, english, number;

        tb1 = (ToggleButton) findViewById(R.id.button1);
        tb2 = (ToggleButton) findViewById(R.id.button2);
        tb3 = (ToggleButton) findViewById(R.id.button3);
        tb4 = (ToggleButton) findViewById(R.id.button4);
        tb5 = (ToggleButton) findViewById(R.id.button5);
        tb6 = (ToggleButton) findViewById(R.id.button6);

        korean = (ToggleButton) findViewById(R.id.Korean);
        english = (ToggleButton) findViewById(R.id.English);
        number = (ToggleButton) findViewById(R.id.Number);

        if (korean.isChecked()) {
            if ((!on1()) && (!on2()) && (!on3()) && (!on4()) && (!on5()) && (!on6())) {
                addText("");
                fortis = false;
                firstOn = false;
                lastOn = false;
                q = r = s = f = false;
            } else if ((!on1()) && (on2()) && (!on3()) && (!on4()) && (!on5()) && (!on6())) {
                if (fortis) {
                    deleteText();
                    addText("ㄲ");
                    num = 0xac00;
                    num += firstNum * first.ㄲ.ordinal();
                    fortis = false;
                } else {
                    addText("ㄱ");
                    num = 0xac00;
                    num += firstNum * first.ㄱ.ordinal();
                    fortis = false;
                }
                firstOn = true;
                lastOn = false;
                q = r = s = f = false;
            } else if ((on1()) && (on2()) && (!on3()) && (!on4()) && (!on5()) && (!on6())) {
                addText("ㄴ");
                num = 0xac00;
                num += firstNum * first.ㄴ.ordinal();
                firstOn = true;
                lastOn = false;
                q = r = s = f = false;
            } else if ((!on1()) && (on2()) && (on3()) && (!on4()) && (!on5()) && (!on6())) {
                if (fortis) {
                    deleteText();
                    addText("ㄸ");
                    num = 0xac00;
                    num += firstNum * first.ㄸ.ordinal();
                    fortis = false;
                } else {
                    addText("ㄷ");
                    num = 0xac00;
                    num += firstNum * first.ㄷ.ordinal();
                    fortis = false;
                }
                firstOn = true;
                lastOn = false;
                q = r = s = f = false;
            } else if ((!on1()) && (!on2()) && (!on3()) && (on4()) && (!on5()) && (!on6())) {
                addText("ㄹ");
                num = 0xac00;
                num += firstNum * first.ㄹ.ordinal();
                firstOn = true;
                lastOn = false;
                q = r = s = f = false;
            } else if ((on1()) && (!on2()) && (!on3()) && (on4()) && (!on5()) && (!on6())) {
                addText("ㅁ");
                num = 0xac00;
                num += firstNum * first.ㅁ.ordinal();
                firstOn = true;
                lastOn = false;
                q = r = s = f = false;
            } else if ((!on1()) && (on2()) && (!on3()) && (on4()) && (!on5()) && (!on6())) {
                if (fortis) {
                    deleteText();
                    addText("ㅃ");
                    num = 0xac00;
                    num += firstNum * first.ㅃ.ordinal();
                    fortis = false;
                } else {
                    addText("ㅂ");
                    num = 0xac00;
                    num += firstNum * first.ㅂ.ordinal();
                    fortis = false;
                }
                firstOn = true;
                lastOn = false;
                q = r = s = f = false;
            } else if ((!on1()) && (!on2()) && (!on3()) && (!on4()) && (!on5()) && (on6())) {
                if (fortis) {
                    deleteText();
                    addText("ㅆ");
                    num = 0xac00;
                    num += firstNum * first.ㅆ.ordinal();
                    fortis = false;
                } else {
                    addText("ㅅ");
                    num = 0xac00;
                    num += firstNum * first.ㅅ.ordinal();
                    fortis = true;
                }
                firstOn = true;
                lastOn = false;
                q = r = s = f = false;
            } else if ((!on1()) && (on2()) && (!on3()) && (!on4()) && (!on5()) && (on6())) {
                if (fortis) {
                    deleteText();
                    addText("ㅉ");
                    num = 0xac00;
                    num += firstNum * first.ㅉ.ordinal();
                    fortis = false;
                } else {
                    addText("ㅈ");
                    num = 0xac00;
                    num += firstNum * first.ㅈ.ordinal();
                    fortis = false;
                }
                firstOn = true;
                lastOn = false;
                q = r = s = f = false;
            } else if ((!on1()) && (!on2()) && (!on3()) && (on4()) && (!on5()) && (on6())) {
                addText("ㅊ");
                num = 0xac00;
                num += firstNum * first.ㅊ.ordinal();
                firstOn = true;
                lastOn = false;
                q = r = s = f = false;
            } else if ((on1()) && (on2()) && (on3()) && (!on4()) && (!on5()) && (!on6())) {
                addText("ㅋ");
                num = 0xac00;
                num += firstNum * first.ㅋ.ordinal();
                firstOn = true;
                lastOn = false;
                q = r = s = f = false;
            } else if ((on1()) && (!on2()) && (on3()) && (on4()) && (!on5()) && (!on6())) {
                addText("ㅌ");
                num = 0xac00;
                num += firstNum * first.ㅌ.ordinal();
                firstOn = true;
                lastOn = false;
                q = r = s = f = false;
            } else if ((on1()) && (on2()) && (!on3()) && (on4()) && (!on5()) && (!on6())) {
                addText("ㅍ");
                num = 0xac00;
                num += firstNum * first.ㅍ.ordinal();
                firstOn = true;
                lastOn = false;
                q = r = s = f = false;
            } else if ((!on1()) && (on2()) && (on3()) && (on4()) && (!on5()) && (!on6())) {
                addText("ㅎ");
                num = 0xac00;
                num += firstNum * first.ㅎ.ordinal();
                firstOn = true;
                lastOn = false;
                q = r = s = f = false;
            } else if (firstOn) {
                if ((on1()) && (!on2()) && (on3()) && (!on4()) && (!on5()) && (on6())) {
                    deleteText();
                    fortis = false;
                    num += middleNum * middle.ㅏ.ordinal();
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    firstOn = false;
                    lastOn = true;
                } else if ((!on1()) && (on2()) && (!on3()) && (on4()) && (on5()) && (!on6())) {
                    deleteText();
                    fortis = false;
                    num += middleNum * middle.ㅑ.ordinal();
                    O = true;
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    firstOn = false;
                    lastOn = true;
                } else if ((!on1()) && (on2()) && (on3()) && (!on4()) && (on5()) && (!on6())) {
                    deleteText();
                    fortis = false;
                    num += middleNum * middle.ㅓ.ordinal();
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    firstOn = false;
                    lastOn = true;
                } else if ((on1()) && (!on2()) && (!on3()) && (on4()) && (!on5()) && (on6())) {
                    deleteText();
                    fortis = false;
                    num += middleNum * middle.ㅕ.ordinal();
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    firstOn = false;
                    lastOn = true;
                } else if ((on1()) && (!on2()) && (!on3()) && (!on4()) && (on5()) && (on6())) {
                    deleteText();
                    fortis = false;
                    num += middleNum * middle.ㅗ.ordinal();
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    firstOn = false;
                    lastOn = true;
                } else if ((!on1()) && (on2()) && (!on3()) && (!on4()) && (on5()) && (on6())) {
                    deleteText();
                    fortis = false;
                    num += middleNum * middle.ㅛ.ordinal();
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    firstOn = false;
                    lastOn = true;
                } else if ((on1()) && (on2()) && (!on3()) && (!on4()) && (on5()) && (!on6())) {
                    deleteText();
                    fortis = false;
                    num += middleNum * ㅜ.ordinal();
                    nl = true;
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    firstOn = false;
                    lastOn = true;
                } else if ((on1()) && (on2()) && (!on3()) && (!on4()) && (!on5()) && (on6())) {
                    deleteText();
                    fortis = false;
                    num += middleNum * middle.ㅠ.ordinal();
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    firstOn = false;
                    lastOn = true;
                } else if ((!on1()) && (on2()) && (on3()) && (!on4()) && (!on5()) && (on6())) {
                    deleteText();
                    fortis = false;
                    num += middleNum * middle.ㅡ.ordinal();
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    firstOn = false;
                    lastOn = true;
                } else if ((on1()) && (!on2()) && (!on3()) && (on4()) && (on5()) && (!on6())) {
                    deleteText();
                    fortis = false;
                    num += middleNum * middle.ㅣ.ordinal();
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    firstOn = false;
                    lastOn = true;
                } else if ((on1()) && (!on2()) && (on3()) && (on4()) && (on5()) && (!on6())) {
                    deleteText();
                    fortis = false;
                    num += middleNum * middle.ㅐ.ordinal();
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    firstOn = false;
                    lastOn = true;
                } else if ((on1()) && (on2()) && (!on3()) && (on4()) && (on5()) && (!on6())) {
                    deleteText();
                    fortis = false;
                    num += middleNum * middle.ㅔ.ordinal();
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    firstOn = false;
                    lastOn = true;
                } else if ((!on1()) && (on2()) && (!on3()) && (!on4()) && (on5()) && (!on6())) {
                    deleteText();
                    fortis = false;
                    num += middleNum * middle.ㅖ.ordinal();
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    firstOn = false;
                    lastOn = true;
                } else if ((on1()) && (!on2()) && (on3()) && (!on4()) && (on5()) && (on6())) {
                    deleteText();
                    fortis = false;
                    num += middleNum * middle.ㅘ.ordinal();
                    ho = true;
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    firstOn = false;
                    lastOn = true;
                } else if ((on1()) && (on2()) && (!on3()) && (on4()) && (on5()) && (on6())) {
                    deleteText();
                    fortis = false;
                    num += middleNum * middle.ㅚ.ordinal();
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    firstOn = false;
                    lastOn = true;
                } else if ((on1()) && (on2()) && (on3()) && (!on4()) && (on5()) && (!on6())) {
                    deleteText();
                    fortis = false;
                    num += middleNum * middle.ㅝ.ordinal();
                    np = true;
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    firstOn = false;
                    lastOn = true;
                } else if ((!on1()) && (on2()) && (on3()) && (on4()) && (!on5()) && (on6())) {
                    deleteText();
                    fortis = false;
                    num += middleNum * middle.ㅢ.ordinal();
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    firstOn = false;
                    lastOn = true;
                }
            } else if (!firstOn) {
                if ((on1()) && (!on2()) && (on3()) && (!on4()) && (!on5()) && (on6())) {
                    num = 0xac00;
                    num += firstNum * first.ㅇ.ordinal();
                    num += middleNum * middle.ㅏ.ordinal();
                    O = ho = np = nl = false;
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    lastOn = true;
                    q = r = s = f = false;
                } else if ((!on1()) && (on2()) && (!on3()) && (on4()) && (on5()) && (!on6())) {
                    num = 0xac00;
                    num += firstNum * first.ㅇ.ordinal();
                    num += middleNum * middle.ㅑ.ordinal();
                    O = ho = np = nl = false;
                    O = true;
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    lastOn = true;
                    q = r = s = f = false;
                } else if ((!on1()) && (on2()) && (on3()) && (!on4()) && (on5()) && (!on6())) {
                    num = 0xac00;
                    num += firstNum * first.ㅇ.ordinal();
                    num += middleNum * middle.ㅓ.ordinal();
                    O = ho = np = nl = false;
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    lastOn = true;
                    q = r = s = f = false;
                } else if ((on1()) && (!on2()) && (!on3()) && (on4()) && (!on5()) && (on6())) {
                    num = 0xac00;
                    num += firstNum * first.ㅇ.ordinal();
                    num += middleNum * middle.ㅕ.ordinal();
                    O = ho = np = nl = false;
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    lastOn = true;
                    q = r = s = f = false;
                } else if ((on1()) && (!on2()) && (!on3()) && (!on4()) && (on5()) && (on6())) {
                    num = 0xac00;
                    num += firstNum * first.ㅇ.ordinal();
                    num += middleNum * middle.ㅗ.ordinal();
                    O = ho = np = nl = false;
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    lastOn = true;
                    q = r = s = f = false;
                } else if ((!on1()) && (on2()) && (!on3()) && (!on4()) && (on5()) && (on6())) {
                    num = 0xac00;
                    num += firstNum * first.ㅇ.ordinal();
                    num += middleNum * middle.ㅛ.ordinal();
                    O = ho = np = nl = false;
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    lastOn = true;
                    q = r = s = f = false;
                } else if ((on1()) && (on2()) && (!on3()) && (!on4()) && (on5()) && (!on6())) {
                    num = 0xac00;
                    num += firstNum * first.ㅇ.ordinal();
                    num += middleNum * ㅜ.ordinal();
                    O = ho = np = nl = false;
                    nl = true;
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    lastOn = true;
                    q = r = s = f = false;
                } else if ((on1()) && (on2()) && (!on3()) && (!on4()) && (!on5()) && (on6())) {
                    num = 0xac00;
                    num += firstNum * first.ㅇ.ordinal();
                    num += middleNum * middle.ㅠ.ordinal();
                    O = ho = np = nl = false;
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    lastOn = true;
                    q = r = s = f = false;
                } else if ((!on1()) && (on2()) && (on3()) && (!on4()) && (!on5()) && (on6())) {
                    num = 0xac00;
                    num += firstNum * first.ㅇ.ordinal();
                    num += middleNum * middle.ㅡ.ordinal();
                    O = ho = np = nl = false;
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    lastOn = true;
                    q = r = s = f = false;
                } else if ((on1()) && (!on2()) && (!on3()) && (on4()) && (on5()) && (!on6())) {
                    num = 0xac00;
                    num += firstNum * first.ㅇ.ordinal();
                    num += middleNum * middle.ㅣ.ordinal();
                    O = ho = np = nl = false;
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    lastOn = true;
                    q = r = s = f = false;
                } else if ((on1()) && (!on2()) && (on3()) && (on4()) && (on5()) && (!on6())) {
                    if (O) {
                        deleteText();
                        num -= middleNum * middle.ㅑ.ordinal();
                        num += middleNum * middle.ㅒ.ordinal();
                    } else if (ho) {
                        deleteText();
                        num -= middleNum * middle.ㅘ.ordinal();
                        num += middleNum * middle.ㅙ.ordinal();
                    } else if (np) {
                        deleteText();
                        num -= middleNum * middle.ㅝ.ordinal();
                        num += middleNum * middle.ㅞ.ordinal();
                    } else if (nl) {
                        deleteText();
                        num -= middleNum * ㅜ.ordinal();
                        num += middleNum * middle.ㅟ.ordinal();
                    } else {
                        num = 0xac00;
                        num += firstNum * first.ㅇ.ordinal();
                        num += middleNum * middle.ㅐ.ordinal();
                    }
                    O = ho = np = nl = false;
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    lastOn = true;
                    q = r = s = f = false;
                } else if ((on1()) && (on2()) && (!on3()) && (on4()) && (on5()) && (!on6())) {
                    num = 0xac00;
                    num += firstNum * first.ㅇ.ordinal();
                    num += middleNum * middle.ㅔ.ordinal();
                    O = ho = np = nl = false;
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    lastOn = true;
                    q = r = s = f = false;
                } else if ((!on1()) && (on2()) && (!on3()) && (!on4()) && (on5()) && (!on6())) {
                    num = 0xac00;
                    num += firstNum * first.ㅇ.ordinal();
                    num += middleNum * middle.ㅖ.ordinal();
                    O = ho = np = nl = false;
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    lastOn = true;
                    q = r = s = f = false;
                } else if ((on1()) && (!on2()) && (on3()) && (!on4()) && (on5()) && (on6())) {
                    num = 0xac00;
                    num += firstNum * first.ㅇ.ordinal();
                    num += middleNum * middle.ㅘ.ordinal();
                    O = ho = np = nl = false;
                    ho = true;
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    lastOn = true;
                    q = r = s = f = false;
                } else if ((on1()) && (on2()) && (!on3()) && (on4()) && (on5()) && (on6())) {
                    num = 0xac00;
                    num += firstNum * first.ㅇ.ordinal();
                    num += middleNum * middle.ㅚ.ordinal();
                    O = ho = np = nl = false;
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    lastOn = true;
                    q = r = s = f = false;
                } else if ((on1()) && (on2()) && (on3()) && (!on4()) && (on5()) && (!on6())) {
                    num = 0xac00;
                    num += firstNum * first.ㅇ.ordinal();
                    num += middleNum * middle.ㅝ.ordinal();
                    O = ho = np = nl = false;
                    np = true;
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    lastOn = true;
                    q = r = s = f = false;
                } else if ((!on1()) && (on2()) && (on3()) && (on4()) && (!on5()) && (on6())) {
                    num = 0xac00;
                    num += firstNum * first.ㅇ.ordinal();
                    num += middleNum * middle.ㅢ.ordinal();
                    O = ho = np = nl = false;
                    unicode = str + Integer.toHexString(num);
                    addText(decode(unicode));
                    lastOn = true;
                    q = r = s = f = false;
                }
            }
            if (lastOn) {
                if ((on1()) && (!on2()) && (!on3()) && (!on4()) && (!on5()) && (!on6())) {
                    if (r) {
                        deleteText();
                        num -= last.ㄱ.ordinal();
                        num += last.ㄲ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        r = false;
                        lastOn = false;
                    } else if (f) {
                        deleteText();
                        num -= last.ㄹ.ordinal();
                        num += last.ㄺ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        f = false;
                        lastOn = false;
                    } else if (!r && !s && !f && !q) {
                        deleteText();
                        num += last.ㄱ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        r = true;
                    }
                } else if ((!on1()) && (!on2()) && (on3()) && (on4()) && (!on5()) && (!on6())) {
                    if (!r && !s && !f && !q) {
                        deleteText();
                        num += last.ㄴ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        s = true;
                    }
                } else if ((!on1()) && (!on2()) && (!on3()) && (on4()) && (on5()) && (!on6())) {
                    if (!r && !s && !f && !q) {
                        deleteText();
                        num += last.ㄷ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        lastOn = false;
                    }
                } else if ((!on1()) && (!on2()) && (on3()) && (!on4()) && (!on5()) && (!on6())) {
                    if (!r && !s && !f && !q) {
                        deleteText();
                        num += last.ㄹ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        f = true;
                    }
                } else if ((!on1()) && (!on2()) && (on3()) && (!on4()) && (!on5()) && (on6())) {
                    if (f) {
                        deleteText();
                        num -= last.ㄹ.ordinal();
                        num += last.ㄻ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        f = false;
                        lastOn = false;
                    } else if (!r && !s && !f && !q) {
                        deleteText();
                        num += last.ㅁ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        lastOn = false;
                    }
                } else if ((on1()) && (!on2()) && (on3()) && (!on4()) && (!on5()) && (!on6())) {
                    if (f) {
                        deleteText();
                        num -= last.ㄹ.ordinal();
                        num += last.ㄼ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        f = false;
                        lastOn = false;
                    } else if (!r && !s && !f && !q) {
                        deleteText();
                        num += last.ㅂ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        q = true;
                    }
                } else if ((!on1()) && (!on2()) && (!on3()) && (!on4()) && (on5()) && (!on6())) {
                    if (r) {
                        deleteText();
                        num -= last.ㄱ.ordinal();
                        num += last.ㄳ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        r = false;
                        lastOn = false;
                    } else if (f) {
                        deleteText();
                        num -= last.ㄹ.ordinal();
                        num += last.ㄽ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        f = false;
                        lastOn = false;
                    } else if (q) {
                        deleteText();
                        num -= last.ㅂ.ordinal();
                        num += last.ㅄ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        q = false;
                        lastOn = false;
                    } else if (!r && !s && !f && !q) {
                        deleteText();
                        num += last.ㅅ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        lastOn = false;
                    }
                } else if ((!on1()) && (!on2()) && (on3()) && (on4()) && (on5()) && (on6())) {
                    if (!r && !s && !f && !q) {
                        deleteText();
                        num += last.ㅇ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        lastOn = false;
                    }
                } else if ((on1()) && (!on2()) && (!on3()) && (!on4()) && (on5()) && (!on6())) {
                    if (s) {
                        deleteText();
                        num -= last.ㄴ.ordinal();
                        num += last.ㄵ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        s = false;
                        lastOn = false;
                    } else if (!r && !s && !f && !q) {
                        deleteText();
                        num += last.ㅈ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        lastOn = false;
                    }
                } else if ((!on1()) && (!on2()) && (on3()) && (!on4()) && (on5()) && (!on6())) {
                    if (!r && !s && !f && !q) {
                        deleteText();
                        num += last.ㅊ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        lastOn = false;
                    }
                } else if ((!on1()) && (!on2()) && (on3()) && (on4()) && (on5()) && (!on6())) {
                    if (!r && !s && !f && !q) {
                        deleteText();
                        num += last.ㅋ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        lastOn = false;
                    }
                } else if ((!on1()) && (!on2()) && (on3()) && (!on4()) && (on5()) && (on6())) {
                    if (f) {
                        deleteText();
                        num -= last.ㄹ.ordinal();
                        num += last.ㄾ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        f = false;
                        lastOn = false;
                    } else if (!r && !s && !f && !q) {
                        deleteText();
                        num += last.ㅌ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        lastOn = false;
                    }
                } else if ((!on1()) && (!on2()) && (on3()) && (on4()) && (!on5()) && (on6())) {
                    if (f) {
                        deleteText();
                        num -= last.ㄹ.ordinal();
                        num += last.ㄿ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        f = false;
                        lastOn = false;
                    } else if (!r && !s && !f && !q) {
                        deleteText();
                        num += last.ㅍ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        lastOn = false;
                    }
                } else if ((!on1()) && (!on2()) && (!on3()) && (on4()) && (on5()) && (on6())) {
                    if (s) {
                        deleteText();
                        num -= last.ㄴ.ordinal();
                        num += last.ㄶ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        s = false;
                        lastOn = false;
                    } else if (f) {
                        deleteText();
                        num -= last.ㄹ.ordinal();
                        num += last.ㅀ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        f = false;
                        lastOn = false;
                    } else if (!r && !s && !f && !q) {
                        deleteText();
                        num += last.ㅎ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        lastOn = false;
                    }
                } else if ((!on1()) && (on2()) && (!on3()) && (!on4()) && (on5()) && (!on6())) {
                    if (!r && !s && !f && !q) {
                        deleteText();
                        num += last.ㅆ.ordinal();
                        unicode = str + Integer.toHexString(num);
                        addText(decode(unicode));
                        lastOn = false;
                    }
                }
            }
        } else if (english.isChecked()) {
            if((!on1()) && (!on2()) && (!on3()) && (!on4()) && (!on5()) && (!on6())){
                addText("");
            } else if ((!on1()) && (!on2()) && (!on3()) && (!on4()) && (!on5()) && (on6())) {
                cl = true;
            } else if (cl) {
                if ((on1()) && (!on2()) && (!on3()) && (!on4()) && (!on5()) && (!on6())) {
                    addText("A");
                } else if ((on1()) && (!on2()) && (on3()) && (!on4()) && (!on5()) && (!on6())) {
                    addText("B");
                } else if ((on1()) && (on2()) && (!on3()) && (!on4()) && (!on5()) && (!on6())) {
                    addText("C");
                } else if ((on1()) && (on2()) && (!on3()) && (on4()) && (!on5()) && (!on6())) {
                    addText("D");
                } else if ((on1()) && (!on2()) && (!on3()) && (on4()) && (!on5()) && (!on6())) {
                    addText("E");
                } else if ((on1()) && (on2()) && (on3()) && (!on4()) && (!on5()) && (!on6())) {
                    addText("F");
                } else if ((on1()) && (on2()) && (on3()) && (on4()) && (!on5()) && (!on6())) {
                    addText("G");
                } else if ((on1()) && (!on2()) && (on3()) && (on4()) && (!on5()) && (!on6())) {
                    addText("H");
                } else if ((!on1()) && (on2()) && (on3()) && (!on4()) && (!on5()) && (!on6())) {
                    addText("I");
                } else if ((!on1()) && (on2()) && (on3()) && (on4()) && (!on5()) && (!on6())) {
                    addText("J");
                } else if ((on1()) && (!on2()) && (!on3()) && (!on4()) && (on5()) && (!on6())) {
                    addText("K");
                } else if ((on1()) && (!on2()) && (on3()) && (!on4()) && (on5()) && (!on6())) {
                    addText("L");
                } else if ((on1()) && (on2()) && (!on3()) && (!on4()) && (on5()) && (!on6())) {
                    addText("M");
                } else if ((on1()) && (on2()) && (!on3()) && (on4()) && (on5()) && (!on6())) {
                    addText("N");
                } else if ((on1()) && (!on2()) && (!on3()) && (on4()) && (on5()) && (!on6())) {
                    addText("O");
                } else if ((on1()) && (on2()) && (on3()) && (!on4()) && (on5()) && (!on6())) {
                    addText("P");
                } else if ((on1()) && (on2()) && (on3()) && (on4()) && (on5()) && (!on6())) {
                    addText("Q");
                } else if ((on1()) && (!on2()) && (on3()) && (on4()) && (on5()) && (!on6())) {
                    addText("R");
                } else if ((!on1()) && (on2()) && (on3()) && (!on4()) && (on5()) && (!on6())) {
                    addText("S");
                } else if ((!on1()) && (on2()) && (on3()) && (on4()) && (on5()) && (!on6())) {
                    addText("T");
                } else if ((on1()) && (!on2()) && (!on3()) && (!on4()) && (on5()) && (on6())) {
                    addText("U");
                } else if ((on1()) && (!on2()) && (on3()) && (!on4()) && (on5()) && (on6())) {
                    addText("V");
                } else if ((!on1()) && (on2()) && (on3()) && (on4()) && (!on5()) && (on6())) {
                    addText("W");
                } else if ((on1()) && (on2()) && (!on3()) && (!on4()) && (on5()) && (on6())) {
                    addText("X");
                } else if ((on1()) && (on2()) && (!on3()) && (on4()) && (on5()) && (on6())) {
                    addText("Y");
                } else if ((on1()) && (!on2()) && (!on3()) && (on4()) && (on5()) && (on6())) {
                    addText("Z");
                } else {
                    addText("");
                }
                cl = false;
            } else {
                if ((on1()) && (!on2()) && (!on3()) && (!on4()) && (!on5()) && (!on6())) {
                    addText("a");
                } else if ((on1()) && (!on2()) && (on3()) && (!on4()) && (!on5()) && (!on6())) {
                    addText("b");
                } else if ((on1()) && (on2()) && (!on3()) && (!on4()) && (!on5()) && (!on6())) {
                    addText("c");
                } else if ((on1()) && (on2()) && (!on3()) && (on4()) && (!on5()) && (!on6())) {
                    addText("d");
                } else if ((on1()) && (!on2()) && (!on3()) && (on4()) && (!on5()) && (!on6())) {
                    addText("e");
                } else if ((on1()) && (on2()) && (on3()) && (!on4()) && (!on5()) && (!on6())) {
                    addText("f");
                } else if ((on1()) && (on2()) && (on3()) && (on4()) && (!on5()) && (!on6())) {
                    addText("g");
                } else if ((on1()) && (!on2()) && (on3()) && (on4()) && (!on5()) && (!on6())) {
                    addText("h");
                } else if ((!on1()) && (on2()) && (on3()) && (!on4()) && (!on5()) && (!on6())) {
                    addText("i");
                } else if ((!on1()) && (on2()) && (on3()) && (on4()) && (!on5()) && (!on6())) {
                    addText("j");
                } else if ((on1()) && (!on2()) && (!on3()) && (!on4()) && (on5()) && (!on6())) {
                    addText("k");
                } else if ((on1()) && (!on2()) && (on3()) && (!on4()) && (on5()) && (!on6())) {
                    addText("l");
                } else if ((on1()) && (on2()) && (!on3()) && (!on4()) && (on5()) && (!on6())) {
                    addText("m");
                } else if ((on1()) && (on2()) && (!on3()) && (on4()) && (on5()) && (!on6())) {
                    addText("n");
                } else if ((on1()) && (!on2()) && (!on3()) && (on4()) && (on5()) && (!on6())) {
                    addText("o");
                } else if ((on1()) && (on2()) && (on3()) && (!on4()) && (on5()) && (!on6())) {
                    addText("p");
                } else if ((on1()) && (on2()) && (on3()) && (on4()) && (on5()) && (!on6())) {
                    addText("q");
                } else if ((on1()) && (!on2()) && (on3()) && (on4()) && (on5()) && (!on6())) {
                    addText("r");
                } else if ((!on1()) && (on2()) && (on3()) && (!on4()) && (on5()) && (!on6())) {
                    addText("s");
                } else if ((!on1()) && (on2()) && (on3()) && (on4()) && (on5()) && (!on6())) {
                    addText("t");
                } else if ((on1()) && (!on2()) && (!on3()) && (!on4()) && (on5()) && (on6())) {
                    addText("u");
                } else if ((on1()) && (!on2()) && (on3()) && (!on4()) && (on5()) && (on6())) {
                    addText("v");
                } else if ((!on1()) && (on2()) && (on3()) && (on4()) && (!on5()) && (on6())) {
                    addText("w");
                } else if ((on1()) && (on2()) && (!on3()) && (!on4()) && (on5()) && (on6())) {
                    addText("x");
                } else if ((on1()) && (on2()) && (!on3()) && (on4()) && (on5()) && (on6())) {
                    addText("y");
                } else if ((on1()) && (!on2()) && (!on3()) && (on4()) && (on5()) && (on6())) {
                    addText("z");
                } else {
                    addText("");
                }
            }

        } else if (number.isChecked()) {
            if((!on1()) && (!on2()) && (!on3()) && (!on4()) && (!on5()) && (!on6())){
                addText("");
            } else if ((on1()) && (!on2()) && (!on3()) && (!on4()) && (!on5()) && (!on6())) {
                addText("1");
            } else if ((on1()) && (!on2()) && (on3()) && (!on4()) && (!on5()) && (!on6())) {
                addText("2");
            } else if ((on1()) && (on2()) && (!on3()) && (!on4()) && (!on5()) && (!on6())) {
                addText("3");
            } else if ((on1()) && (on2()) && (!on3()) && (on4()) && (!on5()) && (!on6())) {
                addText("4");
            } else if ((on1()) && (!on2()) && (!on3()) && (on4()) && (!on5()) && (!on6())) {
                addText("5");
            } else if ((on1()) && (on2()) && (on3()) && (!on4()) && (!on5()) && (!on6())) {
                addText("6");
            } else if ((on1()) && (on2()) && (on3()) && (on4()) && (!on5()) && (!on6())) {
                addText("7");
            } else if ((on1()) && (!on2()) && (on3()) && (on4()) && (!on5()) && (!on6())) {
                addText("8");
            } else if ((!on1()) && (on2()) && (on3()) && (!on4()) && (!on5()) && (!on6())) {
                addText("9");
            } else if ((!on1()) && (on2()) && (on3()) && (on4()) && (!on5()) && (!on6())) {
                addText("0");
            } else {
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

        deleteText();
        soundNum = 8;
        soundHandler.sendEmptyMessage(0);
        num=0xac00;
        fortis = false;
        firstOn = false;
        lastOn = false;
        q = r = s = f = false;
        cl=false;
    }

    public void space(View v)
    {
        addText(" ");
        soundNum = 7;
        soundHandler.sendEmptyMessage(0);
        num=0xac00;
        fortis = false;
        firstOn = false;
        lastOn = false;
        q = r = s = f = false;
        cl=false;
    }


    public void deleteText(){

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

        soundNum = 9;
        soundHandler.sendEmptyMessage(0);

        tb = (ToggleButton)findViewById(R.id.Korean);
        tb.setChecked(true);
        tb.setTextColor(Color.WHITE);

        tb = (ToggleButton)findViewById(R.id.English);
        tb.setChecked(false);
        tb.setTextColor(Color.BLACK);

        tb = (ToggleButton)findViewById(R.id.Number);
        tb.setChecked(false);
        tb.setTextColor(Color.BLACK);

        num=0xac00;
        fortis = false;
        firstOn = false;
        lastOn = false;
        q = r = s = f = false;
        cl=false;
    }

    public void english(View v){

        ToggleButton tb;

        soundNum = 9;
        soundHandler.sendEmptyMessage(0);

        tb = (ToggleButton)findViewById(R.id.English);
        tb.setChecked(true);
        tb.setTextColor(Color.WHITE);

        tb = (ToggleButton)findViewById(R.id.Korean);
        tb.setChecked(false);
        tb.setTextColor(Color.BLACK);

        tb = (ToggleButton)findViewById(R.id.Number);
        tb.setChecked(false);
        tb.setTextColor(Color.BLACK);

        num=0xac00;
        fortis = false;
        firstOn = false;
        lastOn = false;
        q = r = s = f = false;
        cl=false;
    }

    public void number(View v){

        ToggleButton tb;

        soundNum = 9;
        soundHandler.sendEmptyMessage(0);

        tb = (ToggleButton)findViewById(R.id.Number);
        tb.setChecked(true);
        tb.setTextColor(Color.WHITE);

        tb = (ToggleButton)findViewById(R.id.Korean);
        tb.setChecked(false);
        tb.setTextColor(Color.BLACK);

        tb = (ToggleButton)findViewById(R.id.English);
        tb.setChecked(false);
        tb.setTextColor(Color.BLACK);

        num=0xac00;
        fortis = false;
        firstOn = false;
        lastOn = false;
        q = r = s = f = false;
        cl=false;
    }

    public void addText(String c){

        TextView tv = (TextView)findViewById(R.id.TextView);

        tv.setText(tv.getText() + c);
    }

    public static String decode(String unicode) {
        char ch;
        String str;
        ch = (char)Integer.parseInt( unicode.substring(2, 6), 16);
        str = ch + "";
        return str;
    }
}