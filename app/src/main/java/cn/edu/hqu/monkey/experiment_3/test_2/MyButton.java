package cn.edu.hqu.monkey.experiment_3.test_2;

import android.content.Context;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Button;
import android.util.AttributeSet;

/**
 * Created by monkey on 2018/5/6.
 */

public class MyButton extends Button {

    public MyButton(Context context , AttributeSet set){
        super(context , set);
    }



    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        super.onKeyDown(keyCode , event);
        Log.v("com.sise" , "the onKeyDown in MyButton");
        Log.d("com.sise" , "the onKeyDown in MyButton");
        //返回true，表明该事件不会向外扩散
        return true;
    }


}
