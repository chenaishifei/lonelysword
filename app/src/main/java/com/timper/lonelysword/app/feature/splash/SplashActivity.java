package com.timper.lonelysword.app.feature.splash;

import com.timper.lonelysword.annotations.apt.Dagger;
import com.timper.lonelysword.annotations.apt.RootView;
import com.timper.lonelysword.app.R;
import com.timper.lonelysword.app.databinding.ActSplashBinding;
import com.timper.lonelysword.base.AppActivity;

@Dagger @RootView(R.layout.act_splash) public class SplashActivity extends AppActivity<SplashViewModel, ActSplashBinding>
    implements SplashViewModel.Navigation {

  @Override public void gotoMain() {

  }
}


