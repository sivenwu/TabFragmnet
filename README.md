# TabFragmnet
简单封装多Fragment切换

简书地址：[Android 教你简单封装多Fragment切换](http://www.jianshu.com/p/7e1fbf12f41a)
欢迎关注，不定期更新总结！

##使用方法
`````
 mainTabFragment = new MainTabFragment() {
            @Override
            public void addSubViewTab() {
                //初始化视图 调用addTab
                addTab("标题1",Tab1Fragment.class);
                addTab("标题2",Tab2Fragment.class);
                addTab("标题3",Tab3Fragment.class);
            }

            @Override
            public void loadFinishView(ViewPager viewPager, FragmentStatePagerAdapter mAdapter) {
                mViewPager = viewPager;
               //加载好视图啦，想做什么做什么，都返回给你啦
            }

        };

        getSupportFragmentManager().beginTransaction().add(R.id.test_contanter,mainTabFragment).commit();
`````

具体使用请看Demo，谢谢支持！

傻小孩b mark
共勉，写给在成长路上奋斗的你
