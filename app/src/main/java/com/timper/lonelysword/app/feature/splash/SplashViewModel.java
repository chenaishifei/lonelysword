package com.timper.lonelysword.app.feature.splash;

import android.databinding.ObservableField;
import android.support.v7.app.AppCompatActivity;
import com.timper.lonelysword.ActivityScope;
import com.timper.lonelysword.app.data.GetUserUseCase;
import com.timper.lonelysword.app.databinding.ActSplashBinding;
import com.timper.lonelysword.base.AppActivity;
import com.timper.lonelysword.base.AppViewModel;
import javax.inject.Inject;

/**
 * User: tangpeng.yang
 * Date: 04/07/2018
 * Description:
 * FIXME
 */
@ActivityScope public class SplashViewModel extends AppViewModel<ActSplashBinding> {
  GetUserUseCase userUseCase;

  public interface Navigation {
    void gotoMain();
  }

  public ObservableField<String> hellow = new ObservableField<>("sdfadf");

  @Inject public SplashViewModel(AppActivity activity, GetUserUseCase userUseCase) {
    super(activity);
    this.userUseCase = userUseCase;
  }
}
