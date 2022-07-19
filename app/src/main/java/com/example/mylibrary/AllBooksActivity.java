package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

public class AllBooksActivity extends AppCompatActivity {
    private static final String TAG = "AllBooksActivity";

    private RecyclerView bookRecycleView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);

        Log.d(TAG, "onCreate: started");

        bookRecycleView = (RecyclerView) findViewById(R.id.bookRecycleView);


    }
}