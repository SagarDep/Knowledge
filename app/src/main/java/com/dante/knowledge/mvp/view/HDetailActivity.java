package com.dante.knowledge.mvp.view;

import com.dante.knowledge.R;
import com.dante.knowledge.ui.BaseActivity;
import com.dante.knowledge.utils.Constants;

/**
 * Container for HDetailFragment.
 */
public class HDetailActivity extends BaseActivity {
    @Override
    protected void initLayoutId() {
        layoutId = R.layout.md_layout;
    }

    @Override
    protected void initViews() {
        super.initViews();
        String url = getIntent().getStringExtra(Constants.URL);
        String title = getIntent().getStringExtra(Constants.TEXT);
        toolbar.setTitle(purifyTitle(title));
        setSupportActionBar(toolbar);
        replaceFragment(HDetailFragment.newInstance(url), TabsFragment.MENU_H);
    }

    private String purifyTitle(String title) {
        String pattern = "\\[(.{1,5})\\]";
        return title.replaceAll(pattern, "");
    }
}
