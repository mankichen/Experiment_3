package cn.edu.hqu.monkey.experiment_3.test_1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.annotation.NonNull;

/**
 * Created by monkey on 2018/5/6.
 */

public class Test1Presenter implements Test1Contract.Presenter {

    private final Test1Contract.View test1View;

    public Test1Presenter(@NonNull Test1Contract.View test1View) {
        this.test1View = test1View;

        test1View.setPresenter(this);
    }


    public void start() {

    }

    @Override
    public void interalClassPresenter() {
        test1View.showToast(test1View.getEditValue());
    }

    @Override
    public void exteralClassPresenter() {
        test1View.showToast(test1View.getEditValue());
    }

    @Override
    public void uInteralClassPresenter() {
        test1View.showToast(test1View.getEditValue());
    }

    @Override
    public void activityPresenter() {
        test1View.showToast(test1View.getEditValue());
    }

    @Override
    public void bindLablePresenter() {
        test1View.showToast(test1View.getEditValue());
    }

}
