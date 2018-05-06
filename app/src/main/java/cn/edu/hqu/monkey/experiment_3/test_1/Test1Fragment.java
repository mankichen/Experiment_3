package cn.edu.hqu.monkey.experiment_3.test_1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import cn.edu.hqu.monkey.experiment_3.R;

import static android.content.ContentValues.TAG;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Test1Fragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Test1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Test1Fragment extends Fragment implements Test1Contract.View {
    private Test1Contract.Presenter mPresenter;
    private EditText editText;
    private Button btnInternalClass;
    private Button btnExternalClass;
    private Button btnUInternalClass;
    private Button btnActicvity;
    private Button btnBindLable;

    private Toast toast;

    public class InteralClass implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            mPresenter.interalClassPresenter();
        }
    }

    public void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.test_1_fragment, container, false);

        editText = (EditText)view.findViewById(R.id.test_1_edit);
        btnInternalClass = (Button)view.findViewById(R.id.test_1_internal_class);
        btnExternalClass = (Button)view.findViewById(R.id.test_1_external_class);
        btnUInternalClass = (Button)view.findViewById(R.id.test_1_u_interal_class);
        btnActicvity = (Button)view.findViewById(R.id.test_1_activity);
        btnBindLable = (Button)view.findViewById(R.id.test_1_bind_lable);


        /* 注册监听 */
        /* 内部类 */
        btnInternalClass.setOnClickListener(new InteralClass());

        /* 外部类 */
        btnExternalClass.setOnClickListener(new ExteralClass(new Test1Presenter(this)));

        /* 匿名内部类 */
        btnUInternalClass.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mPresenter.uInteralClassPresenter();
            }
        });

        /* activity */
        btnActicvity.setOnClickListener((Test1Activity)getActivity());

        return view;
    }


    @Override
    public void setPresenter(Test1Contract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void showToast(String str) {
        if (toast == null) {
            toast = Toast.makeText(getContext(), str, Toast.LENGTH_SHORT);
        } else {
            toast.setText(str);
            toast.setDuration(Toast.LENGTH_SHORT);
        }
        toast.show();
    }


    @Override
    public String getEditValue()
    {
        return editText.getText().toString();
    }

}
