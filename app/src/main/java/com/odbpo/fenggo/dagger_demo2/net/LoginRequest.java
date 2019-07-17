package com.odbpo.fenggo.dagger_demo2.net;


import javax.inject.Inject;

public class LoginRequest {

    @Inject
    public LoginRequest() {

    }

    public String getData(){
        return "使用在构造函数上使用 @Inject 的方式，获取到了本地数据";
    }
}
