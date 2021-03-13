package com.srisuk.testexpandablelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainAdapter by lazy { MainList() }

        val list = mutableListOf<FriendGroup>()
        list.add(
                FriendGroup(
                        1,
                        "x",
                        listOf(
                                FriendDetail(1, 1, "AAA"),
                                FriendDetail(1, 2, "BBB"),
                                FriendDetail(1, 3, "CCC"),
                        )
                )
        )
        list.add(
                FriendGroup(
                        2,
                        "y",
                        listOf(
                                FriendDetail(2, 1, "DDD"),
                                FriendDetail(2, 2, "EEE"),
                        )
                )
        )
        list.add(
                FriendGroup(
                        3,
                        "z",
                        listOf(
                                FriendDetail(3, 1, "FFF"),
                        )
                )
        )

        val json = Gson().toJson(list)
        Log.d("###", "onCreate: $json")

        expandableListView.setAdapter(mainAdapter)

        mainAdapter.setList(list)

    }

}
