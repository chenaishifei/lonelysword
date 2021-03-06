package com.timper.lonelysword.base;

import android.content.Context;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.timper.lonelysword.Lonelysword;
import com.timper.lonelysword.Unbinder;
import dagger.android.support.AndroidSupportInjection;
import dagger.android.support.DaggerFragment;
import javax.inject.Inject;

/**
 * User: tangpeng.yang
 * Date: 29/05/2018
 * Description:
 * FIXME
 */
public abstract class AppFragment<V extends AppViewModel, T extends ViewDataBinding> extends DaggerFragment {
  public T binding;
  @Inject public V viewModel;
  @Inject public ViewModelFactor<V> factor;

  public View view;

  protected Unbinder unbinder;

  public FragmentManager fragmentManager;

  @Override public void onAttach(Context context) {
    super.onAttach(context);
  }

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    fragmentManager = getChildFragmentManager();
    unbinder = Lonelysword.bind(this, container);
    unbinder.beforeViews();
    return unbinder.initViews();
  }

  @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    unbinder.afterViews();
  }

  @Override public void onStart() {
    super.onStart();
    unbinder.onStart();
  }

  @Override public void onResume() {
    super.onResume();
    unbinder.onResume();
  }

  @Override public void onPause() {
    super.onPause();
    unbinder.onPause();
  }

  @Override public void onStop() {
    super.onStop();
    unbinder.onStop();
  }

  @Override public void onDestroy() {
    super.onDestroy();
    unbinder.onDestroy();
    unbinder.unbind();
  }
}
