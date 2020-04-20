package com.example.grocery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutmanger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<items> exampleList = new ArrayList<>();
        exampleList.add(new items(R.drawable.tomato, "Fresh Tomatoes", "300" ));
        exampleList.add(new items(R.drawable.cheese, "Cheese", "200" ));
        exampleList.add(new items(R.drawable.bread, "Bread", "500" ));
        exampleList.add(new items(R.drawable.milk, "Milk", "450" ));
        exampleList.add(new items(R.drawable.butter, "Butter", "150" ));
        exampleList.add(new items(R.drawable.fish, "Fish", "800" ));
        exampleList.add(new items(R.drawable.meat, "Meat", "1,000" ));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutmanger = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutmanger);
        mRecyclerView.setAdapter(mAdapter);
    }
}
