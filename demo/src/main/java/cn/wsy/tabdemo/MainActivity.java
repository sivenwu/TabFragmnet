package cn.wsy.tabdemo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import cn.wsy.tabdemo.fragments.MainTabFragment;
import cn.wsy.tabdemo.fragments.Tab1Fragment;
import cn.wsy.tabdemo.fragments.Tab2Fragment;
import cn.wsy.tabdemo.fragments.Tab3Fragment;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private MainTabFragment mainTabFragment;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        tabLayout = (TabLayout) findViewById(R.id.test_tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("标题1"));
        tabLayout.addTab(tabLayout.newTab().setText("标题1"));
        tabLayout.addTab(tabLayout.newTab().setText("标题1"));

        mainTabFragment = new MainTabFragment() {
            @Override
            public void addSubViewTab() {
                addTab("标题1",Tab1Fragment.class);
                addTab("标题2",Tab2Fragment.class);
                addTab("标题3",Tab3Fragment.class);
            }

            @Override
            public void loadFinishView(ViewPager viewPager, FragmentStatePagerAdapter mAdapter) {
                mViewPager = viewPager;
                tabLayout.setupWithViewPager(mViewPager);
                tabLayout.setTabsFromPagerAdapter(mAdapter);
            }

        };

        getSupportFragmentManager().beginTransaction().add(R.id.test_contanter,mainTabFragment).commit();
        //关联Tab
    }
}
