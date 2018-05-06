package cn.edu.hqu.monkey.experiment_3.test_1;

import android.app.Fragment;

import cn.edu.hqu.monkey.experiment_3.BasePresenter;
import cn.edu.hqu.monkey.experiment_3.BaseView;

/**
 * Created by monkey on 2018/5/6.
 */

public interface Test1Contract {

    interface View extends BaseView<Presenter> {
        void showToast(String str);

        String getEditValue();

    }

    interface Presenter extends BasePresenter {

        void interalClassPresenter();

        void exteralClassPresenter();

        void uInteralClassPresenter();

        void activityPresenter();

        void bindLablePresenter();

    }
}
