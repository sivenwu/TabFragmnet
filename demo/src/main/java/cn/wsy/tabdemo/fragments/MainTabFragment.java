package cn.wsy.tabdemo.fragments;

import cn.wsy.tabdemo.R;
import cn.wsy.tabdemo.base.BaseTabFragment;

/**
 * Created by wsy on 2016/8/15.
 */
public abstract class MainTabFragment extends BaseTabFragment {

    @Override
    public int getLayoutID() {
        return R.layout.main_tab_frag_layout;
    }

}
