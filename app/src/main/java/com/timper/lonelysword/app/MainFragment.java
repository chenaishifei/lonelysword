package com.timper.lonelysword.app;

import android.widget.Toast;
import com.timper.lonelysword.annotations.apt.AfterViews;
import com.timper.lonelysword.annotations.apt.BeforeViews;
import com.timper.lonelysword.annotations.apt.DisableNetwork;
import com.timper.lonelysword.annotations.apt.EnableNetwork;
import com.timper.lonelysword.annotations.apt.RootView;
import com.timper.lonelysword.annotations.aspectj.CheckLogin;
import com.timper.lonelysword.annotations.aspectj.SingleClick;
import com.timper.lonelysword.annotations.aspectj.Time;
import com.timper.lonelysword.app.databinding.FrgMainBinding;
import com.timper.lonelysword.base.AppFragment;

/**
 * User: tangpeng.yang
 * Date: 31/05/2018
 * Description:
 * FIXME
 */
@RootView(R.layout.frg_main) public class MainFragment extends AppFragment<FrgMainBinding> {

  @BeforeViews void beforViews() {
    Toast.makeText(getActivity(), "beforviews", Toast.LENGTH_LONG).show();
  }

  @AfterViews void AfterViews() {

    Toast.makeText(getActivity(), "AfterViews", Toast.LENGTH_LONG).show();
  }

  @DisableNetwork void disable() {
    Toast.makeText(getActivity(), "disable", Toast.LENGTH_LONG).show();
  }

  @EnableNetwork @CheckLogin void enable() {
    Toast.makeText(getActivity(), "enable", Toast.LENGTH_LONG).show();
  }

  @SingleClick @Time void click() {
    Toast.makeText(getActivity(), "SingleClick", Toast.LENGTH_SHORT).show();
  }
}
