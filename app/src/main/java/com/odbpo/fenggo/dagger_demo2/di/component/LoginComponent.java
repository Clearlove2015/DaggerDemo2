package com.odbpo.fenggo.dagger_demo2.di.component;

import com.odbpo.fenggo.dagger_demo2.MainActivity;

import dagger.Component;

@Component
public interface LoginComponent {

    void inject(MainActivity activity);

}
