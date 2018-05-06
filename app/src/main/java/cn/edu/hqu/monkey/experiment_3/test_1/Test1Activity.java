package cn.edu.hqu.monkey.experiment_3.test_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import cn.edu.hqu.monkey.experiment_3.R;
import cn.edu.hqu.monkey.experiment_3.util.ActivityUtils;

public class Test1Activity extends AppCompatActivity implements View.OnClickListener {

    private Test1Contract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        Test1Fragment test1Fragment = (Test1Fragment)getSupportFragmentManager().findFragmentById(R.id.test_fragment);

        if (test1Fragment == null){
            test1Fragment = new Test1Fragment();

            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), test1Fragment, R.id.test_fragment);
        }

        // Presenter
        presenter =  new Test1Presenter(test1Fragment);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.test_1_bind_lable:
                presenter.bindLablePresenter();
                break;
            case R.id.test_1_activity:
                presenter.activityPresenter();
                break;
        }
    }
}
