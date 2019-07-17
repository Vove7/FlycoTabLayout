package com.flyco.tablayout.listener;

public interface OnTabSelectListener {
    void onTabSelect(int position);
    void onTabReselect(int position);

    //TODO 目前仅支持 SlidingTabLayout
    void onTabUnselected(int position);
}