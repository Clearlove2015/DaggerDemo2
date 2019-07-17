package com.odbpo.fenggo.dagger_demo2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.odbpo.fenggo.dagger_demo2.bean.TestGsonBean;
import com.odbpo.fenggo.dagger_demo2.di.component.DaggerGsonComponent;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.btn_test_gson)
    Button btnTestGson;

    @Inject
    Gson gson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
        initInjection();
    }

    private void initInjection() {
        DaggerGsonComponent.create().inject(this);
    }

    @OnClick(R.id.btn_test_gson)
    public void onViewClicked() {
        testGson();
    }

    private void testGson () {
        TestGsonBean bean = new TestGsonBean();
        bean.setName("jack");
        bean.setAge(20);
        bean.setNick("blues");
        bean.setInteresting("play basketball");
        String json = gson.toJson(bean);
        Toast.makeText(this, json, Toast.LENGTH_SHORT).show();
    }
}
