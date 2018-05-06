package cn.edu.hqu.monkey.experiment_3;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cn.edu.hqu.monkey.experiment_3.test_1.Test1Activity;
import cn.edu.hqu.monkey.experiment_3.test_1.Test1Contract;
import cn.edu.hqu.monkey.experiment_3.test_2.CallbackHandler;
import cn.edu.hqu.monkey.experiment_3.test_3.ConfigurationTest;
import cn.edu.hqu.monkey.experiment_3.test_4.ProgressDialogTest;

public class MainActivity extends AppCompatActivity {

    private Button btnTest1;

    private Button btnTest2;

    private Button btnTest3;

    private Button btnTest4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTest1 = (Button)findViewById(R.id.btn_test_1);
        btnTest2 = (Button)findViewById(R.id.btn_test_2);
        btnTest3 = (Button)findViewById(R.id.btn_test_3);
        btnTest4 = (Button)findViewById(R.id.btn_test_4);

        btnTest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

                intent.setClass(MainActivity.this, Test1Activity.class);

                startActivity(intent);
            }
        });

        btnTest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

                intent.setClass(MainActivity.this, CallbackHandler.class);

                startActivity(intent);
            }
        });

        btnTest3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

                intent.setClass(MainActivity.this, ConfigurationTest.class);

                startActivity(intent);
            }
        });

        btnTest4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

                intent.setClass(MainActivity.this, ProgressDialogTest.class);

                startActivity(intent);
            }
        });

    }
}
