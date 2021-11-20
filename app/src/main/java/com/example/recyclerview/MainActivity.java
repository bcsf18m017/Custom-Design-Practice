package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    List<Friends> friendsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Friends f0 = new Friends(1,"Noman", 2000, "Lahore",R.drawable.noman);
        Friends f1 = new Friends(2,"Kiran", 2000, "Sialkot",R.drawable.noman);
        Friends f2 = new Friends(3,"Loves", 2019, "Lahore",R.drawable.noman);
        Friends f3 = new Friends(4,"Each", 2019, "Sialkot",R.drawable.noman);
        Friends f4 = new Friends(5,"Other", 2019, "Lahore",R.drawable.noman);
        friendsList.addAll(Arrays.asList(f0,f1,f2,f3,f4));
        recyclerView = findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new myRecyclerViewAdapter(friendsList) ;
        recyclerView.setAdapter(adapter);
        layoutManager  = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

    }
}