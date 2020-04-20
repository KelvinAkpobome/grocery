package com.example.grocery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutmanger;

    Button share;

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

    public void button(View view) {
        Intent shareIntent = new Intent();
        shareIntent.setAction(Intent.ACTION_SEND);
        shareIntent.putExtra(Intent.EXTRA_SUBJECT,"");
        shareIntent.putExtra(Intent.EXTRA_TEXT, "");
        shareIntent.setType("text/plain");
        startActivity(shareIntent);
    }
}
