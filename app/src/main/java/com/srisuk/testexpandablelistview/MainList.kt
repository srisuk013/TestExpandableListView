package com.srisuk.testexpandablelistview

import android.view.View
import android.widget.TextView

class MainList : SimpleExpandableListView<FriendGroup, FriendDetail>() {

    override fun getPropertyDetailList(item: FriendGroup): List<FriendDetail> = item.friendDetails

    override fun onCreateViewHolderMain(): Int = android.R.layout.simple_list_item_1

    override fun View.onBindViewHolderMain(item: FriendGroup) {
        findViewById<TextView>(android.R.id.text1).text = item.friendGroupName
    }

    override fun onCreateViewHolderDetail(): Int = android.R.layout.simple_list_item_1

    override fun View.onBindViewHolderDetail(item: FriendDetail) {
        findViewById<TextView>(android.R.id.text1).text = item.friendDetailName
    }

}
