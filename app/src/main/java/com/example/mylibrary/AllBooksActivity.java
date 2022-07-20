package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class AllBooksActivity extends AppCompatActivity {
    private static final String TAG = "AllBooksActivity";

    private RecyclerView bookRecView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);

        Log.d(TAG, "onCreate: started");

        bookRecView = (RecyclerView) findViewById(R.id.bookRecycleView);

        BooksRecViewAdapter adapter = new BooksRecViewAdapter(this);
        bookRecView.setAdapter(adapter);
        bookRecView.setLayoutManager(new GridLayoutManager(this,2));

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("1Q84", "Haruki Murakami", 1350,
                "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1483103331i/10357575.jpg",
                "A work of maddening brilliance"));

        books.add(new Book("Iliad", "Homer", 1000,
                "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1625333695i/1371.jpg",
                "Greak heroes and Tragedies"));

        books.add(new Book("Beyond good and evil", "Nietzsche", 350,
                "https://upload.wikimedia.org/wikipedia/en/c/ce/BGE-cover.jpg",
                "The Philosophy"));

        adapter.setBooks(books);
    }
}