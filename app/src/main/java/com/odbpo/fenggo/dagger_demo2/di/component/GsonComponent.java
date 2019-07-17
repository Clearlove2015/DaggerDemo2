package com.odbpo.fenggo.dagger_demo2.di.component;

import com.odbpo.fenggo.dagger_demo2.Main2Activity;
import com.odbpo.fenggo.dagger_demo2.di.module.GsonModule;

import dagger.Component;

@Component(modules = {GsonModule.class})
public interface GsonComponent {

    void inject(Main2Activity activity);

}
