package cn.edu.hqu.monkey.experiment_3.test_1;

import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;

import static android.content.ContentValues.TAG;

/**
 * Created by monkey on 2018/5/6.
 */

public class ExteralClass implements View.OnClickListener {

    @NonNull
    private final Test1Contract.Presenter presenter;

    public ExteralClass(@NonNull Test1Contract.Presenter presenter) {
        Log.d(TAG, "ExteralClass: create");

        this.presenter = presenter;

    }

    @Override
    public void onClick(View v) {
        presenter.exteralClassPresenter();
    }
}
