package com.odbpo.fenggo.dagger_demo2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.odbpo.fenggo.dagger_demo2.di.component.DaggerLoginComponent;
import com.odbpo.fenggo.dagger_demo2.net.LoginRequest;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * https://www.jianshu.com/p/4f11508f98d6
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_request)
    Button btnRequest;
    @BindView(R.id.btn_next)
    Button btnNext;

    @Inject
    LoginRequest loginRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initInjection();
    }

    private void initInjection() {
        DaggerLoginComponent.create().inject(this);
    }

    @OnClick({R.id.btn_request, R.id.btn_next})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_request:
                requestData();
                break;
            case R.id.btn_next:
                startActivity(new Intent(this,Main2Activity.class));
                break;
        }
    }

    private void requestData() {
        String data = loginRequest.getData();
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }

}
